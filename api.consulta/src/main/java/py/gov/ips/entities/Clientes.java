/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.gov.ips.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
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
@Table(name = "clientes")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclientes")
    private Integer idclientes;
    @Size(max = 8)
    @Column(name = "fecha_alta")
    private String fechaAlta;
    @Size(max = 6)
    @Column(name = "hora_alta")
    private String horaAlta;
    @Size(max = 8)
    @Column(name = "idusuario_alta")
    private String idusuarioAlta;
    @Size(max = 8)
    @Column(name = "fecha_edit")
    private String fechaEdit;
    @Size(max = 6)
    @Column(name = "hora_edit")
    private String horaEdit;
    @Size(max = 8)
    @Column(name = "idusuario_edit")
    private String idusuarioEdit;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 45)
    @Column(name = "nroDoc")
    private String nroDoc;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "celular")
    private String celular;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;

    
}
