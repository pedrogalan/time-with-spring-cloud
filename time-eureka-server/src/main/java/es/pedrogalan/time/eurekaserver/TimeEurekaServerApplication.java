package es.pedrogalan.time.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TimeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeEurekaServerApplication.class, args);
	}

}
