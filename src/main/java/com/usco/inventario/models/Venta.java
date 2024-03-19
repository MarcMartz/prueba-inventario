package com.usco.inventario.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "venta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_id")
    private Long ven_id;

    @ManyToOne
    @JoinColumn(name = "cli_id")
    //@JsonIgnore
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    //@JsonIgnore
    private Producto producto;

    @Column(name = "ven_cantidad")
    private Integer ven_cantidad;

    @Column(name = "ven_fecha")
    private LocalDate ven_fecha;

    @Column(name = "ven_precio")
    private float ven_precio;
}
