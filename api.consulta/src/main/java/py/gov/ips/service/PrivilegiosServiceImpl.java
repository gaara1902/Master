/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Clientes;
import py.gov.ips.entities.Privilegios;
import py.gov.ips.entities.Proveedores;
import py.gov.ips.repository.ClientesRepo;
import py.gov.ips.repository.PrivilegiosRepo;

/**
 *
 * @author Lorenzo
 */
public class PrivilegiosServiceImpl {
      private final PrivilegiosRepo repository;

    public PrivilegiosServiceImpl(PrivilegiosRepo repository) {
        this.repository = repository;
    }
  
 
      public void save(Privilegios privilegios) {
        repository.save(privilegios);
    }

    public List<Privilegios> findAll() {
        return repository.findAll();
    }

    public Optional<Privilegios> findByID(Integer id) {
        return repository.findById(id);
    }
    
}
