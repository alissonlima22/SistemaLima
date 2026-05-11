package dao;

import bean.ComprasProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasProdutosDAO {

    public void inserir(ComprasProdutos cp) {
        String sql = "INSERT INTO abl_compras_produtos "
                + "(abl_compra, abl_produto, abl_quantidade, abl_valorUnitario, abl_desconto, abl_subtotal) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cp.getAblCompra());
            ps.setInt(2, cp.getAblProduto());
            ps.setInt(3, cp.getAblQuantidade());
            ps.setBigDecimal(4, cp.getAblValorUnitario());
            ps.setBigDecimal(5, cp.getAblDesconto());
            ps.setBigDecimal(6, cp.getAblSubtotal());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir compra produto: " + e.getMessage());
        }
    }
}