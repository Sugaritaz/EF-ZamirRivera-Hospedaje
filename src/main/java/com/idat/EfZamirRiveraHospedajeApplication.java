package com.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EfZamirRiveraHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfZamirRiveraHospedajeApplication.class, args);
	}

}
