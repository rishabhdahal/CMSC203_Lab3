import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//GradebookTester class
class GradeBookTester 
{
	// Declaring two gradebook objects
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		//Initializing the two gradebook objects
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		//Adding scores in the declared variables
		gradeBook1.addScore(85.0);
		gradeBook1.addScore(65.0);
		gradeBook2.addScore(75.0);
		gradeBook2.addScore(80.0);
		gradeBook2.addScore(95.0);
		gradeBook2.addScore(55.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		// assign to null
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testAddScore() 
	{
		assertTrue((gradeBook1.toString()).equals("85.0 65.0 "));
		assertTrue((gradeBook2.toString()).equals("75.0 80.0 95.0 55.0 "));
	}

	@Test
	void testSum() 
	{
		assertEquals(150.0, gradeBook1.sum(), 0.1);
		assertEquals(305.0, gradeBook2.sum(), 0.1);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(65.0, gradeBook1.minimum(), 0.1);
		assertEquals(55.0, gradeBook2.minimum(), 0.1);
	}

	 @Test
	  public void testFinalScore() {
	    assertEquals(85.0, gradeBook1.finalScore(), .0001);
	  }
}
