package com.autenticacao.Security.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {
    public static final String [] ENDPOINTS_AUTENTICATION_NOT_REQUIRED = {
        "/usuario/login",
        "/usuario/create"
    };

    public static final String [] ENDPOINTS_AUTENTICATION_REQUIRED = {
        "/usuario/teste"
    };

}
