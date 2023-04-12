package br.com.Alura.linguagensDaAlura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguangensController {
   @Autowired 
   private LInguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List <Linguagem> obterLinguagens() {
        List <Linguagem> linguagems = repositorio.findAll();
        return linguagems;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }

}