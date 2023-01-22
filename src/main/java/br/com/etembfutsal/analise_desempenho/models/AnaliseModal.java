package br.com.etembfutsal.analise_desempenho.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity(name = "tb_analise_atletas")
@Table(name = "TB_ANALISE_ATLETAS")
@SequenceGenerator(name = "seq_atleta", sequenceName = "seq_atleta", allocationSize = 1, initialValue = 1)
public class AnaliseModal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_atleta")
    private long id;
    @Column(nullable = false, length = 150)
    private String nomeAtleta;
    @Column(nullable = false, length = 100)
    private String apelidoAtleta;
    @Column(nullable = false, length = 30)
    private String posicaoAtleta;
    @Column(nullable = false)
    private Date dtNascimentoAtleta;
    @Column(nullable = false)
    private String paisNascimentoAtleta;
    @Column(nullable = false, length = 20)
    private String pernaAtleta;
    @Column(nullable = false, length = 10)
    private Double pesoAtleta;
    @Column(nullable = false, length = 10)
    private Double alturaAtleta;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getApelidoAtleta() {
        return apelidoAtleta;
    }

    public void setApelidoAtleta(String apelidoAtleta) {
        this.apelidoAtleta = apelidoAtleta;
    }

    public String getPosicaoAtleta() {
        return posicaoAtleta;
    }

    public void setPosicaoAtleta(String posicaoAtleta) {
        this.posicaoAtleta = posicaoAtleta;
    }

    public Date getDtNascimentoAtleta() {
        return dtNascimentoAtleta;
    }

    public void setDtNascimentoAtleta(Date dtNascimentoAtleta) {
        this.dtNascimentoAtleta = dtNascimentoAtleta;
    }

    public String getPaisNascimentoAtleta() {
        return paisNascimentoAtleta;
    }

    public void setPaisNascimentoAtleta(String paisNascimentoAtleta) {
        this.paisNascimentoAtleta = paisNascimentoAtleta;
    }

    public String getPernaAtleta() {
        return pernaAtleta;
    }

    public void setPernaAtleta(String pernaAtleta) {
        this.pernaAtleta = pernaAtleta;
    }

    public Double getPesoAtleta() {
        return pesoAtleta;
    }

    public void setPesoAtleta(Double pesoAtleta) {
        this.pesoAtleta = pesoAtleta;
    }

    public Double getAlturaAtleta() {
        return alturaAtleta;
    }

    public void setAlturaAtleta(Double alturaAtleta) {
        this.alturaAtleta = alturaAtleta;
    }
}
