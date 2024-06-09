package com.api.prefeitura.medicamento.model.service;

import com.api.prefeitura.medicamento.model.dto.cnab.TransacaoReport;

import java.util.List;

public interface TransacaoService {


    List<TransacaoReport> getTotaisTransacoesPorLoja();
}
