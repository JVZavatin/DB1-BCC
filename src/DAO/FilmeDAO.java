package DAO;

import MODEL.Filme;

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
public class FilmeDAO extends DbConnection {
     // NomeFilme="Batata batatao",  DataNascimento='2000/01/01', Pais_Sigla= "fsf" where NomeFilme ="Batata batatao"
    //SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");

    // Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano
    
    private Connection conn;
    private final String sqlInsert = "INSERT INTO Filme.Filme (Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano) VALUES (?,?,?,?)";
    private final String sqlUpdate = "UPDATE Filme.Filme SET  Produtora_idNomeProdutora=?, Diretor_NomeDiretor=?, Ano=? WHERE Nome = ?"; // nome eh a chave primaria......
    private final String sqlRemove = "DELETE FROM Filme.Filme WHERE Nome = ?";
    private final String sqlList = "SELECT Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano FROM Filme.Filme ORDER BY Nome";
    private final String sqlFind = "SELECT Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano FROM Filme.Filme WHERE Nome = ?";


    public void insert(Filme filme) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, filme.getNome());   
            ps.setString(2, filme.getProdutora().getNome()); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            ps.setString(3, filme.getDiretor().getNome());
            ps.setInt(4, filme.getAno());
            
            // Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano
           
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public void update(Filme filme) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps=conn.prepareStatement(sqlUpdate);
            ps.setString(4, filme.getNome());   
            ps.setString(1, filme.getProdutora().getNome()); // .getPais().getSigla() usar simple date format pra passar pra string aqui
            ps.setString(2, filme.getDiretor().getNome());
            ps.setInt(3, filme.getAno());
            
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

    public ArrayList<Filme> list() throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Filme> list = new ArrayList<>();
            Filme filme;

            
            DiretorDAO diretorDAO = new DiretorDAO();
            ProdutoraDAO produtoraDAO = new ProdutoraDAO();
            Object object = new Object();
            // Nome, Produtora_idNomeProdutora, Diretor_NomeDiretor, Ano
            

            while (rs.next()) {
                filme = new Filme();
                filme.setNome(rs.getString("Nome"));
                
                filme.setDiretor(diretorDAO.find(rs.getString("Diretor_NomeDiretor")));
                filme.setAno(rs.getInt("Ano"));
                filme.setProdutora(produtoraDAO.find(rs.getString("Produtora_idNomeProdutora")));
                //piloto.setPais(paisDao.find(rs.getString("pais_sigla")));
                //piloto.setNome(rs.getString("nome"));
                //piloto.setStatus(rs.getBoolean("status"));
                list.add(filme);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Filme find(String nome) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            Filme filme = null;
            
            DiretorDAO diretorDAO = new DiretorDAO();
            ProdutoraDAO produtoraDAO = new ProdutoraDAO();
            
            if (rs.next()) {
                filme = new Filme();
                filme.setNome(rs.getString("Nome"));
                
                filme.setDiretor(diretorDAO.find(rs.getString("Diretor_NomeDiretor")));
                filme.setAno(rs.getInt("Ano"));
                filme.setProdutora(produtoraDAO.find(rs.getString("Produtora_idNomeProdutora")));
            }
            return filme;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

}