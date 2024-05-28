package br.com.salvina.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {

    @Value("${kafka.ebac.nome.topico}")
    private String nomeTopico;

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(nomeTopico).partitions(1).replicas(1).build();
    }
}
