package DAO;

import MODEL.Genero;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author André Luis Schwerz
 */
public class GeneroDAO extends DbConnection{ 
    private Connection conn;
    private final String sqlInsert  = "INSERT INTO Filme.Genero(idGenero, Descricao) VALUES (?,?)";
    private final String sqlUpdate  = "UPDATE Filme.Genero SET idGenero= ?, Descricao= ? WHERE idGenero = ? ";
    private final String sqlRemove  = "DELETE FROM Filme.Genero WHERE idGenero = ?";
    private final String sqlList    = "SELECT idGenero, Descricao FROM Filme.Genero ORDER BY Filme.Genero.idGenero"; // Talvez Genero.Nome 
    private final String sqlFind    = "SELECT idGenero, Descricao FROM Filme.Genero WHERE idGenero = ?";


    public void insert(Genero genero) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, genero.getIdGenero());
            ps.setString(2, genero.getDescricao());
            //ps.setBoolean(3, circuito.isStatus());
            //ps.setString(4, circuito.getCidade());
            //ps.setString(5, circuito.getEstilo());
            ps.execute();
        }
        finally{
            ps.close();
            conn.close();
        }
    }

    public void update(Genero genero, String antigo) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            
            ps.setString(1, genero.getIdGenero());
            ps.setString(2, genero.getDescricao());
            ps.setString(3, antigo);
            //ps.setString(3, genero.getIdGenero());
            
            //ps.setString(1, circuito.getPais().getSigla());
            //ps.setString(2, circuito.getNome());
            //ps.setBoolean(3, circuito.isStatus());
            //ps.setString(4, circuito.getCidade());
            //ps.setString(5, circuito.getEstilo());
            //ps.setInt(6, circuito.getId());

            ps.execute();
        }
        finally{
            ps.close();
            conn.close();
        }
    }
    
    public void remove(String idGenero) throws SQLException{ //talvez com Genero genero
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setString (1, idGenero);
            
            ps.execute();
        }
        finally{
            ps.close();
            conn.close();
        }
    }
    
    public ArrayList<Genero> list() throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Genero> list = new ArrayList<>();
            Genero genero;
            //PaisDAO paisDao = new PaisDAO();
            while (rs.next()){
                genero = new Genero();
                genero.setIdGenero(rs.getString("idGenero"));
                genero.setDescricao(rs.getString("Descricao"));
                //circuito.setNome(rs.getString("nome"));
                //circuito.setStatus(rs.getBoolean("status"));
                //circuito.setCidade(rs.getString("cidade"));
                //circuito.setEstilo(rs.getString("estilo"));

                list.add(genero);
            }
            return list;
        }
        finally{
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public Genero Find(String idGenero)throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, idGenero);

            rs = ps.executeQuery();
            Genero genero = null ;
            //PaisDAO paisDao = new PaisDAO();
            if (rs.next()){
                genero = new Genero();
                genero.setIdGenero(rs.getString("idGenero"));
                genero.setDescricao(rs.getString("idGenero"));
                
                //circuito.setPais(paisDao.find(rs.getString("pais_sigla")));
                //circuito.setNome(rs.getString("nome"));
                //circuito.setStatus(rs.getBoolean("status"));
                //circuito.setCidade(rs.getString("cidade"));
                //circuito.setEstilo(rs.getString("estilo"));
            }
            return genero;
        }
        finally{
            rs.close();
            ps.close();
            conn.close();
        }
    }
}