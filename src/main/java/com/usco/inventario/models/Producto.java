package com.usco.inventario.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long pro_id;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "prov_id")
    private Proveedor proveedor;

    @Column(name = "prod_codigo")
    private String prod_codigo;

    @Column(name = "prod_nombre")
    private String prod_nombre;

    @Column(name = "prod_precio")
    private float prod_precio;

    @Column(name = "prod_stock")
    private Integer prod_stock;
}
