package com.api.prefeitura.medicamento.controller;

import com.api.prefeitura.medicamento.model.service.CnabService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Tag(name = "Importação de cnab")
@RestController
@RequestMapping("/cnab")
public class CnabController {

    @Autowired
    private CnabService service;

    @PostMapping("/upload")
    public String importarArquivo(@RequestParam("file") MultipartFile file) throws Exception {
        service.updloadCnabFile(file);
        return "Processamento iniciado com sucesso";
    }

}
