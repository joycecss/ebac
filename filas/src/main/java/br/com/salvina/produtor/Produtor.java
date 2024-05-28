package br.com.salvina.produtor;

import br.com.salvina.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class Produtor {

    @Autowired
    private ServiceRabbitMQ rabbitMQ;

    @PostMapping()
    public void enviarMensagem(@RequestBody String mensagem){
        System.out.println("===== Enviando mensagem: " + mensagem);

        rabbitMQ.enviarMensagem(mensagem);
    }
}
