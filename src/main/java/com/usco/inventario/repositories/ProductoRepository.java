package com.usco.inventario.repositories;

import com.usco.inventario.models.Producto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
