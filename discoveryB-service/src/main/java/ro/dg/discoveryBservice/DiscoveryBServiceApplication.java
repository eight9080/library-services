package ro.dg.discoveryBservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryBServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryBServiceApplication.class, args);
	}
}
