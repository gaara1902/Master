package py.gov.ips.service;

import py.gov.ips.beans.Person;

public interface InsuredService {
	
	Person getInsuredByCINumber(String documentNumber);

}