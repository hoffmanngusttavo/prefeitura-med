package com.api.prefeitura.medicamento.model.service;


import com.api.prefeitura.medicamento.model.entity.Medicamento;
import com.api.prefeitura.medicamento.model.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoRepository repository;


    @Override
    public Page<Medicamento> findAll(Pageable paginacao) {
        return repository.findAll(paginacao);
    }
}
