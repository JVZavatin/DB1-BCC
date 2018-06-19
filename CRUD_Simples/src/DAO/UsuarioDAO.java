package DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MODEL.Usuario;

/**
 * @author André Schwerz
 */
public class UsuarioDAO extends DbConnection {/*

    private Connection conn;
    private final String sqlInsert = "INSERT INTO Usuario(login, senha, nome) VALUES (?,?,?)";
    private final String sqlUpdate = "UPDATE Usuario SET senha= ?, nome = ? WHERE login = ? ";
    private final String sqlRemove = "DELETE FROM Usuario WHERE login = ?";
    private final String sqlList = "SELECT login, senha, nome FROM Usuario ORDER BY Usuario.nome";
    private final String sqlFind = "SELECT login, senha, nome FROM Usuario WHERE login = ? and senha = ?";

    public void insert(Usuario usuario) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.execute();
        } finally {
            ps.close();
            conn.close();
        }
    }

    public void update(Usuario usuario) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, usuario.getSenha());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getLogin());
            ps.execute();
        } finally {
            ps.close();
            conn.close();
        }
    }

    public void remove(String login) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setString(1, login);
            ps.execute();
        } finally {
            ps.close();
            conn.close();
        }
    }

    public List<Usuario> list() throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Usuario> list = new ArrayList<>();
            Usuario usuario;

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setNome(rs.getString("nome"));
                list.add(usuario);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public Usuario Find(String login, String senha) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setString(1, login);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            Usuario usuario = null;

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setNome(rs.getString("nome"));
            }
            return usuario;
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }
*/
}
