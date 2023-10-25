package com.example.demo2;

import com.example.demo2.DAO.PersonRepository;
import com.example.demo2.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringDemo2Application.class, args);
		System.out.println("--main--");

		//Scope default Singleton -> 1 instancia por Servicio
		//Scope           Request -> por cada Request hace una nueva instancia del bean
		//Scope Session
		//sig Sesion... (mapeo de BD a Java)
		//TAREA: tablas (relacional) persona, producto - ORM


		//17/oct Martes
		//Servicios CRUD
		//@Entity para mapeo a DB @TABLE @ID
		//Tablas y clases Java con esos campos @Entity y @ID <--- (intentar joins)


		//Al final de SPRING...
		//Carro de compras
		//tablas: customerID(pendiente), productos
		//RESTController, Repository, Service
	}

	@Bean
	public CommandLineRunner demo(PersonRepository repository){
		return(args)->{
			//repository.save(new Person("Jack Skellington", "Fireman"));
			//repository.save(new Person("Jack Sparrow", "Pirate Captain"));

			System.out.println("Persons found with findAll():");
			repository.findAll().forEach(System.out::println);

		};
	}

}
