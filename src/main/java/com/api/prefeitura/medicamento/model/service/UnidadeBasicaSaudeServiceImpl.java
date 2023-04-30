package com.api.prefeitura.medicamento.model.service;


import com.api.prefeitura.medicamento.model.repository.UnidadeBasicaSaudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class UnidadeBasicaSaudeServiceImpl implements UnidadeBasicaSaudeService {

    @Autowired
    private UnidadeBasicaSaudeRepository repository;



}
