package com.example.demo2;

import com.example.demo2.DAO.ProductoRepository;
import com.example.demo2.model.ApplicationContextProvider;
import com.example.demo2.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

		//mie 15 Nov
		//manyToMany JPA

	}

	//@Bean


	@Override
	public void run(String... args) throws Exception {
		ProductoRepository productoRepository = applicationContextProvider
				.getApplicationContext().getBean(ProductoRepository.class);

		Producto prodNuevo = new Producto();
		prodNuevo.setProductName("marinela2");
		prodNuevo.setProductDesc("testImproved");
		prodNuevo.setProductPrice(new Double(35));
		productoRepository.save(prodNuevo);
	}
}
