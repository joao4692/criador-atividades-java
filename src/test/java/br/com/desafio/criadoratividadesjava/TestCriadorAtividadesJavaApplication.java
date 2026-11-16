package br.com.desafio.criadoratividadesjava;

import org.springframework.boot.SpringApplication;

public class TestCriadorAtividadesJavaApplication {

    public static void main(String[] args) {
        SpringApplication.from(CriadorAtividadesJavaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
