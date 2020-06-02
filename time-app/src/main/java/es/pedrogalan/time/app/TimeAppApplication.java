package es.pedrogalan.time.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeAppApplication.class, args);
	}

}
