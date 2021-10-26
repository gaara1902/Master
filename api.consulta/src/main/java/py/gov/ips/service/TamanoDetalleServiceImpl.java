/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.TamanoDetalle;
import py.gov.ips.repository.TamanoDetalleRepo;

/**
 *
 * @author Lorenzo
 */
public class TamanoDetalleServiceImpl {
      private final TamanoDetalleRepo repository;

    public TamanoDetalleServiceImpl(TamanoDetalleRepo repository) {
        this.repository = repository;
    }

    public void save(TamanoDetalle tamanoDetalle) {
        repository.save(tamanoDetalle);
    }

    public List<TamanoDetalle> findAll() {
        return repository.findAll();
    }

    public Optional<TamanoDetalle> findByID(Integer id) {
        return repository.findById(id);
    }
    
}
