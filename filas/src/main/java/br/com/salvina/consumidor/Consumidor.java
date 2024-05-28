package br.com.salvina.consumidor;

import br.com.salvina.config.ConfigRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfigRabbitMQ.NOME_FILA)
public class Consumidor {

    @RabbitHandler
    public void consumirMensagem(String mensagem){
        System.out.println("===== Recebendo mensagem===========");
        System.out.println(mensagem);
        System.out.println("===== Fim Recebendo mensagem===========");
    }
}
