package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HumanTest {
	private Human human;
	
	
	@Before
	public void before() {
		human= new Human();
		String name="Jhoset";
		human.setName(name);
		human.setHigh(170.0);
	}
	
	@Test
	public void testGetNameLength() {
		assertEquals(6, human.getNameLength());
			
		}
	
	@Test
	public void testdivisionHigh() {
		assertEquals(10.0, human.divisionHigh(17.0), 0.1);
	}

}
