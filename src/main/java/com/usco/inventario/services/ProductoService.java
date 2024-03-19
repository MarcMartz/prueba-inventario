package com.usco.inventario.services;

import com.usco.inventario.models.Producto;
import com.usco.inventario.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }

    public Producto update(Long id, Producto producto) {
        Optional<Producto> productoOptional = productoRepository.findById(id);
        if (productoOptional.isPresent()) {
            Producto existingProducto = productoOptional.get();
            existingProducto.setProd_codigo(producto.getProd_codigo());
            existingProducto.setProd_nombre(producto.getProd_nombre());
            existingProducto.setProd_precio(producto.getProd_precio());
            existingProducto.setProd_stock(producto.getProd_stock());

            // Actualizar la categoría y el proveedor
            existingProducto.setCategoria(producto.getCategoria());
            existingProducto.setProveedor(producto.getProveedor());

            return productoRepository.save(existingProducto);
        } else {
            // Manejar el caso cuando el producto no existe
            throw new RuntimeException("Producto no encontrado con el ID: " + id);
        }
    }


}
