package com.example.demo2.controller;

import com.example.demo2.DAO.ProductoRepository;
import com.example.demo2.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public Producto addProduct(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }
}
