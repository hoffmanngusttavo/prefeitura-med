package com.api.prefeitura.medicamento.config.batch.processors;

import com.api.prefeitura.medicamento.model.dto.TransacaoCNABDTO;
import com.api.prefeitura.medicamento.model.dto.TransacaoDTO;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ImportarArquivoCnabProcessorConfig {


    @Bean
    ItemProcessor<TransacaoCNABDTO, TransacaoDTO> importarArquivoCnabProcessor(){
        //wither pattern
        return item -> new TransacaoDTO(null, item.tipo(),null,
                item.valor().divide(BigDecimal.valueOf(100)),
                item.cpf(), item.cartao(), null,
                item.donoDaLoja().trim(), item.nomeDaLoja().trim())
                .withData(item.data())
                .withHour(item.hora());
    }


}
