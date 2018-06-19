package DAO;

import MODEL.Equipe;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author André Schwerz
 */
public class EquipeDAO extends DbConnection{/*
    private Connection conn;
    private final String sqlInsert = "INSERT INTO Equipe(pais_sigla, nome, status, diretor) VALUES (?,?,?,?)";
    private final String sqlUpdate = "UPDATE Equipe SET pais_sigla= ?, nome = ?, status = ?, diretor = ?  WHERE id = ? ";
    private final String sqlRemove = "DELETE FROM Equipe WHERE id = ?";
    private final String sqlList   = "SELECT id, pais_sigla, nome, status, diretor FROM Equipe ORDER BY nome";
    private final String sqlFind   = "SELECT id, pais_sigla, nome, status, diretor FROM Equipe WHERE id = ?";


    public void insert(Equipe equipe) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
        
            ps.setString(1, equipe.getPais().getSigla());
            ps.setString(2, equipe.getNome());
            ps.setBoolean(3, equipe.isStatus());
            ps.setString(4, equipe.getDiretor());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }        
    }

    public void update(Equipe equipe) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, equipe.getPais().getSigla());
            ps.setString(2, equipe.getNome());
            ps.setBoolean(3, equipe.isStatus());
            ps.setString(4, equipe.getDiretor());
            ps.setInt(5, equipe.getId());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    public void remove(int id) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setInt(1, id);
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }

    }
    public ArrayList<Equipe> list() throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Equipe> list = new ArrayList<>();
            Equipe equipe;
            PaisDAO paisDao = new PaisDAO();
            while (rs.next()){
                equipe = new Equipe();
                equipe.setId(rs.getInt("id"));
                equipe.setPais(paisDao.find(rs.getString("pais_sigla")));
                equipe.setNome(rs.getString("nome"));
                equipe.setStatus(rs.getBoolean("status"));
                equipe.setDiretor(rs.getString("diretor"));
                list.add(equipe);
            }
            return list;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Equipe find(int id)throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            Equipe equipe = null ;
            PaisDAO paisDao = new PaisDAO();
            if (rs.next()){
                equipe = new Equipe();
                equipe.setId(rs.getInt("id"));
                equipe.setPais(paisDao.find(rs.getString("pais_sigla")));
                equipe.setNome(rs.getString("nome"));
                equipe.setStatus(rs.getBoolean("status"));
                equipe.setDiretor(rs.getString("diretor"));
            }
            return equipe;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
        
    }
*/
}