package com.api.prefeitura.medicamento.model.dto.saude;

import com.api.prefeitura.medicamento.model.entity.UnidadeBasicaSaude;

public record DadosIntegracaoUnidadeSaudePrefeitura(

        String uuid,
        String nome,

        String telefone,

        String logradouro,

        String bairro) {


    public DadosIntegracaoUnidadeSaudePrefeitura(UnidadeBasicaSaude ubs){
        this(ubs.getUuid(), ubs.getNome(), ubs.getTelefone(),
                ubs.getLogradouro(), ubs.getBairro());
    }

}
