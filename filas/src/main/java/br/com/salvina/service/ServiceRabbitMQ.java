package br.com.salvina.service;

import br.com.salvina.config.ConfigRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceRabbitMQ {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarMensagem(String mensagem){
        rabbitTemplate.convertAndSend(ConfigRabbitMQ.NOME_EXCHANGE, "ebac.rota.mensagem", mensagem);
    }
}
