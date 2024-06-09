package com.api.prefeitura.medicamento.model.service.impl;

import com.api.prefeitura.medicamento.model.dto.cnab.TransacaoReport;
import com.api.prefeitura.medicamento.model.repository.TransacaoRepository;
import com.api.prefeitura.medicamento.model.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
@Transactional(readOnly = true)
class TransacaoServiceImpl implements TransacaoService {


    @Autowired
    private TransacaoRepository repository;

    @Override
    public List<TransacaoReport> getTotaisTransacoesPorLoja() {

        var listaTransacoes = repository.findAllByOrderByNomeDaLojaAscIdDesc();

        var reportMap = new LinkedHashMap<String, TransacaoReport>();

        listaTransacoes.forEach(transacao ->{

            var nomeDaLoja = transacao.getNomeDaLoja();
            var valor = transacao.getValor();

            reportMap.compute(nomeDaLoja, (key, existingReport) -> {
                var report = existingReport != null
                        ? existingReport
                        : new TransacaoReport(key, BigDecimal.ZERO, new ArrayList<>());
                return report.addTotal(valor).addTransacao(transacao);
            });

        });

        return new ArrayList<>(reportMap.values());
    }
}
