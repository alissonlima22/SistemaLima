package dao;

import bean.Fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedoresDAO {

    public void inserir(Fornecedores f) {
        String sql = "INSERT INTO abl_fornecedores "
                + "(abl_razaoSocial, abl_nomeFantasia, abl_cnpj, abl_inscricaoEstadual, "
                + "abl_telefone, abl_celular, abl_email, abl_cep, abl_endereco, "
                + "abl_numero, abl_bairro, abl_cidade, abl_dataCadastro, abl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, f.getRazaoSocial());
            ps.setString(2, f.getNomeFantasia());
            ps.setString(3, f.getCnpj());
            ps.setString(4, f.getInscricaoEstadual());
            ps.setString(5, f.getTelefone());
            ps.setString(6, f.getCelular());
            ps.setString(7, f.getEmail());
            ps.setString(8, f.getCep());
            ps.setString(9, f.getEndereco());
            ps.setString(10, f.getNumero());
            ps.setString(11, f.getBairro());
            ps.setString(12, f.getCidade());
            ps.setDate(13, f.getDataCadastro() != null ? new java.sql.Date(f.getDataCadastro().getTime()) : null);
            ps.setString(14, f.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());
        }
    }
}