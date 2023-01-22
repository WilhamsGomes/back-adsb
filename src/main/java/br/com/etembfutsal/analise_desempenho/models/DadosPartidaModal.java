package br.com.etembfutsal.analise_desempenho.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "tb_dados_partida")
@Table (name = "TB_DADOS_PARTIDA")
@SequenceGenerator(name = "seq_dadosPartida", sequenceName = "seq_dadosPartida", allocationSize = 1, initialValue = 100)
public class DadosPartidaModal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_atleta")
    private long id;
    @Column(nullable = false)
    private long fkAtleta;
    @Column(nullable = false, length = 5)
    private long passesCertos;
    @Column(nullable = false, length = 10)
    private long finalizacoes;
    @Column(nullable = false, length = 10)
    private long chancesCriadas;
    @Column(nullable = false, length = 10)
    private long gols;
    @Column(nullable = false, length = 10)
    private long assistencias;

    public long getChancesCriadas() {
        return chancesCriadas;
    }

    public void setChancesCriadas(long chancesCriadas) {
        this.chancesCriadas = chancesCriadas;
    }

    public long getGols() {
        return gols;
    }

    public void setGols(long gols) {
        this.gols = gols;
    }

    public long getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(long assistencias) {
        this.assistencias = assistencias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFkAtleta() {
        return fkAtleta;
    }

    public void setFkAtleta(long fkAtleta) {
        this.fkAtleta = fkAtleta;
    }

    public long getPassesCertos() {
        return passesCertos;
    }

    public void setPassesCertos(long passesCertos) {
        this.passesCertos = passesCertos;
    }

    public long getFinalizacoes() {
        return finalizacoes;
    }

    public void setFinalizacoes(long finalizacoes) {
        this.finalizacoes = finalizacoes;
    }
}
