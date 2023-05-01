package com.api.prefeitura.medicamento.model.service;

import com.api.prefeitura.medicamento.model.entity.Medicamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface MedicamentoService  {


    Page<Medicamento> findAllByDataUltimaAtualizacao(Pageable paginacao, LocalDate dataUltimaAtualizacao);
}
