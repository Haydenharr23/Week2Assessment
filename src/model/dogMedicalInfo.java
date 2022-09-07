package model;

import java.time.LocalDate;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Sep 6, 2022
 */
public class dogMedicalInfo {

	public boolean needsShots(Dog dog) {
		LocalDate today = LocalDate.now();
		if(dog.getLastVaccination().isBefore(today.minusYears(3))) {
			return true;
		} else {
			return false;
		}
	}
}
