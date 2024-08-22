package com.autenticacao.Security.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.autenticacao.Security.Autentic.UsuarioAutenticFiltro;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {
    @Autowired
private UsuarioAutenticFiltro usuarioAutenticFiltro;

    public static final String[] ENDPOINTS_AUTENTICATION_NOT_REQUIRED = {
            "/usuario/login",
            "/usuario/create"
    };

    public static final String[] ENDPOINTS_AUTENTICATION_REQUIRED = {
            "/usuario/teste"

    };

    public static final String []  ENDPOINTS_CLIENTE = {
        "/usuario/teste/cliente"
    };
    public static final String []  ENDPOINTS_ADMIN = {
        "/usuario/teste/admin"
    };

    @Bean
    public SecurityFilterChain securityFilter(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.csrf(csfr -> csfr.disable())
                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize.requestMatchers(ENDPOINTS_AUTENTICATION_NOT_REQUIRED).permitAll())
                .authorizeHttpRequests(authorize -> authorize.requestMatchers(ENDPOINTS_AUTENTICATION_REQUIRED).permitAll().anyRequest().authenticated())
                .authorizeHttpRequests(authorize -> authorize.requestMatchers(ENDPOINTS_ADMIN).hasRole("Admin"))
                .authorizeHttpRequests(authorize -> authorize.requestMatchers(ENDPOINTS_CLIENTE).hasRole("Cliente"))
                .addFilterBefore(usuarioAutenticFiltro, UsernamePasswordAuthenticationFilter.class).build();

    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}