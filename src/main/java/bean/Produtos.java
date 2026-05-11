package bean;

import java.math.BigDecimal;

public class Produtos {
    private int idProdutos;
    private String nome;
    private String marca;
    private String categoria;
    private String descricao;
    private BigDecimal precoCompra;
    private BigDecimal precoVenda;
    private String ativo;

    public Produtos() {
    }

    public int getIdProdutos() {
        return idProdutos;
    }
    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getAtivo() {
        return ativo;
    }
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}