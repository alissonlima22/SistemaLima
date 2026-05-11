package dao;

import bean.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDAO {

    public void inserir(Clientes c) {
        String sql = "INSERT INTO abl_clientes "
                + "(abl_nome, abl_cpf, abl_rg, abl_email, abl_cep, abl_endereco, "
                + "abl_numero, abl_bairro, abl_dataNascimento, abl_telefone, "
                + "abl_celular, abl_cidade, abl_dataCadastro, abl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getRg());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getCep());
            ps.setString(6, c.getEndereco());
            ps.setString(7, c.getNumero());
            ps.setString(8, c.getBairro());
            ps.setDate(9, c.getDataNascimento() != null ? new java.sql.Date(c.getDataNascimento().getTime()) : null);
            ps.setString(10, c.getTelefone());
            ps.setString(11, c.getCelular());
            ps.setString(12, c.getCidade());
            ps.setDate(13, c.getDataCadastro() != null ? new java.sql.Date(c.getDataCadastro().getTime()) : null);
            ps.setString(14, c.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }
}