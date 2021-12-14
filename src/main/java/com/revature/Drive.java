package com.revature;

public class Drive {
	public static void main(String[] args) {
		AlmostPalindrome ap= new AlmostPalindrome();
		System.out.println("Testing Almost Palindrome");
		System.out.println(" abcdcbg >> "+ap.palindrome("abcdcbg"));
		System.out.println(" abccia >> "+ap.palindrome("abccia"));
		System.out.println(" abcdaaa >> "+ap.palindrome("abcdaaa"));
		System.out.println();
		System.out.println("Testing Ways to climb");
		StaircaseOfRecursion se= new StaircaseOfRecursion();
		System.out.println(" waysToClimb(1) >> "+ se.waysToClimb(1));
		System.out.println(" waysToClimb(2) >> "+ se.waysToClimb(2));
		System.out.println(" waysToClimb(5) >> "+ se.waysToClimb(5));

	}
	
}
