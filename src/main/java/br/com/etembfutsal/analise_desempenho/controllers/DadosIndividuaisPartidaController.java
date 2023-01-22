package br.com.etembfutsal.analise_desempenho.controllers;

import br.com.etembfutsal.analise_desempenho.models.AnaliseModal;
import br.com.etembfutsal.analise_desempenho.models.DadosIndividuaisPartidaModal;
import br.com.etembfutsal.analise_desempenho.repositories.DadosIndividuaisPartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class DadosIndividuaisPartidaController {

    @Autowired
    DadosIndividuaisPartidaRepository dadosRepository;

    @CrossOrigin
    @GetMapping("/dados/individuais")
    public ResponseEntity<List<DadosIndividuaisPartidaModal>> getDadosIndividuais(){
        return new ResponseEntity<List<DadosIndividuaisPartidaModal>>(dadosRepository.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/dados/individuais")
    public ResponseEntity<DadosIndividuaisPartidaModal> postDadosIndividuais(@RequestBody  DadosIndividuaisPartidaModal dadosSave){
        return new ResponseEntity<DadosIndividuaisPartidaModal>(dadosRepository.save(dadosSave), HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/dados/{id}")
    public ResponseEntity<?> deleteDadosIndividuais(@PathVariable(value = "id") Long id){
        Optional<DadosIndividuaisPartidaModal> atleta0 = dadosRepository.findById(id);
        if(atleta0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        dadosRepository.delete(atleta0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Registro deletado!");
    }

    @CrossOrigin
    @PutMapping("/dados/{id}")
    public ResponseEntity<DadosIndividuaisPartidaModal> updateDadosIndividuais(@PathVariable(value = "id") Long id, @RequestBody @Valid DadosIndividuaisPartidaModal dadosIndividuais){
        Optional<DadosIndividuaisPartidaModal> player0 = dadosRepository.findById(id);
        if(player0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        dadosIndividuais.setId(player0.get().getId());
        return new ResponseEntity<DadosIndividuaisPartidaModal>(dadosRepository.save(dadosIndividuais), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/dados/buscarInsight")
    @ResponseBody
    public ResponseEntity<?> buscarInsight (@RequestParam(name = "name") String name){

        List<DadosIndividuaisPartidaModal> insights = dadosRepository.findByApelido(name.trim().toUpperCase());

        if(insights.isEmpty()){
            return new ResponseEntity<String>("Dados de atleta não encontrado", HttpStatus.OK);
        }

        return new ResponseEntity<List<DadosIndividuaisPartidaModal>>(insights, HttpStatus.OK);
    }


}
