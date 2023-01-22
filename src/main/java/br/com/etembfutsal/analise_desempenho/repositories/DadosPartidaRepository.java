package br.com.etembfutsal.analise_desempenho.repositories;

import br.com.etembfutsal.analise_desempenho.models.DadosPartidaModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosPartidaRepository extends JpaRepository<DadosPartidaModal, Long> {

}
