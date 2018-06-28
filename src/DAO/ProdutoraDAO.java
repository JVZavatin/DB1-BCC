package DAO;

import MODEL.Produtora;

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
public class ProdutoraDAO extends DbConnection {
     // NomeProdutora="Batata batatao",  DataNascimento='2000/01/01', Pais_Sigla= "fsf" where NomeProdutora ="Batata batatao"
    SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");

    private Connection conn;
    private final String sqlInsert = "INSERT INTO Filme.Produtora (idNomeProdutora, Pais_Sigla) VALUES (?,?)";
    private final String sqlUpdate = "UPDATE Filme.Produtora SET Pais_Sigla= ? WHERE idNomeProdutora = ?"; // nome eh a chave primaria......
    private final String sqlRemove = "DELETE FROM Filme.Produtora WHERE idNomeProdutora = ?";
    private final String sqlList = "SELECT idNomeProdutora, Pais_Sigla FROM Filme.Produtora ORDER BY idNomeProdutora";
    private final String sqlFind = "SELECT idNomeProdutora, Pais_Sigla FROM Filme.Produtora WHERE idNomeProdutora = ?";


    public void insert(Produtora produtora) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, produtora.getNome());
            //ps.setString(2, produtora.getStringDataNasc()); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            //String teste=formatter.format(produtora.getDataNasc());
            //System.out.println(teste);
            ps.setString(2, produtora.getPais().getSigla());
            //ps.setBoolean(4, piloto.isStatus());
            
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public void update(Produtora produtora) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps=conn.prepareStatement(sqlUpdate);
            //ps.setString(1, formatter.format(produtora.getDataNasc())); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            ps.setString(1, produtora.getPais().getSigla());
            ps.setString(2, produtora.getNome());
            
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

    public ArrayList<Produtora> list() throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Produtora> list = new ArrayList<>();
            Produtora produtora;

            PaisDAO paisDAO = new PaisDAO();

            while (rs.next()) {
                produtora = new Produtora();
                produtora.setNome(rs.getString("idNomeProdutora"));
                
                produtora.setPais(paisDAO.find(rs.getString("Pais_Sigla")));
                
                list.add(produtora);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Produtora find(String nome) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            Produtora produtora = null;
            PaisDAO paisDAO = new PaisDAO();
            
            if (rs.next()) {
                produtora = new Produtora();
                produtora.setNome(rs.getString("idNomeProdutora"));
                produtora.setPais(paisDAO.find(rs.getString("Pais_Sigla")));
            }
            return produtora;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

}