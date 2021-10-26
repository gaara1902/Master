package py.gov.ips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import py.gov.ips.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	@Query("SELECT p FROM Person p where p.documentNumber = ?1")
	Person getInsuredByCINumber(String documentNumber);

}
