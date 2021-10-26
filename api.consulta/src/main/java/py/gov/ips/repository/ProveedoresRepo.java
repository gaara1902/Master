package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.gov.ips.entities.Proveedores;

@Repository
public interface ProveedoresRepo extends JpaRepository<Proveedores, Integer> {

}
