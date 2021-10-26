/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lorenzo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clientes {
     private Integer idclientes;
    private String fechaAlta;
    private String horaAlta;
    private String idusuarioAlta;
    private String fechaEdit;
    private String horaEdit;
    private String idusuarioEdit;
    private String nombre;
    private String razonsocial;
    private String nroDoc;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String celular;
    private String correo;
    private String estado;

}
