package com.usco.inventario.controllers;

import com.usco.inventario.models.Venta;
import com.usco.inventario.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> findAll() {
        return ventaService.findAll();
    }

    @GetMapping("/{id}")
    public Venta findById(@PathVariable Long id) {
        return ventaService.findById(id);
    }

    @PostMapping
    public Venta save(@RequestBody Venta venta) {
        return ventaService.save(venta);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        ventaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Venta update(@PathVariable Long id, @RequestBody Venta venta) {
        return ventaService.update(id, venta);
    }
}
