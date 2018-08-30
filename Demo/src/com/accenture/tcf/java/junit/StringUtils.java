package com.accenture.tcf.java.junit;

import com.accenture.tcf.java.exception.URException;

public class StringUtils {

	public boolean isPalindrome(String word) throws URException {

		for(char c : word.toCharArray()){
			if( c == '@'){
				throw new URException("You are the only exception in my life - Renz");
			}
		}

		StringBuilder sb = new StringBuilder(word);
		return word.equalsIgnoreCase(sb.reverse().toString());
	}
}
