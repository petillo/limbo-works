package module01.arrays;

import org.junit.Test;

import ch.fhnw.oop2.module01.Person;

import static org.junit.Assert.*;

/**
 * @author Dieter Holz
 */
public class FamilyTest {

	@Test
	public void testInitialSize(){
		//given
		Family family = new Family(2);

		//when
		int size = family.size();

		//then
		assertEquals(0, size);
	}

	@Test
	public void testSize(){
		//given
		Family family = new Family(2);
		Person person = new Person(30, 50, 1.70);
		family.add(person);

		//when
		int size = family.size();

		//then
		assertEquals(1, size);
	}

	@Test
	public void testAdd() throws Exception {
		//given
		Family family = new Family(2);
		Person person = new Person(30, 50, 1.70);

		//when
		family.add(person);

		//then
		assertTrue(family.isMember(person));
		assertFalse(family.isMember(new Person(35, 45, 1.60)));
	}

	@Test
	public void testGetOldest() throws Exception {
		//given
		Family family = new Family(2);
		Person personA = new Person(30, 50, 1.70);
		Person personB = new Person(35, 45, 1.60);
		family.add(personA);
		family.add(personB);

		//when
		Person oldest = family.getOldest();

		//then
		assertSame(personB, oldest);
	}

	@Test
	public void testFamilyGrows(){
		//given
		Family family = new Family(1);
		Person personA = new Person(30, 50, 1.70);
		Person personB = new Person(35, 45, 1.60);

		family.add(personA);

		//when
		family.add(personB);

		//then
		assertTrue(family.isMember(personA));
		assertTrue(family.isMember(personB));
	}
}