package com.turistando.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.turistando.app.model.VeiculoModel;
import com.turistando.app.repository.VeiculoRepository;


@RestController
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping("/testeveiculos")
    public String teste() {
        return "veiculos funciona";
    }
    

    @PostMapping("/cadastrarveiculo")
    public VeiculoModel cadastrarVeiculo(@RequestBody VeiculoModel veiculo) {
        return veiculoRepository.save(veiculo);
    }
}
