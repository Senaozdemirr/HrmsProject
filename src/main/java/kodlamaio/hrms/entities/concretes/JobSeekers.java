package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")

public class JobSeekers extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_seekers_id")
	private int id;

	
	@Column(name = "first_name")
	private String firstName;
	
	
	@Column(name = "last_name")
	private String lastName;

	
	@Column(name = "national_identity")
	private String nationalIdentity;
	
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;


	public String getNationalIdentity() {
		
		return null;
	}


	public String getFirstName() {
		
		return null;
	}


	public String getLastName() {
		
		return null;
	}


	public int getDateOfBirth() {
		
		return 1;
	}
	
}
