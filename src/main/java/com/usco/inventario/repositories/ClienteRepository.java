package com.usco.inventario.repositories;

import com.usco.inventario.models.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
