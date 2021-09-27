package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.Calculation;

class test {

	
	
	@Test
	void findMax() {
		int [] array =  {1,3,5,67,8};
		assertEquals(67,Calculation.findMax(array));
	}
	
	@Test
	void cube() {
		int first = 3;
		assertEquals(27,Calculation.cube(first));
	}

}
