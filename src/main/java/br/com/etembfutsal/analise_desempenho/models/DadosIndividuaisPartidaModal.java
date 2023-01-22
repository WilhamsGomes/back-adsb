package br.com.etembfutsal.analise_desempenho.models;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tb_dados_individuais_partida")
@Table(name = "TB_DADOS_INDIVIDUAIS_PARTIDA")
@SequenceGenerator(name = "seq_historico_individual", sequenceName = "seq_historico_individual", allocationSize = 1, initialValue = 1)
public class DadosIndividuaisPartidaModal {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historico_individual")
    private long id;

//    @Column(nullable = false)
//    private Long fkAtleta;
    @Column(nullable = false)
    private Long golsFeitos;
    @Column(nullable = false)
    private Long assistencias;
    @Column(nullable = false)
    private Long chancesReaisCriadas;
    @Column(nullable = false)
    private Long chancesReaisPerdidas;
    @Column(nullable = false)
    private Long faltasCometidas;
    @Column(nullable = false)
    private Long cartoesAmarelo;
    @Column(nullable = false)
    private Long cartoesVermelho;
    @Column(nullable = false)
    private Double minJogados;
    @Column(nullable = false)
    private String nmAtleta;
    @Column(nullable = false)
    private String nmAdversario;
    //@Column(nullable = false)
    //private Long fkPartida;

//    public Long getFkPartida() {
//        return fkPartida;
//    }
//
//    public void setFkPartida(Long fkPartida) {
//        this.fkPartida = fkPartida;
//    }


    public String getNmAtleta() {
        return nmAtleta;
    }

    public void setNmAtleta(String nmAtleta) {
        this.nmAtleta = nmAtleta;
    }

    public String getNmAdversario() {
        return nmAdversario;
    }

    public void setNmAdversario(String nmAdversario) {
        this.nmAdversario = nmAdversario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public Long getFkAtleta() {
//        return fkAtleta;
//    }
//
//    public void setFkAtleta(Long fkAtleta) {
//        this.fkAtleta = fkAtleta;
//    }

    public Long getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(Long golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public Long getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(Long assistencias) {
        this.assistencias = assistencias;
    }

    public Long getChancesReaisCriadas() {
        return chancesReaisCriadas;
    }

    public void setChancesReaisCriadas(Long chancesReaisCriadas) {
        this.chancesReaisCriadas = chancesReaisCriadas;
    }

    public Long getChancesReaisPerdidas() {
        return chancesReaisPerdidas;
    }

    public void setChancesReaisPerdidas(Long chancesReaisPerdidas) {
        this.chancesReaisPerdidas = chancesReaisPerdidas;
    }

    public Long getFaltasCometidas() {
        return faltasCometidas;
    }

    public void setFaltasCometidas(Long faltasCometidas) {
        this.faltasCometidas = faltasCometidas;
    }

    public Long getCartoesAmarelo() {
        return cartoesAmarelo;
    }

    public void setCartoesAmarelo(Long cartoesAmarelo) {
        this.cartoesAmarelo = cartoesAmarelo;
    }

    public Long getCartoesVermelho() {
        return cartoesVermelho;
    }

    public void setCartoesVermelho(Long cartoesVermelho) {
        this.cartoesVermelho = cartoesVermelho;
    }

    public Double getMinJogados() {
        return minJogados;
    }

    public void setMinJogados(Double minJogados) {
        this.minJogados = minJogados;
    }
}
