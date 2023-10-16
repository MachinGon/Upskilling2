package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringDemo2Application.class, args);
		System.out.println("--main");

		//Scope default Singleton -> 1 instancia por Servicio
		//Scope           Request -> por cada Request hace una nueva instancia del bean
		//Scope Session
		//sig Sesion... (mapeo de BD a Java)
		//TAREA: tablas (relacional) persona, producto - ORM

		//Al final de SPRING...
		//Carro de compras
		//tablas: customerID, productos
		//RESTController, Repository, Service
	}

}
