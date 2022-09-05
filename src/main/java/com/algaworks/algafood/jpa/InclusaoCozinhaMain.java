package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.infrastructure.repository.CozinhaRepositoryImpl;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepositoryImpl cozinhaRepository = applicationContext.getBean(CozinhaRepositoryImpl.class);

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setName("Brasileira");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setName("Japonesa");

        cozinha1 = cozinhaRepository.adicionar(cozinha1);
        cozinha2 = cozinhaRepository.adicionar(cozinha2);

        System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getName());
        System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getName());

    }
}
