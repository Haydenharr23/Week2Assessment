package tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import model.Dog;

/**
 * Hayden Harris - CIS175 
 * DMACC FALL 2022
 * Sep 6, 2022
 */
public class testDog {
	Dog dog = new Dog("Buddy",1,LocalDate.now());
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testName() {
		dog.setName("Sausage");
		assertEquals("Sausage",dog.getName());
	}
	
	@Test
	public void testAge() {
		dog.setAge(10);
		assertEquals(10,dog.getAge());
	}

}
