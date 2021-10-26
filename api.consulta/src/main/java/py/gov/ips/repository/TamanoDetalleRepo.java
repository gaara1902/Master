package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.gov.ips.entities.TamanoDetalle;

@Repository
public interface TamanoDetalleRepo extends JpaRepository<TamanoDetalle, Integer> {


}
