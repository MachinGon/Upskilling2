package com.example.demo2;

import com.example.demo2.DAO.ProductoRepository;
import com.example.demo2.model.ApplicationContextProvider;
import com.example.demo2.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
		//(scanBasePackages = {"com.example.demo2.model.*", "com.example.demo2.DAO.*"})
//@EnableJpaRepositories(basePackages ={"com.example.demo2.DAO.*", "com.example.demo2.controller.*", "com.example.demo2.model.*"})
//@EntityScan(basePackages ={"com.example.demo2.model.*", "com.example.demo2.DAO.*", "com.example.demo2.controller.*"})
public class SpringDemo2Application implements CommandLineRunner{
	@Autowired
	ApplicationContextProvider applicationContextProvider;

	public static void main(String[] args) {

		SpringApplication.run(SpringDemo2Application.class, args);
		System.out.println("--main--");

		//Scope default Singleton -> 1 instancia por Servicio
		//Scope           Request -> por cada Request hace una nueva instancia del bean
		//Scope Session

		//Al final de SPRING...
		//Carro de compras
		//tablas: customerID(pendiente), productos
		//RESTController, Repository, Service

		//mie 17 Ene
		//manyToMany JPA
		//AQUI en codigo, agregar modelo de tabla Compra, EL ENTITY
		//4. Many-to-Many With a New Entity

	}

	//@Bean


	@Override
	public void run(String... args) throws Exception {
		ProductoRepository productoRepository = applicationContextProvider
				.getApplicationContext().getBean(ProductoRepository.class);

		Producto prodNuevo = new Producto();
		prodNuevo.setProductName("marinela2");
		prodNuevo.setProductDesc("testImproved");
		prodNuevo.setProductPrice(35.0);
		productoRepository.save(prodNuevo);
	}
}
