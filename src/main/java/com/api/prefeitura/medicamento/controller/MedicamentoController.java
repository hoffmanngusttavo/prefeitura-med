package com.api.prefeitura.medicamento.controller;

import com.api.prefeitura.medicamento.model.entity.Medicamento;
import com.api.prefeitura.medicamento.model.service.MedicamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Medicamentos")
@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;





    @Operation(description = "Buscar todos os medicamentos disponíveis")
    @GetMapping
    public ResponseEntity<Page<Medicamento>> lista(@PageableDefault(size = 15, sort = {"nome"}) Pageable paginacao) {
        var page = service.findAll(paginacao);
        return ResponseEntity.ok(page);
    }





}
