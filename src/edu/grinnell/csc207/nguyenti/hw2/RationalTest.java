package edu.grinnell.csc207.nguyenti.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalTest {
    Rational exampleOne = new Rational (1, 1);
    Rational exampleTwo = new Rational (7, 23);
    Rational exampleThree = new Rational (3, 2);
    Rational exampleFour = new Rational (-1, 4);

    @Test
    public void testGetNumerator() {
	assertEquals("example one numerator", 1, exampleOne.getNumerator());
	assertEquals("example two numerator", 7, exampleTwo.getNumerator());
	assertEquals("example three numerator", 3, exampleThree.getNumerator());
	assertEquals("example four numerator", -1, exampleFour.getNumerator());
    }

    @Test
    public void testGetDenominator() {
	assertEquals("example one denominator", 1, exampleOne.getDenominator());
	assertEquals("example two denominator", 23, exampleTwo.getDenominator());
	assertEquals("example three denominator", 2, exampleThree.getDenominator());
	assertEquals("example four denominator", 4, exampleFour.getDenominator());
    }

    @Test
    public void testMultiply() {
	Rational exampleOneMultiplied = new Rational(exampleOne.getNumerator(), exampleOne.getDenominator());
	exampleOneMultiplied.multiply(exampleFour);
	Rational exampleTwoMultiplied = new Rational(exampleTwo.getNumerator(), exampleTwo.getDenominator());
	exampleTwoMultiplied.multiply(exampleThree);
	assertEquals("example one multiply numerator", -1, exampleOneMultiplied.getNumerator());
	assertEquals("example one multiply denominator", 4, exampleOneMultiplied.getDenominator());
	assertEquals("example two multiply numerator", 21, exampleTwoMultiplied.getNumerator());
	assertEquals("example two multiply denominator", 46, exampleTwoMultiplied.getDenominator());
    }

    @Test
    public void testDivide() {
	Rational exampleOneDivided = new Rational(exampleOne.getNumerator(), exampleOne.getDenominator());
	exampleOneDivided.divide(exampleFour);
	Rational exampleTwoDivided = new Rational(exampleTwo.getNumerator(), exampleTwo.getDenominator());
	exampleTwoDivided.divide(exampleThree);
	assertEquals("example one divide numerator", 4, exampleOneDivided.getNumerator());
	assertEquals("example one divide denominator", -1, exampleOneDivided.getDenominator());
	assertEquals("example two divide numerator", 14, exampleTwoDivided.getNumerator());
	assertEquals("example two divide denominator", 69, exampleTwoDivided.getDenominator());
    }

    @Test
    public void testComputeValue() {	
	assertEquals("exampleOne value", 1.0/1.0, exampleOne.computeValue(), .1);
	assertEquals("exampleTwo value", 7.0/23.0, exampleTwo.computeValue(), .1);
	assertEquals("exampleThree value", 3.0/2.0, exampleThree.computeValue(), .1);	
	assertEquals("exampleFour value", -1.0/4.0, exampleFour.computeValue(), .1);
    }

    @Test
    public void testAdd() {
	Rational exampleOneAdded = new Rational(exampleOne.getNumerator(), exampleOne.getDenominator());
	exampleOneAdded.add(exampleFour);
	Rational exampleTwoAdded = new Rational(exampleTwo.getNumerator(), exampleTwo.getDenominator());
	exampleTwoAdded.add(exampleThree);
	assertEquals("example one add numerator", 3, exampleOneAdded.getNumerator());
	assertEquals("example one add denominator", 4, exampleOneAdded.getDenominator());
	assertEquals("example two add numerator", 83, exampleTwoAdded.getNumerator());
	assertEquals("example two add denominator", 46, exampleTwoAdded.getDenominator());
    }

    @Test
    public void testSubtract() {
	Rational exampleOneSubtracted = new Rational(exampleOne.getNumerator(), exampleOne.getDenominator());
	exampleOneSubtracted.subtract(exampleFour);
	Rational exampleTwoSubtracted = new Rational(exampleTwo.getNumerator(), exampleTwo.getDenominator());
	exampleTwoSubtracted.subtract(exampleThree);
	assertEquals("example one subtract numerator", 5, exampleOneSubtracted.getNumerator());
	assertEquals("example one subtract denominator", 4, exampleOneSubtracted.getDenominator());
	assertEquals("example two subtract numerator", -55, exampleTwoSubtracted.getNumerator());
	assertEquals("example two subtract denominator", 46, exampleTwoSubtracted.getDenominator());
    }

}
