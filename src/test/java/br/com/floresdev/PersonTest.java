package br.com.floresdev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {

	@Test
	void givenAge_whenCheckMajority_thenReturnBoolean() {
		Person p = new Person("p", LocalDate.of(2000, 1, 1));
		Assertions.assertTrue(p.checkMajority());
	}

	@Test
	void givenLocalDate_whenGetAge_thenReturnAge() {
		Person p = new Person("p", LocalDate.of(2022, 1, 1));
		Assertions.assertEquals(2, p.getAge());
	}
}
