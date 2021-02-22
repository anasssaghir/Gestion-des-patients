package org.sid;

import java.util.Date;

import org.sid.dao.PatientRepository;
import org.sid.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPatientsApplication implements  CommandLineRunner {
    
	@Autowired
	private PatientRepository patientRepository ;
	public static void main(String[] args) {
		SpringApplication.run(DemoPatientsApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient (null,"Aya", new Date(),false,34));
		patientRepository.save(new Patient (null,"Meriem", new Date(),true,15));
		patientRepository.save(new Patient (null,"Oumaima", new Date(),false,60));
		patientRepository.findAll().forEach(p ->{
			System.out.println(p.getNom());
		});
		
		
		
	}

}
