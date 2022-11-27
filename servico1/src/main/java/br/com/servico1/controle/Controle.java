package br.com.servico1.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Controle {
    
    @GetMapping(value="/verificar/{numero}")
    public String getMethodName(@PathVariable int numero) {
        return "O número informado é: " + (numero % 2 == 0 ? "par" : "ímpar");
    }
    

}
