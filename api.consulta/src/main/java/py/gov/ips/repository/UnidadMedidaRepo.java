package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.gov.ips.entities.Unidadmedida;

@Repository
public interface UnidadMedidaRepo extends JpaRepository<Unidadmedida, Integer> {

	

}
