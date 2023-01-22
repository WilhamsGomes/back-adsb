package br.com.etembfutsal.analise_desempenho.controllers;

import br.com.etembfutsal.analise_desempenho.models.DadosIndividuaisPartidaModal;
import br.com.etembfutsal.analise_desempenho.models.HistoricoPartidaModal;
import br.com.etembfutsal.analise_desempenho.repositories.HistoricoPartida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class HistoricoPartidaController {

    @Autowired
    HistoricoPartida historicoRepository;

    @CrossOrigin
    @GetMapping("/historico")
    public ResponseEntity<List<HistoricoPartidaModal>> getHistoricoPartidas(){
        return new ResponseEntity<List<HistoricoPartidaModal>>(historicoRepository.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/historico")
    public ResponseEntity<HistoricoPartidaModal> postHistorico(@RequestBody HistoricoPartidaModal dadosSave){
        return new ResponseEntity<HistoricoPartidaModal>(historicoRepository.save(dadosSave), HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/historico/{id}")
    public ResponseEntity<?> deleteHistorico(@PathVariable(value = "id") Long id){
        Optional<HistoricoPartidaModal> atleta0 = historicoRepository.findById(id);
        if(atleta0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        historicoRepository.delete(atleta0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Registro deletado!");
    }

    @CrossOrigin
    @PutMapping("/historico/{id}")
    public ResponseEntity<HistoricoPartidaModal> updateHistorico(@PathVariable(value = "id") Long id, @RequestBody @Valid HistoricoPartidaModal updateSave){
        Optional<HistoricoPartidaModal> player0 = historicoRepository.findById(id);
        if(player0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        updateSave.setId(player0.get().getId());
        return new ResponseEntity<HistoricoPartidaModal>(historicoRepository.save(updateSave), HttpStatus.OK);
    }

}
