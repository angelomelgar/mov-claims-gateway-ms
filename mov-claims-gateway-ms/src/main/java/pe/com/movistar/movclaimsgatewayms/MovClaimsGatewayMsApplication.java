package pe.com.movistar.movclaimsgatewayms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovClaimsGatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovClaimsGatewayMsApplication.class, args);
	}

}
