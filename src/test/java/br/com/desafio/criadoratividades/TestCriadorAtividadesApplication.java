package br.com.desafio.criadoratividades;

import org.springframework.boot.SpringApplication;

public class TestCriadorAtividadesApplication {

    public static void main(String[] args) {
        SpringApplication.from(CriadorAtividadesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
