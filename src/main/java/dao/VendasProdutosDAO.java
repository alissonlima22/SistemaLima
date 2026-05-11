package dao;

import bean.VendasProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasProdutosDAO {

    public void inserir(VendasProdutos vp) {
        String sql = "INSERT INTO abl_vendas_produtos "
                + "(abl_venda, abl_produto, abl_quantidade, abl_valorUnitario, abl_desconto, abl_subtotal) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, vp.getAblVenda());
            ps.setInt(2, vp.getAblProduto());
            ps.setInt(3, vp.getAblQuantidade());
            ps.setBigDecimal(4, vp.getAblValorUnitario());
            ps.setBigDecimal(5, vp.getAblDesconto());
            ps.setBigDecimal(6, vp.getAblSubtotal());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir venda produto: " + e.getMessage());
        }
    }
}