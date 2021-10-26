/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.gov.ips.beans.Person;
import py.gov.ips.entities.Clientes;
import py.gov.ips.service.ClienteService;

/**
 *
 * @author Lorenzo
 */
@RestController
@RequestMapping(value = "/Clientes")
public class ClientesController {

    @Autowired
    ClienteService service;

    @PostMapping()
    private void guardarCliente(@RequestBody Clientes cliente) {
        service.save(cliente);
    }

    @GetMapping()
    private List<Clientes> AllClientes() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_PLAIN_VALUE, MediaType.TEXT_HTML_VALUE})
    public Optional<Clientes> getInsuredByCINumber(
            @PathVariable("id") Integer id) {
        return service.findByID(id);
    }

}
