package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.gov.ips.entities.Privilegios;

@Repository
public interface PrivilegiosRepo extends JpaRepository<Privilegios, Integer> {

}
