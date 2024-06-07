package com.api.prefeitura.medicamento.config.batch.jobs;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportarArquivoCnabJobConfig {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    @Qualifier("importarArquivoCnabStep")
    private Step importarArquivoCnabStep;


    @Bean
    Job importarArquivoCnabJob(){
        return new JobBuilder("importarArquivoCnabJob", jobRepository)
                .start(importarArquivoCnabStep)
                .incrementer(new RunIdIncrementer())
                .build();
    }

}
