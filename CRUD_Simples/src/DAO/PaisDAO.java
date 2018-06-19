package DAO;

import MODEL.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author André  Schwerz
 */
public class PaisDAO extends DbConnection{/*
    private Connection conn;
    private final String sqlInsert = "INSERT INTO Pais (sigla, nome) VALUES (?,?)";
    private final String sqlUpdate = "UPDATE Pais SET nome = ? WHERE sigla = ? ";
    private final String sqlRemove = "DELETE FROM Pais WHERE sigla = ?";
    private final String sqlList   = "SELECT sigla, nome FROM Pais ORDER BY nome";
    private final String sqlFind   = "SELECT sigla, nome FROM Pais WHERE sigla = ?";

    public void insert(Pais pais) throws SQLException{
        conn = connect();
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, pais.getSigla());
            ps.setString(2, pais.getNome());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
        
    }
    
    public void update(Pais pais) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, pais.getNome());
            ps.setString(2, pais.getSigla());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    
    public void remove(String sigla) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setString(1, sigla);
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }

    }
    
    public ArrayList<Pais> list() throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Pais> list = new ArrayList<>();
            Pais pais;
            while (rs.next()){
                pais = new Pais();
                pais.setSigla(rs.getString("sigla"));
                pais.setNome(rs.getString("nome"));
                list.add(pais);
            }
            return list;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Pais find(String sigla)throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, sigla);

            rs = ps.executeQuery();
            Pais pais = null ;

            if (rs.next()){
                pais = new Pais();
                pais.setSigla(rs.getString("sigla"));
                pais.setNome(rs.getString("nome"));
            }
            return pais;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }       
    }
*/
}