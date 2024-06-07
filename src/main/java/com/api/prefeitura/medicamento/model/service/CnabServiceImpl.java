package com.api.prefeitura.medicamento.model.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class CnabServiceImpl implements CnabService{


    private final Path fileStorageLocation;

    @Autowired
    @Qualifier("jobLauncherAsync")
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("importarArquivoCnabJob")
    private Job job;


    public CnabServiceImpl(@Value("${file.upload-dir}") String fileUploadDir) {
        this.fileStorageLocation = Paths.get(fileUploadDir);
    }



    @Override
    public void updloadCnabFile(MultipartFile file) throws Exception {
        var fileName = StringUtils.cleanPath(file.getOriginalFilename());
        var targetLocation = fileStorageLocation.resolve(fileName);

        file.transferTo(targetLocation); //transferir para minha pasta tmp

        var parameters = new JobParametersBuilder()
                // regra de unicidade do job para executar só 1x o job
                .addJobParameter("cnab", file.getOriginalFilename(), String.class, true)
                .addJobParameter("cnabFile", "file:" + targetLocation, String.class, false)
                .toJobParameters();

       jobLauncher.run(job, parameters);
    }
}
