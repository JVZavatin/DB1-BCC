package DAO;

import MODEL.Prova;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author André Schwerz
 */
public class ProvaDAO extends DbConnection {/*

    private Connection conn;
    private final String sqlInsert = "INSERT INTO Prova(circuito_id, gp, data, duracao, numvoltas, extensao) VALUES (?,?,?,?,?,?)";
    private final String sqlUpdate = "UPDATE Prova SET circuito_id= ?, gp= ?, data= ?, duracao= ? , numvoltas= ?, extensao= ? WHERE id = ?";
    private final String sqlRemove = "DELETE FROM Prova WHERE id = ?";
    private final String sqlList = "SELECT id, circuito_id, gp, data, duracao, numvoltas, extensao FROM Prova ORDER BY data desc";
    private final String sqlFind = "SELECT id, circuito_id, gp, data, duracao, numvoltas, extensao FROM Prova WHERE id = ?";

    public void insert(Prova prova) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setInt(1, prova.getCircuito().getId());
            ps.setString(2, prova.getGp());
            ps.setString(3, prova.getDataMySQL());
            ps.setTime(4, prova.getDuracao());
            ps.setInt(5, prova.getNumVoltas());
            ps.setInt(6, prova.getExtensao());
            ps.execute();
        } finally {
            ps.close();
        }
    }

    public void update(Prova prova) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setInt(1, prova.getCircuito().getId());
            ps.setString(2, prova.getGp());
            ps.setString(3, prova.getDataMySQL());
            ps.setTime(4, prova.getDuracao());
            ps.setInt(5, prova.getNumVoltas());
            ps.setInt(6, prova.getExtensao());
            ps.setInt(7, prova.getId());
            ps.execute();
        } finally {
            ps.close();
        }
    }

    public void remove(int id) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setInt(1, id);
            ps.execute();
        } finally {
            ps.close();
        }
    }

    public List<Prova> list() throws SQLException, ClassNotFoundException, ParseException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            List<Prova> list = new ArrayList<>();
            Prova prova;
            CircuitoDAO circuitoDao = new CircuitoDAO();
            while (rs.next()) {
                prova = new Prova();
                prova.setId(rs.getInt("id"));
                prova.setCircuito(circuitoDao.Find(rs.getInt("circuito_id")));
                prova.setGp(rs.getString("gp"));
                prova.setDataMySQL(rs.getString("data"));
                prova.setDuracao(rs.getTime("duracao"));
                prova.setExtensao(rs.getInt("extensao"));
                prova.setNumVoltas(rs.getInt("numvoltas"));
                list.add(prova);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
        }
    }

    public Prova find(int id) throws SQLException, ClassNotFoundException, ParseException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sqlFind);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Prova prova = new Prova();
            CircuitoDAO circuitoDao = new CircuitoDAO();

            if (rs.next()) {
                prova.setId(rs.getInt("id"));
                prova.setCircuito(circuitoDao.Find(rs.getInt("circuito_id")));
                prova.setGp(rs.getString("gp"));
                prova.setDataMySQL(rs.getString("data"));
                prova.setDuracao(rs.getTime("duracao"));
                prova.setExtensao(rs.getInt("extensao"));
                prova.setNumVoltas(rs.getInt("numvoltas"));
            }
            return prova;
        } finally {
            rs.close();
            ps.close();
        }
    }
*/
}