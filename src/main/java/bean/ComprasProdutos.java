package bean;

import java.math.BigDecimal;

public class ComprasProdutos {
    private int ablIdComprasProdutos;
    private int ablCompra;
    private int ablProduto;
    private int ablQuantidade;
    private BigDecimal ablValorUnitario;
    private BigDecimal ablDesconto;
    private BigDecimal ablSubtotal;

    public ComprasProdutos() {
    }

    public int getAblIdComprasProdutos() {
        return ablIdComprasProdutos;
    }
    public void setAblIdComprasProdutos(int ablIdComprasProdutos) {
        this.ablIdComprasProdutos = ablIdComprasProdutos;
    }

    public int getAblCompra() {
        return ablCompra;
    }
    public void setAblCompra(int ablCompra) {
        this.ablCompra = ablCompra;
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