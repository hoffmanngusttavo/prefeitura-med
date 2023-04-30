package com.api.prefeitura.medicamento.model.service;

import com.api.prefeitura.medicamento.model.entity.Medicamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MedicamentoService  {


    Page<Medicamento> findAll(Pageable paginacao);
}
