package com.example.demo2.model;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(name="productname")
    private String productName;

    @Column(name="productdesc")
    private String productDesc;

    @Column(name="productprice")
    private Double productPrice;

    @OneToMany(mappedBy="compra", targetEntity = Compra.class)
    public Set<Compra> compras;

    @Override
    public String toString() {
        return "person{" +
                "productId=" + idProducto +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }

}
