package com.example.demo2.DAO;
import com.example.demo2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    //List<Producto> findByProductName(String productName);
    //Optional<Producto> findByIdProducto(Long id);
}
