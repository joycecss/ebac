package com.salvina.vendas.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ProdutosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosServiceApplication.class, args);
	}

}
