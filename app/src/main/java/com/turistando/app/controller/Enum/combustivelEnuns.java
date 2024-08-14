package com.turistando.app.controller.Enum;

public enum combustivelEnuns {
    Gasolina("Gasolina"),
    Alcool("Alcool"),
    Diesel("Diesel"),
    GNV("GNV"),
    Flex("Flex");

    private String combustivel;

    private combustivelEnuns(String combustivel) {
        this.combustivel = combustivel;
    }
}
