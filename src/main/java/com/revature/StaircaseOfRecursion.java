package com.revature;

public class StaircaseOfRecursion {
	
	public int waysToClimb(int a) {
	if(a <= 1) return 1;
	return waysToClimb(a-1) + waysToClimb(a-2);
	}
}
