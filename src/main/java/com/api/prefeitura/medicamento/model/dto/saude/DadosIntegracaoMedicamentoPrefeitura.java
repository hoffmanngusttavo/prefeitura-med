package com.api.prefeitura.medicamento.model.dto.saude;

import com.api.prefeitura.medicamento.model.entity.Medicamento;
import com.fasterxml.jackson.annotation.JsonProperty;

public record DadosIntegracaoMedicamentoPrefeitura(

        String uuid,
        String nome,
        String laboratorio,
        boolean disponivel,
        double miligramas,
        @JsonProperty("unidade_saude")
        DadosIntegracaoUnidadeSaudePrefeitura unidadeSaude) {


        public DadosIntegracaoMedicamentoPrefeitura(Medicamento medicamento){
                this(medicamento.getUuid(), medicamento.getNome(), medicamento.getLaboratorio(),
                        medicamento.getDisponivel(), medicamento.getMiligramas(),
                        new DadosIntegracaoUnidadeSaudePrefeitura(medicamento.getUbs()));
        }


}
