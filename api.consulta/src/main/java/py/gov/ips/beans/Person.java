package py.gov.ips.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String birthday;
	private String gender;
	private String insuranceType;
	private Integer active;
	private String enroled;
	private String lifeInsuranceExpiration;
	private Employer employer;
	
	public Person(py.gov.ips.entities.Person entity){
		this.setFirstName(entity.getFirstName().trim()); 
                this.setLastName(entity.getLastName().trim());
                this.setGender(entity.getGender().trim());
		this.setActive(entity.getActive());
		this.setBirthday(entity.getBirthday().trim());
                this.setEnroled(entity.getEnroled().trim());
                this.setLifeInsuranceExpiration(entity.getLifeInsuranceExpiration().trim());
                this.setInsuranceType(entity.getInsuranceType()); 
		this.setEmployer(entity.getEmployer() != null ? new Employer(entity.getEmployer()) : null);
	}

}
