package com.usco.inventario.services;

import com.usco.inventario.models.Proveedor;
import com.usco.inventario.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    public Proveedor findById(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public Proveedor save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void deleteById(Long id) {
        proveedorRepository.deleteById(id);
    }

    public Proveedor update(Long id, Proveedor nuevoProveedor) {
        Proveedor proveedorExistente = proveedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Proveedor no encontrada con el ID: " + id));

        proveedorExistente.setProv_nombre(nuevoProveedor.getProv_nombre());
        return proveedorRepository.save(proveedorExistente);
    }
}
