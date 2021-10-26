/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Categorias;
import py.gov.ips.repository.CategoriasRepo;

/**
 *
 * @author Lorenzo
 */
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriasRepo repository;

    public CategoriaServiceImpl(CategoriasRepo repository) {
        this.repository = repository;
    }

    public void save(Categorias categorias) {
        repository.save(categorias);
    }

    public List<Categorias> findAll() {
        return repository.findAll();
    }

    public Optional<Categorias> findByID(Integer id) {
        return repository.findById(id);
    }

}
