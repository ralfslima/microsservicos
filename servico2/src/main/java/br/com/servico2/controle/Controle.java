package br.com.servico2.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Controle {
    
    @GetMapping("/verificar/{numero}")
    public String getMethodName(@PathVariable int numero) {
        return "O número informado é: " + (numero < 0 ? "negativo" : "positivo");
    }
    

}
