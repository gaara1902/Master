/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Usuarios;
import py.gov.ips.repository.UsuariosRepo;

/**
 *
 * @author Lorenzo
 */
public class UsuarioServiceImpl {
      private final UsuariosRepo repository;

    public UsuarioServiceImpl(UsuariosRepo repository) {
        this.repository = repository;
    }
    
    public void save(Usuarios usuarios){ repository.save(usuarios);}
    public List<Usuarios> findAll(){return repository.findAll();}
    public Optional<Usuarios> findByID(Integer id){ return repository.findById(id);}
    
}
