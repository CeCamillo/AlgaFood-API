package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.infrastructure.repository.RestauranteRepositoryImpl;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class BuscaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepositoryImpl restauranteRepository = applicationContext.getBean(RestauranteRepositoryImpl.class);

        List<Restaurante> todosRestaurantes = restauranteRepository.listar();

        for (Restaurante restaurante : todosRestaurantes)
            System.out.printf("%s - %.2f, %s\n" ,restaurante.getNome(),
                restaurante.getTaxaFrete(), restaurante.getCozinha().getName());

    }
}
