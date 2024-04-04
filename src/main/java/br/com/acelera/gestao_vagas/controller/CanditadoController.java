package br.com.acelera.gestao_vagas.controller;


import br.com.acelera.gestao_vagas.model.CandidatoEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/candidato")
public class CanditadoController {

    @PostMapping("/")
    public void criarCandidato(@RequestBody CandidatoEntity candidato){
        System.out.println("Canditato:");
        System.out.println(candidato.getName());
        System.out.println(candidato.getUserName());
    }
}
