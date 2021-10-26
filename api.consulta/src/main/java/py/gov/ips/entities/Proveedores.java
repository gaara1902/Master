/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.entities;

import java.io.Serializable;
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
public class Proveedores implements Serializable {

    private Integer idproveedores;
    private String nombre;
    private String nroDocumento;
    private String celular;
    private String correo;
    private String ciudad;
    private String direccion;
    private String estado;

    
}
