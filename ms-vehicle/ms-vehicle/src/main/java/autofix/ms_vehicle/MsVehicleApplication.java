package autofix.ms_vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsVehicleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsVehicleApplication.class, args);
	}

}
