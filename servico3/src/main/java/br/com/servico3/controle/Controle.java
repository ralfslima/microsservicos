package br.com.servico3.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class Controle {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World!";
    }
    

    @GetMapping("/verificar/{numero}")
    public String getMethodName(@PathVariable int numero) {
        
        String servico1 = restTemplate.getForObject("http://servico1/verificar/{numero}", String.class, numero);
        String servico2 = restTemplate.getForObject("http://servico2/verificar/{numero}", String.class, numero);

        return servico1 + "<hr>" + servico2;

    }
    
}
