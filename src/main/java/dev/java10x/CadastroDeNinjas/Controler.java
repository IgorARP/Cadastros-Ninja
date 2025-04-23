package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controler {
    @RestController
    @RequestMapping
    public class Controller{

        @GetMapping("/boasvindas")
        public String boasVindas(){
            return "Essa é minhas primeira mensagem nessa rota";
        }

    }
}
