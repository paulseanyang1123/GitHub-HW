package com.virtualpairprogrammers.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
//		fail("Not yet implemented");
		ISBNValidator validator= new ISBNValidator();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first ISBN",result);
		
		result = validator.checkISBN("0140177396");
		assertTrue("second ISBN",result);
		
		
		
	}
	@Test
	public void checkAnInValidISBN() {
//		fail("Not yet implemented");
		ISBNValidator validator= new ISBNValidator();
		boolean result = validator.checkISBN("0140449116");
		assertFalse(result);
	}
	@Test(expected=NumberFormatException.class)
	
	public void nine_digit_ISBN_are_not_allowed()
	    {
		ISBNValidator validator= new ISBNValidator();
		validator.checkISBN("123456789");
		
	    }
	@Test( expected =NumberFormatException.class)
	public void NonNumericISBNAreNotAllowed()
	        {
		ISBNValidator validator= new ISBNValidator();
		validator.checkISBN("hwlloworld");
	        }
	
}
