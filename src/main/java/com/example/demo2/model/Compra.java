package com.example.demo2.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name = "compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompra;

    @ManyToOne
    @JoinColumn(name = "persona_idpersona")
    //@Column(name="idpersona")
    private Double idPersona;

    @ManyToOne
    @JoinColumn(name = "producto_idproducto")
    //@Column(name="idproducto")
    private Double idProducto;

    @Column(name="cantidad")
    private Double cantidad;

    @Column(name="fecha")
    private Date fecha;
}
