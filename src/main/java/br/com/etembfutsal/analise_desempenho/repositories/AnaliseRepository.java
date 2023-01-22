package br.com.etembfutsal.analise_desempenho.repositories;

import br.com.etembfutsal.analise_desempenho.models.AnaliseModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaliseRepository extends JpaRepository<AnaliseModal, Long> {

    @Query(value = "select u from tb_analise_atletas u where  upper(trim(u.nomeAtleta)) like %?1%")
    List<AnaliseModal> findByName(String name);
}

