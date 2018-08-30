package com.accenture.tcf.java.junit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.tcf.java.exception.URException;

public class TestStringUtils extends TestCase {

	private StringUtils su;

	@Before
	public void setUp(){
		su = new StringUtils();
	}

	@After
	public void tearDown(){
		su = null;
	}

	@Test
	public void testIsPalindrome(){
		String word = "Hannah";

		try {
			assertEquals(true, su.isPalindrome(word));
		} catch (URException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testIsPalindrome_False(){
		String word = "Kahit Ano";

		try {
			assertEquals(false, su.isPalindrome(word));
		} catch (URException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testIsPalindrome_Negative(){
		String word = "asdfas@asdfasd";


		try{
			su.isPalindrome(word);
		} catch (URException e){
			assertEquals("You are the only exception in my life - Renz", e.getMessage());
		}
	}

}
