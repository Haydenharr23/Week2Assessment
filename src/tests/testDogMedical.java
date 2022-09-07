package tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import model.Dog;
import model.dogMedicalInfo;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Sep 6, 2022
 */
public class testDogMedical {
	Dog dog = new Dog("dog",2,LocalDate.now());
	dogMedicalInfo dogMed = new dogMedicalInfo();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNotNeedsVaccinations() {
		dog.setVaccineDate(LocalDate.now().minusYears(2));
		boolean checkShots = dogMed.needsShots(dog);
		assertFalse(checkShots);
	}
	
	@Test
	public void testDoesNeedsVaccinations() {
		dog.setVaccineDate(LocalDate.now().minusYears(5));
		boolean checkShots = dogMed.needsShots(dog);
		assertTrue(checkShots);
	}

}
