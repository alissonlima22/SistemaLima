package dao;

import bean.Pets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PetsDAO {

    public void inserir(Pets p) {
        String sql = "INSERT INTO abl_pets "
                + "(abl_nome, abl_especie, abl_raca, abl_sexo, abl_peso, "
                + "abl_cor, abl_dataNascimento, abl_cliente) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getAblNome());
            ps.setString(2, p.getAblEspecie());
            ps.setString(3, p.getAblRaca());
            ps.setString(4, p.getAblSexo());
            ps.setBigDecimal(5, p.getAblPeso());
            ps.setString(6, p.getAblCor());
            ps.setDate(7, p.getAblDataNascimento() != null ? new java.sql.Date(p.getAblDataNascimento().getTime()) : null);
            ps.setInt(8, p.getAblCliente());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir pet: " + e.getMessage());
        }
    }
}