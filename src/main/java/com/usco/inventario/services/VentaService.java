package com.usco.inventario.services;

import com.usco.inventario.models.Venta;
import com.usco.inventario.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    public Venta findById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    public Venta save(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void deleteById(Long id) {
        ventaRepository.deleteById(id);
    }

    public Venta update(Long id, Venta venta) {
        Optional<Venta> ventaOptional = ventaRepository.findById(id);
        if (ventaOptional.isPresent()) {
            Venta existingVenta = ventaOptional.get();
            existingVenta.setVen_cantidad(venta.getVen_cantidad());
            existingVenta.setVen_fecha(venta.getVen_fecha());
            existingVenta.setVen_precio(venta.getVen_precio());

            // Actualizar el producto y el cliente
            existingVenta.setProducto(venta.getProducto());
            existingVenta.setCliente(venta.getCliente());

            return ventaRepository.save(existingVenta);
        } else {
            throw new RuntimeException("Venta no encontrada con el ID: " + id);
        }
    }
}
