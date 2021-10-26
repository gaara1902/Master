/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Proveedores;
import py.gov.ips.repository.ProveedoresRepo;

/**
 *
 * @author Lorenzo
 */
public class ProveedoresServiceImpl {
      private final ProveedoresRepo repository;

    public ProveedoresServiceImpl(ProveedoresRepo repository) {
        this.repository = repository;
    }
    
          public void save(Proveedores proveedores) {
        repository.save(proveedores);
    }

    public List<Proveedores> findAll() {
        return repository.findAll();
    }

    public Optional<Proveedores> findByID(Integer id) {
        return repository.findById(id);
    }
    
    
}
