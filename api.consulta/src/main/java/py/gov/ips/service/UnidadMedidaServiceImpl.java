/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Clientes;
import py.gov.ips.entities.Unidadmedida;
import py.gov.ips.repository.UnidadMedidaRepo;

/**
 *
 * @author Lorenzo
 */
public class UnidadMedidaServiceImpl {
      private final UnidadMedidaRepo repository;

    public UnidadMedidaServiceImpl(UnidadMedidaRepo repository) {
        this.repository = repository;
    }
        public void save(Unidadmedida unidadMedida) {
        repository.save(unidadMedida);
    }

    public List<Unidadmedida> findAll() {
        return repository.findAll();
    }

    public Optional<Unidadmedida> findByID(Integer id) {
        return repository.findById(id);
    }
    
}
