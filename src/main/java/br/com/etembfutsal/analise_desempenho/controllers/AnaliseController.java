package br.com.etembfutsal.analise_desempenho.controllers;

import br.com.etembfutsal.analise_desempenho.models.AnaliseModal;
import br.com.etembfutsal.analise_desempenho.repositories.AnaliseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class AnaliseController {

    @Autowired
    AnaliseRepository analiseRepository;

    @CrossOrigin
    @GetMapping("/analise")
    public ResponseEntity<List<AnaliseModal>> getAllPlayers(){
        return new ResponseEntity<List<AnaliseModal>>(analiseRepository.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/analise/{id}")
    public ResponseEntity<AnaliseModal> getOnePlayer(@PathVariable(value = "id") Long id){
        Optional<AnaliseModal> atleta0 = analiseRepository.findById(id);
        if(atleta0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<AnaliseModal>(atleta0.get(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/analise")
    public ResponseEntity<AnaliseModal> postPlayer(@RequestBody  AnaliseModal analise){
        return new ResponseEntity<AnaliseModal>(analiseRepository.save(analise), HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/analise/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable(value = "id") Long id){
        Optional<AnaliseModal> atleta0 = analiseRepository.findById(id);
        if(atleta0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        analiseRepository.delete(atleta0.get());
       //return new ResponseEntity<>(HttpStatus.OK);
        return ResponseEntity.status(HttpStatus.OK).body("Registro deletado!");
    }

    @CrossOrigin
    @PutMapping("/analise/{id}")
    public ResponseEntity<AnaliseModal> updatePlayer(@PathVariable(value = "id") Long id, @RequestBody @Valid AnaliseModal analise){
        Optional<AnaliseModal> player0 = analiseRepository.findById(id);
        if(player0.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        analise.setId(player0.get().getId());
        return new ResponseEntity<AnaliseModal>(analiseRepository.save(analise), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/analise/buscarPorNome")
    @ResponseBody
    public ResponseEntity<?> buscarPorNome (@RequestParam(name = "name") String name){

        List<AnaliseModal> atletas = analiseRepository.findByName(name.trim().toUpperCase());

        if(atletas.isEmpty()){
            return new ResponseEntity<String>("Atleta não encontrado",HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<List<AnaliseModal>>(atletas, HttpStatus.OK);
    }

}
