package com.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.service.Calculation;

public class CalculationTest {
@Ignore
	@Test
	public void testSum() {
		
		
		Calculation calc= new Calculation();
		int result=calc.sum(100,200);
		assertEquals(3000,result);
		
	}

}
