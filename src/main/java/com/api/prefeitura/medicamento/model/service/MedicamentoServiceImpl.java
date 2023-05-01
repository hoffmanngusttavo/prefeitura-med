package com.api.prefeitura.medicamento.model.service;


import com.api.prefeitura.medicamento.model.entity.Medicamento;
import com.api.prefeitura.medicamento.model.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoRepository repository;


    @Override
    public Page<Medicamento> findAllByDataUltimaAtualizacao(Pageable paginacao, LocalDate dataUltimaAtualizacao) {
        LocalDateTime dataHora = null;
        if(dataUltimaAtualizacao != null){
            LocalTime hora = LocalTime.of(0,0,0);
            dataHora = LocalDateTime.of(dataUltimaAtualizacao, hora);
        }
        return repository.findAllByDataUltimaAtualizacao(paginacao, dataHora);
    }
}
