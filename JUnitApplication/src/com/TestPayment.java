package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestPayment {


@Test // check if FindBiggest() method returns right results
public void runFindBiggest() {
	// assertEquals check if first argument is equal to 2nd
	assertEquals(115, Calculator.findBiggest(10, 10, 115));

}

@Test // check if FindMax() method returns right results
public void runFindMax() {
	int[] myArray = { 100, 20, 30, 1500, 400 };
	assertEquals(40, Calculator.findMax(myArray));

}
}
