package br.com.etembfutsal.analise_desempenho.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "tb_historico_partidas")
@Table(name = "TB_HISTORICO_PARTIDAS")
@SequenceGenerator(name = "seq_historico", sequenceName = "seq_historico", allocationSize = 1, initialValue = 1)
public class HistoricoPartidaModal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historico")
    private long id;
    @Column(nullable = false, length = 150)
    private String timeAdversario;
    @Column(nullable = false, length = 100)
    private String localPartida;
    @Column(nullable = false)
    private Date dataPartida;
    @Column(nullable = false)
    private Long quantidadeGolsMandante;
    @Column(nullable = false)
    private Long quantidadeGolsVisitante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTimeAdversario() {
        return timeAdversario;
    }

    public void setTimeAdversario(String timeAdversario) {
        this.timeAdversario = timeAdversario;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Long getQuantidadeGolsMandante() {
        return quantidadeGolsMandante;
    }

    public void setQuantidadeGolsMandante(Long quantidadeGolsMandante) {
        this.quantidadeGolsMandante = quantidadeGolsMandante;
    }

    public Long getQuantidadeGolsVisitante() {
        return quantidadeGolsVisitante;
    }

    public void setQuantidadeGolsVisitante(Long quantidadeGolsVisitante) {
        this.quantidadeGolsVisitante = quantidadeGolsVisitante;
    }
}
