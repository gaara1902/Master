package py.gov.ips.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import py.gov.ips.beans.Person;
import py.gov.ips.exception.IpsException;
import py.gov.ips.repository.PersonRepository;

@Service
public class InsuredServiceImpl implements InsuredService {

    private final PersonRepository repository;

    public InsuredServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person getInsuredByCINumber(String documentNumber ) {
        py.gov.ips.entities.Person entity = repository.getInsuredByCINumber(documentNumber);
        if (!documentNumber.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new IpsException(HttpStatus.BAD_REQUEST, new py.gov.ips.beans.Error("Parámetros inválidos", "g101"));
        }
        if (null != entity) {
            return new Person(entity);
        } else {
            throw new IpsException(HttpStatus.NOT_FOUND, new py.gov.ips.beans.Error("usuario con cédula " + documentNumber + "  no existe", "g100"));
        }

    }

}
