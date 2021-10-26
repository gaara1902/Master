package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.gov.ips.entities.Marcas;


@Repository
public interface MarcasRepo extends JpaRepository<Marcas, Integer> {

}
