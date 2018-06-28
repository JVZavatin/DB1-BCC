package DAO;

import MODEL.Diretor;

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
public class DiretorDAO extends DbConnection {
     // NomeDiretor="Batata batatao",  DataNascimento='2000/01/01', Pais_Sigla= "fsf" where NomeDiretor ="Batata batatao"
    SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");

    private Connection conn;
    private final String sqlInsert = "INSERT INTO Filme.Diretor (NomeDiretor, DataNascimento, Pais_Sigla) VALUES (?,?,?)";
    private final String sqlUpdate = "UPDATE Filme.Diretor SET DataNascimento= ?, Pais_Sigla= ? WHERE NomeDiretor = ?"; // nome eh a chave primaria......
    private final String sqlRemove = "DELETE FROM Filme.Diretor WHERE NomeDiretor = ?";
    private final String sqlList = "SELECT NomeDiretor, DataNascimento, Pais_Sigla FROM Filme.Diretor ORDER BY NomeDiretor";
    private final String sqlFind = "SELECT NomeDiretor, DataNascimento, Pais_Sigla FROM Filme.Diretor WHERE NomeDiretor = ?";


    public void insert(Diretor diretor) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, diretor.getNome());
            ps.setString(2, diretor.getStringDataNasc()); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            //String teste=formatter.format(diretor.getDataNasc());
            //System.out.println(teste);
            ps.setString(3, diretor.getPais().getSigla());
            //ps.setBoolean(4, piloto.isStatus());
            
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public void update(Diretor diretor) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps=conn.prepareStatement(sqlUpdate);
            ps.setString(1, formatter.format(diretor.getDataNasc())); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            ps.setString(2, diretor.getPais().getSigla());
            ps.setString(3, diretor.getNome());
            
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

    public ArrayList<Diretor> list() throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Diretor> list = new ArrayList<>();
            Diretor diretor;

            DiretorDAO diretorDao = new DiretorDAO();
            PaisDAO paisDAO = new PaisDAO();

            while (rs.next()) {
                diretor = new Diretor();
                diretor.setNome(rs.getString("NomeDiretor"));
                String sData= rs.getString("DataNascimento");
                Date data=null;
                try {
                    data = formatter.parse(sData);
                    diretor.setDataNasc(formatter.parse(rs.getString("DataNascimento")));
                }
                catch (ParseException e) {
                    
                }
                
                diretor.setDataNasc(data);
                diretor.setPais(paisDAO.find(rs.getString("Pais_Sigla")));
                //piloto.setPais(paisDao.find(rs.getString("pais_sigla")));
                //piloto.setNome(rs.getString("nome"));
                //piloto.setStatus(rs.getBoolean("status"));
                list.add(diretor);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Diretor find(String nome) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            Diretor diretor = null;
            PaisDAO paisDAO = new PaisDAO();
            //EquipeDAO equipeDao = new EquipeDAO();
            if (rs.next()) {
                diretor = new Diretor();
                diretor.setNome(rs.getString("NomeDiretor"));
                String sData= rs.getString("DataNascimento");
                Date data=null;
                try {
                    data = formatter.parse(sData);
                    diretor.setDataNasc(formatter.parse(rs.getString("DataNascimento")));
                }
                catch (ParseException e) {
                    
                }
                
                diretor.setDataNasc(data);
                diretor.setPais(paisDAO.find(rs.getString("Pais_Sigla")));
            }
            return diretor;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

}