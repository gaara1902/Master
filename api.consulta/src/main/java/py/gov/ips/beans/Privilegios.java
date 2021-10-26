/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.beans;

import java.util.List;
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
public class Privilegios {
    private Integer idprivilegio;
    private String descripcion;
    private String estado;
    private List<Usuarios> listUsuarios;
    
}
