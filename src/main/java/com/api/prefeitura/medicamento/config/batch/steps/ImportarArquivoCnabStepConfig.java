package com.api.prefeitura.medicamento.config.batch.steps;

import com.api.prefeitura.medicamento.model.dto.cnab.TransacaoCNABDTO;
import com.api.prefeitura.medicamento.model.dto.cnab.TransacaoDTO;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ImportarArquivoCnabStepConfig {


    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    @Qualifier("importarArquivoCnabReader")
    private ItemReader<TransacaoCNABDTO> importarArquivoCnabReader;

    @Autowired
    @Qualifier("importarArquivoCnabProcessor")
    private ItemProcessor<TransacaoCNABDTO, TransacaoDTO> importarArquivoCnabProcessor;

    @Autowired
    @Qualifier("importarArquivoCnabWriter")
    private ItemWriter<TransacaoDTO> importarArquivoCnabWriter;


    @Bean
    Step importarArquivoCnabStep(){
        return new StepBuilder("importarArquivoCnabStep", jobRepository)
                .<TransacaoCNABDTO, TransacaoDTO>chunk(1000, transactionManager)
                .reader(importarArquivoCnabReader)
                .processor(importarArquivoCnabProcessor)
                .writer(importarArquivoCnabWriter)
                .build();
    }


}
