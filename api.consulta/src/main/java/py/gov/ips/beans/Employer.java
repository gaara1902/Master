package py.gov.ips.beans;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String employerNumber;
	private String name;
	private String state;
	private Integer contributionMonths;
	private Date expiration;
	private String lastPeriodPaid;
	
	public Employer(py.gov.ips.entities.Employer entity) {
		this.employerNumber = entity.getEmployerNumber();
		this.name = entity.getName();
		this.state = entity.getState();
		this.contributionMonths = entity.getContributionMonths();
		this.expiration = entity.getExpiration();
		this.lastPeriodPaid = entity.getLastPeriodPaid();
	}

}
