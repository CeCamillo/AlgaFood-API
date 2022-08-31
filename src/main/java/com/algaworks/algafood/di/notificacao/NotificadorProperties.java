package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

@Component
public class NotificadorProperties {

    private String hostServidor;
    private Integer portaServidor;

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}
