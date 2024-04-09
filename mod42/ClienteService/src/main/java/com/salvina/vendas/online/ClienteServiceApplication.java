package com.salvina.vendas.online;

import com.salvina.vendas.online.repository.IClienteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ClienteServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClienteServiceApplication.class, args);
	}

}
