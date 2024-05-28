package br.com.salvina.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class ServicoEnvioMensagemKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("kafka.ebac.nome.topico")
    private String nomeTopico;

    public void enviarMensagem(String mensagem){
        kafkaTemplate.send(nomeTopico, mensagem);
    }
}
