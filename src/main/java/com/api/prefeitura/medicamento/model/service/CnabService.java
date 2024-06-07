package com.api.prefeitura.medicamento.model.service;

import org.springframework.web.multipart.MultipartFile;


public interface CnabService {
    void updloadCnabFile(MultipartFile file) throws Exception;
}
