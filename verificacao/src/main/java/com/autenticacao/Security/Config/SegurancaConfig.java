package com.autenticacao.Services;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {
    public static final String [] ENDPOI_AUTENTICATION_NOT_REQUIRED = {
        "/usuario/login",
        "/usuario/create"
    };

}
