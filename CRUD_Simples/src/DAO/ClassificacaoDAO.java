package DAO;

import MODEL.Equipe;
//import MODEL.Piloto;
import MODEL.Classificacao;
import MODEL.Prova;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ClassificacaoDAO extends DbConnection { /*

    private Connection conn;
    private final String sqlInsert = "INSERT INTO PosPilProva(piloto_id, equipe_id, prova_id, tempo) VALUES (?,?,?,?)";
    private final String sqlRemove = "DELETE FROM PosPilProva WHERE piloto_id = ? AND equipe_id = ? AND prova_id = ?";
    private final String sqlList = "SELECT piloto_id, equipe_id, prova_id, tempo FROM PosPilProva ORDER BY piloto_id, piloto_id";
    private final String sqlFind = "SELECT piloto_id, equipe_id, prova_id, tempo FROM PosPilProva WHERE piloto_id = ? AND  equipe_id = ? AND prova_id = ?";
    private final String sqlNotPilProva = "SELECT id, pais_sigla, equipe_id, nome, status FROM Piloto pil WHERE status=1 AND pil.id NOT IN (SELECT p.piloto_id FROM PosPilProva p WHERE p.prova_id = ?) ORDER BY pil.nome";

    public void insert(Classificacao posPilProva) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setInt(1, posPilProva.getPiloto().getId());
            ps.setInt(2, posPilProva.getEquipe().getId());
            ps.setInt(3, posPilProva.getProva().getId());
            ps.setTime(4, posPilProva.getTempo());
            ps.execute();
        } finally {
            ps.close();
            conn.close();
        }
    }

    public void remove(Classificacao posPilProva) throws SQLException {
        PreparedStatement ps = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setInt(1, posPilProva.getPiloto().getId());
            ps.setInt(2, posPilProva.getEquipe().getId());
            ps.setInt(3, posPilProva.getProva().getId());
            ps.execute();
        } finally {
            ps.close();
            conn.close();
        }
    }

    public List<Classificacao> list() throws SQLException, ClassNotFoundException, ParseException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Classificacao> list = new ArrayList<>();
            Classificacao classificacao;

            PilotoDAO pilotoDAO = new PilotoDAO();
            EquipeDAO equipeDao = new EquipeDAO();
            ProvaDAO provaDao = new ProvaDAO();

            while (rs.next()) {
                classificacao = new Classificacao();

                classificacao.setPiloto(pilotoDAO.find(rs.getInt("piloto_id")));
                classificacao.setEquipe(equipeDao.find(rs.getInt("equipe_id")));
                classificacao.setProva(provaDao.find(rs.getInt("prova_id")));
                classificacao.setTempo(rs.getTime("tempo"));
                list.add(classificacao);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public Classificacao find(Piloto piloto, Equipe equipe, Prova prova) throws SQLException, ClassNotFoundException, ParseException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlFind);

            ps.setInt(1, piloto.getId());
            ps.setInt(2, equipe.getId());
            ps.setInt(3, prova.getId());

            rs = ps.executeQuery();

            Classificacao classificacao = null;

            PilotoDAO pilotoDAO = new PilotoDAO();
            EquipeDAO equipeDao = new EquipeDAO();
            ProvaDAO provaDao = new ProvaDAO();

            if (rs.next()) {
                classificacao = new Classificacao();
                classificacao.setPiloto(pilotoDAO.find(rs.getInt("piloto_id")));
                classificacao.setEquipe(equipeDao.find(rs.getInt("equipe_id")));
                classificacao.setProva(provaDao.find(rs.getInt("prova_id")));
                classificacao.setTempo(rs.getTime("tempo"));
            }
            return classificacao;
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public List<Piloto> listNotPilProva(int prova_id) throws SQLException, ClassNotFoundException, ParseException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connect();
            ps = conn.prepareStatement(sqlNotPilProva);
            ps.setInt(1, prova_id);
            rs = ps.executeQuery();
            ArrayList<Piloto> list = new ArrayList<>();
            PaisDAO paisDao = new PaisDAO();
            EquipeDAO equipeDao = new EquipeDAO();
            while (rs.next()) {
                Piloto piloto = new Piloto();
                piloto.setId(rs.getInt("id"));
                piloto.setPais(paisDao.find(rs.getString("pais_sigla")));
                piloto.setEquipeAtual(equipeDao.find(rs.getInt("equipe_id")));
                piloto.setNome(rs.getString("nome"));
                piloto.setStatus(rs.getBoolean("status"));
                list.add(piloto);
            }
            return list;
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }
*/
}