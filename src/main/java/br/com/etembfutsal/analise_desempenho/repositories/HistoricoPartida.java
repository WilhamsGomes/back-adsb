package br.com.etembfutsal.analise_desempenho.repositories;

import br.com.etembfutsal.analise_desempenho.models.HistoricoPartidaModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoPartida extends JpaRepository<HistoricoPartidaModal, Long> {



}
