package dim_service;

import dim_service.worker.DimWorker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DimServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DimServiceApplication.class, args);
    }

//    @Bean
//    @Profile("dim-worker")
//    public CommandLineRunner startDomainWorker(DimWorker dimWorker) {
//        return args -> dimWorker.start();
//    }
}
