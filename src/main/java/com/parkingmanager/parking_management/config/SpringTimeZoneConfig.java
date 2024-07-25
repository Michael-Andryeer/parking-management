package com.parkingmanager.parking_management.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {

    @PostConstruct // Inicialização de recursos, configuração de propriedades adicionais, verificação de condições após a configuração inicial, etc.
    public void timeZoneConfiguration(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}
