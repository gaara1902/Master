/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Clientes;
import py.gov.ips.repository.ClientesRepo;

/**
 *
 * @author Lorenzo
 */
public class ClienteServiceImpl implements ClienteService {

    private final ClientesRepo repository;

    public ClienteServiceImpl(ClientesRepo repository) {
        this.repository = repository;
    }

    @Override
    public void save(Clientes clientes) {
        repository.save(clientes);
    }

    @Override
    public List<Clientes> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Clientes> findByID(Integer id) {
        return repository.findById(id);
    }

}
