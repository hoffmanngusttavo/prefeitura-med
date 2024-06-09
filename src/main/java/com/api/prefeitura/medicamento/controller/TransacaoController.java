package com.api.prefeitura.medicamento.controller;

import com.api.prefeitura.medicamento.model.dto.cnab.TransacaoReport;
import com.api.prefeitura.medicamento.model.service.TransacaoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Transações Financeiras")
@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @GetMapping
    public List<TransacaoReport> findAll(){
        return service.getTotaisTransacoesPorLoja();
    }

}
