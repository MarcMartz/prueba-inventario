package com.usco.inventario.repositories;

import com.usco.inventario.models.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
