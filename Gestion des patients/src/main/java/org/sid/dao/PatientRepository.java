/**
 * 
 */
package org.sid.dao;

import org.sid.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Eya_LAM
 *
 */
public interface PatientRepository  extends  JpaRepository< Patient, Long>{
	
	public Page<Patient> findByNomContains(String mc, Pageable pageable);

}
