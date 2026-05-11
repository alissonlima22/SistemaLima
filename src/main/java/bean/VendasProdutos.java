package bean;

import java.math.BigDecimal;

public class VendasProdutos {
    private int ablIdVendasProdutos;
    private int ablVenda;
    private int ablProduto;
    private int ablQuantidade;
    private BigDecimal ablValorUnitario;
    private BigDecimal ablDesconto;
    private BigDecimal ablSubtotal;

    public VendasProdutos() {
    }

    public int getAblIdVendasProdutos() {
        return ablIdVendasProdutos;
    }
    public void setAblIdVendasProdutos(int ablIdVendasProdutos) {
        this.ablIdVendasProdutos = ablIdVendasProdutos;
    }

    public int getAblVenda() {
        return ablVenda;
    }
    public void setAblVenda(int ablVenda) {
        this.ablVenda = ablVenda;
    }

    public int getAblProduto() {
        return ablProduto;
    }
    public void setAblProduto(int ablProduto) {
        this.ablProduto = ablProduto;
    }

    public int getAblQuantidade() {
        return ablQuantidade;
    }
    public void setAblQuantidade(int ablQuantidade) {
        this.ablQuantidade = ablQuantidade;
    }

    public BigDecimal getAblValorUnitario() {
        return ablValorUnitario;
    }
    public void setAblValorUnitario(BigDecimal ablValorUnitario) {
        this.ablValorUnitario = ablValorUnitario;
    }

    public BigDecimal getAblDesconto() {
        return ablDesconto;
    }
    public void setAblDesconto(BigDecimal ablDesconto) {
        this.ablDesconto = ablDesconto;
    }

    public BigDecimal getAblSubtotal() {
        return ablSubtotal;
    }
    public void setAblSubtotal(BigDecimal ablSubtotal) {
        this.ablSubtotal = ablSubtotal;
    }
}