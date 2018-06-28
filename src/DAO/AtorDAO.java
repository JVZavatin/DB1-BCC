package DAO;

import MODEL.Ator;

import DAO.DbConnection;
import DAO.PaisDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author André Schwerz
 */
public class AtorDAO extends DbConnection {
     // NomeAtor="Batata batatao",  DataNascimento='2000/01/01', Pais_Sigla= "fsf" where NomeAtor ="Batata batatao"
    SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");

    private Connection conn;
    private final String sqlInsert = "INSERT INTO Filme.Ator (NomeAtor, DataNascimento, Pais_Sigla) VALUES (?,?,?)";
    private final String sqlUpdate = "UPDATE Filme.Ator SET DataNascimento= ?, Pais_Sigla= ? WHERE NomeAtor = ?"; // nome eh a chave primaria......
    private final String sqlRemove = "DELETE FROM Filme.Ator WHERE NomeAtor = ?";
    private final String sqlList = "SELECT NomeAtor, DataNascimento, Pais_Sigla FROM Filme.Ator ORDER BY NomeAtor";
    private final String sqlFind = "SELECT NomeAtor, DataNascimento, Pais_Sigla FROM Filme.Ator WHERE NomeAtor = ?";


    public void insert(Ator ator) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, ator.getNome());
            ps.setString(2, ator.getStringDataNasc()); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            //String teste=formatter.format(ator.getDataNasc());
            //System.out.println(teste);
            ps.setString(3, ator.getPais().getSigla());
            //ps.setBoolean(4, piloto.isStatus());
            
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public void update(Ator ator) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps=conn.prepareStatement(sqlUpdate);
            ps.setString(1, formatter.format(ator.getDataNasc())); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            ps.setString(2, ator.getPais().getSigla());
            ps.setString(3, ator.getNome());
            
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public void remove(String nome) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setString(1, nome);
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public ArrayList<Ator> list() throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Ator> list = new ArrayList<>();
            Ator ator;

            AtorDAO atorDao = new AtorDAO();
            PaisDAO paisDAO = new PaisDAO();

            while (rs.next()) {
                ator = new Ator();
                ator.setNome(rs.getString("NomeAtor"));
                String sData= rs.getString("DataNascimento");
                Date data=null;
                try {
                    data = formatter.parse(sData);
                    ator.setDataNasc(formatter.parse(rs.getString("DataNascimento")));
                }
                catch (ParseException e) {
                    
                }
                
                ator.setDataNasc(data);
                ator.setPais(paisDAO.find(rs.getString("Pais_Sigla")));
                //piloto.setPais(paisDao.find(rs.getString("pais_sigla")));
                //piloto.setNome(rs.getString("nome"));
                //piloto.setStatus(rs.getBoolean("status"));
                list.add(ator);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Ator find(String nome) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            Ator ator = null;
            PaisDAO paisDAO = new PaisDAO();
            //EquipeDAO equipeDao = new EquipeDAO();
            if (rs.next()) {
                ator = new Ator();
                ator.setNome(rs.getString("NomeAtor"));
                String sData= rs.getString("DataNascimento");
                Date data=null;
                try {
                    data = formatter.parse(sData);
                    ator.setDataNasc(formatter.parse(rs.getString("DataNascimento")));
                }
                catch (ParseException e) {
                    
                }
                
                ator.setDataNasc(data);
                ator.setPais(paisDAO.find(rs.getString("Pais_Sigla")));
            }
            return ator;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

}