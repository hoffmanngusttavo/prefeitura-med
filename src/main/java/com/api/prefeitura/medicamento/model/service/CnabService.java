package com.api.prefeitura.medicamento.model.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CnabService {
    void updloadCnabFile(MultipartFile file) throws Exception;
}
