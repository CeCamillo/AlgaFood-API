package com.algaworks.algafood.listener;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @EventListener
    public void ClienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("Cliente " + event.getCliente().getNome());
    }

}
