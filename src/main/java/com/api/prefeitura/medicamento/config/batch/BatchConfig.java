package com.api.prefeitura.medicamento.config.batch;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.TaskExecutorJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
public class BatchConfig {


    /**
     * o nome do joblauncher é jobLauncherAsync, e utilizado no qualifier ao
     * fazer injecao de dependencia com @autowired
     * Definir o executor dos jobs assincrono,
     * pq o joblauncher padrao do spring é sincrono
     * */
    @Bean
    JobLauncher jobLauncherAsync(JobRepository jobRepository) throws Exception {

        var jobLauncher = new TaskExecutorJobLauncher();
        jobLauncher.setJobRepository(jobRepository);
        jobLauncher.setTaskExecutor(new SimpleAsyncTaskExecutor());
        jobLauncher.afterPropertiesSet();
        return jobLauncher;
    }




}
