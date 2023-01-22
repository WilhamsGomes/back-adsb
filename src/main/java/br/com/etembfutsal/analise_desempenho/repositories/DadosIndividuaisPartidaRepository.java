package br.com.etembfutsal.analise_desempenho.repositories;

import br.com.etembfutsal.analise_desempenho.models.DadosIndividuaisPartidaModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DadosIndividuaisPartidaRepository extends JpaRepository<DadosIndividuaisPartidaModal, Long> {

    @Query(value = "select u from tb_dados_individuais_partida u where  upper(trim(u.nmAtleta)) like %?1%")
    List<DadosIndividuaisPartidaModal> findByApelido(String name);
}
