/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package py.gov.ips.service;

import java.util.List;
import java.util.Optional;
import py.gov.ips.entities.Clientes;

/**
 *
 * @author Lorenzo
 */
public interface ClienteService {
    public void save(Clientes clientes);
    public List<Clientes> findAll();
    public Optional<Clientes> findByID(Integer id);
    
}
