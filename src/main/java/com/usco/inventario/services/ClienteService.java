package com.usco.inventario.services;

import com.usco.inventario.models.Cliente;
import com.usco.inventario.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente update(Long id, Cliente nuevoCliente) {
        Cliente clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no encontrado con el ID: " + id));

        // Actualiza los campos del cliente existente con los valores del nuevo cliente
        clienteExistente.setCli_cedula(nuevoCliente.getCli_cedula());
        clienteExistente.setCli_nombre(nuevoCliente.getCli_nombre());
        clienteExistente.setCli_direccion(nuevoCliente.getCli_direccion());
        clienteExistente.setCli_telefono(nuevoCliente.getCli_telefono());

        // Guarda el cliente actualizado en la base de datos
        return clienteRepository.save(clienteExistente);
    }
}
