package bean;

import java.math.BigDecimal;
import java.util.Date;

public class Pets {
    private int ablIdPets;
    private String ablNome;
    private String ablEspecie;
    private String ablRaca;
    private String ablSexo;
    private BigDecimal ablPeso;
    private String ablCor;
    private Date ablDataNascimento;
    private int ablCliente;

    public Pets() {
    }

    public int getAblIdPets() {
        return ablIdPets;
    }
    public void setAblIdPets(int ablIdPets) {
        this.ablIdPets = ablIdPets;
    }

    public String getAblNome() {
        return ablNome;
    }
    public void setAblNome(String ablNome) {
        this.ablNome = ablNome;
    }

    public String getAblEspecie() {
        return ablEspecie;
    }
    public void setAblEspecie(String ablEspecie) {
        this.ablEspecie = ablEspecie;
    }

    public String getAblRaca() {
        return ablRaca;
    }
    public void setAblRaca(String ablRaca) {
        this.ablRaca = ablRaca;
    }

    public String getAblSexo() {
        return ablSexo;
    }
    public void setAblSexo(String ablSexo) {
        this.ablSexo = ablSexo;
    }

    public BigDecimal getAblPeso() {
        return ablPeso;
    }
    public void setAblPeso(BigDecimal ablPeso) {
        this.ablPeso = ablPeso;
    }

    public String getAblCor() {
        return ablCor;
    }
    public void setAblCor(String ablCor) {
        this.ablCor = ablCor;
    }

    public Date getAblDataNascimento() {
        return ablDataNascimento;
    }
    public void setAblDataNascimento(Date ablDataNascimento) {
        this.ablDataNascimento = ablDataNascimento;
    }

    public int getAblCliente() {
        return ablCliente;
    }
    public void setAblCliente(int ablCliente) {
        this.ablCliente = ablCliente;
    }
}