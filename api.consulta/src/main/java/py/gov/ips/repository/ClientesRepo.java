package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.gov.ips.entities.Clientes;


@Repository
public interface ClientesRepo extends JpaRepository<Clientes, Integer> {

	

}
