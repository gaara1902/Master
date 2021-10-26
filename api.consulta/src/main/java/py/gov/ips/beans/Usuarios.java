/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.beans;

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
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer idusuarios;
    private String nombrePersona;
    private String user;
    private String pass;
    private String estado;
    private Privilegios idprivilegio;

    
}
