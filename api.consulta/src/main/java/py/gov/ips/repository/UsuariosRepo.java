package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.gov.ips.entities.Usuarios;

@Repository
public interface UsuariosRepo extends JpaRepository<Usuarios, Integer> {

	

}
