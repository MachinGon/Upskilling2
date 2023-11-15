package com.example.demo2.DAO;

import com.example.demo2.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    //List<Producto> findByProductName(String productName);
    //Optional<Producto> findByIdProducto(Long id);
}
