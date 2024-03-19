package com.usco.inventario.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id")
    private Long cli_id;

    @Column(name = "cli_cedula")
    private String cli_cedula;

    @Column(name = "cli_nombre")
    private String cli_nombre;

    @Column(name = "cli_direccion")
    private String cli_direccion;

    @Column(name = "cli_telefono")
    private String cli_telefono;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Venta> ventas;
}
