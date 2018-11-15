package pl.ostrowski.apigatewaydemo.properties.propertybrowser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PropertyBrowserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyBrowserApplication.class, args);
	}
}
