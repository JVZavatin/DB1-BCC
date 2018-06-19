package DAO;

//import MODEL.Piloto; --> ATOR
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
public class PilotoDAO extends DbConnection {/*

    private Connection conn;
    private final String sqlInsert = "INSERT INTO Piloto(nome, equipe_id, pais_sigla, status) VALUES (?,?,?,?)";
    private final String sqlUpdate = "UPDATE Piloto SET nome= ?, equipe_id= ?, pais_sigla= ?, status= ?  WHERE id = ?";
    private final String sqlRemove = "DELETE FROM Piloto WHERE id = ?";
    private final String sqlList = "SELECT id, pais_sigla, equipe_id, nome, status FROM Piloto ORDER BY nome";
    private final String sqlFind = "SELECT id, pais_sigla, equipe_id, nome, status FROM Piloto WHERE id = ?";

    public void insert(Piloto piloto) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, piloto.getNome());
            ps.setInt(2, piloto.getEquipeAtual().getId());
            ps.setString(3, piloto.getPais().getSigla());
            ps.setBoolean(4, piloto.isStatus());
            ps.execute();
        } finally {
            ps.close();
            close(conn);
        }
    }

    public void update(Piloto piloto) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, piloto.getNome());
            ps.setInt(2, piloto.getEquipeAtual().getId());
            ps.setString(3, piloto.getPais().getSigla());
            ps.setBoolean(4, piloto.isStatus());
            ps.setInt(5, piloto.getId());
            ps.execute();
        } finally {
            ps.close();
            close(conn);
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
            close(conn);
        }
    }

    public ArrayList<Piloto> list() throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Piloto> list = new ArrayList<>();
            Piloto piloto;

            PaisDAO paisDao = new PaisDAO();
            EquipeDAO equipeDAO = new EquipeDAO();

            while (rs.next()) {
                piloto = new Piloto();
                piloto.setId(rs.getInt("id"));
                piloto.setEquipeAtual(equipeDAO.find(rs.getInt("equipe_id")));
                piloto.setPais(paisDao.find(rs.getString("pais_sigla")));
                piloto.setNome(rs.getString("nome"));
                piloto.setStatus(rs.getBoolean("status"));
                list.add(piloto);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }

    public Piloto find(int id) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Piloto piloto = null;
            PaisDAO paisDao = new PaisDAO();
            EquipeDAO equipeDao = new EquipeDAO();
            if (rs.next()) {
                piloto = new Piloto();
                piloto.setId(rs.getInt("id"));
                piloto.setEquipeAtual(equipeDao.find(rs.getInt("equipe_id")));
                piloto.setPais(paisDao.find(rs.getString("pais_sigla")));
                piloto.setNome(rs.getString("nome"));
                piloto.setStatus(rs.getBoolean("status"));
            }
            return piloto;
        } finally {
            rs.close();
            ps.close();
            close(conn);
        }
    }
*/
}