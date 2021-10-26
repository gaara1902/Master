package py.gov.ips.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorias implements Serializable {

    private Integer idCategorias;
    private String descripcion;
    private String estado;

}
