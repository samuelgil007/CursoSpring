package com.carWasher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.carWasher.properties.CarWasherProperties;
///se le dice a java que este es el main de spring boots
@SpringBootApplication
// Crea la clase con ese prefijo
@EnableConfigurationProperties(value=CarWasherProperties.class)
//si quisieramos un servlet pondriamos la anotación servlet componen scan
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
