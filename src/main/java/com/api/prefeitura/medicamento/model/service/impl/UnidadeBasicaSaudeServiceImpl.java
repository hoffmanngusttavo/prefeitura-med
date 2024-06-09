package com.api.prefeitura.medicamento.model.service.impl;


import com.api.prefeitura.medicamento.model.repository.UnidadeBasicaSaudeRepository;
import com.api.prefeitura.medicamento.model.service.UnidadeBasicaSaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UnidadeBasicaSaudeServiceImpl implements UnidadeBasicaSaudeService {

    @Autowired
    private UnidadeBasicaSaudeRepository repository;



}
