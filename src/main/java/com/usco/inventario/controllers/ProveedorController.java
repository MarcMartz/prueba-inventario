package com.usco.inventario.controllers;

import com.usco.inventario.models.Proveedor;
import com.usco.inventario.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public List<Proveedor> findAll() {
        return proveedorService.findAll();
    }

    @GetMapping("/{id}")
    public Proveedor findById(@PathVariable Long id) {
        return proveedorService.findById(id);
    }

    @PostMapping
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return proveedorService.save(proveedor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        proveedorService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Proveedor update(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        return proveedorService.update(id, proveedor);
    }
}
