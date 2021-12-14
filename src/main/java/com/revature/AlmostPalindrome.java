package com.revature;

public class AlmostPalindrome {

	
	public boolean palindrome(String str) {
		int length = str.length();
		int count = 0;

		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1)) {
				++count;
			}
		}
		
		return (count <=1);
				

	}

}
