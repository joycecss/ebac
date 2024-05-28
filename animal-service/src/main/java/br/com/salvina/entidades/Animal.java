package br.com.salvina.entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal", nullable = false)
    private Long idAnimal;

    @Column(name="tipo_animal", nullable = false)
    private String tipoAnimal;

    @Column(name = "nome_provisorio", nullable = false)
    private String nomeProvisorio;

    @Column(name = "idade_estimada", nullable = false)
    private Integer idadeEstimada;

    @Column(name = "raca", nullable = false)
    private String raca;

    @Column(name = "data_entrada", nullable = false)
    private Date dataEntrada;

    @Column(name = "data_adocao")
    private Date dataAdocao;

    @Column(name = "condicao_chegada", nullable = false)
    private String condicaoChegada;

    @Column(name = "nome_recebedor")
    private String nomeRecebedor;

    @Column(name = "data_obito")
    private Date dataObito;

    @Column(name = "porte", nullable = false)
    private String porte;

    public Long getIdAnimal() {
        return idAnimal;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicaoChegada() {
        return condicaoChegada;
    }

    public void setCondicaoChegada(String condicaoChegada) {
        this.condicaoChegada = condicaoChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
