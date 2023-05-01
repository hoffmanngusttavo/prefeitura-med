package com.api.prefeitura.medicamento.controller;

import com.api.prefeitura.medicamento.model.dto.DadosIntegracaoMedicamentoPrefeitura;
import com.api.prefeitura.medicamento.model.service.MedicamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Tag(name = "Medicamentos")
@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;


    @Operation(description = "Buscar todos os medicamentos das unidade de saúde")
    @GetMapping
    public ResponseEntity<Page<DadosIntegracaoMedicamentoPrefeitura>> lista(@PageableDefault(size = 15, sort = {"nome"}) Pageable paginacao,
                                                                            @RequestParam(defaultValue = "") String data) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = StringUtils.isNotEmpty(data) ? LocalDate.parse(data, formatter) : null;

        var page = service.findAllByDataUltimaAtualizacao(paginacao, dataFormatada)
                .map(DadosIntegracaoMedicamentoPrefeitura::new);

        return ResponseEntity.ok(page);
    }





}
