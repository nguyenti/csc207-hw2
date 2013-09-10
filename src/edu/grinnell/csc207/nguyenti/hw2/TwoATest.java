package edu.grinnell.csc207.nguyenti.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoATest {

    @Test
    public void test_isMultiple() {
	for (long n = 0; n < 100; n++) {
	    assertEquals("positive identity", true, TwoA.isMultiple(n,1));
	    assertEquals("negative identity", true, TwoA.isMultiple(-n, 1));
	} //for
	for (long n = 0; n < 100; n++) {
	    assertEquals ("a is zero", true, TwoA.isMultiple(0, n));
	} //for
	for (long n = 1; n < 100; n++) {
	    assertEquals("zero when n != 0", false, TwoA.isMultiple(n,0));
	} //for
	assertEquals ("both zero", true, TwoA.isMultiple(0, 0));
	for (long n = 2; n < 100; n += 2) {
	    assertEquals("a is even & b is 2", true, TwoA.isMultiple(n, 2));
	} //for
	for (long n = 1; n < 100; n++) {
	    assertEquals("-b < a, a < b", false, TwoA.isMultiple(n, 100));
	} //for
	for (long n = 3; n < 300; n+= 3) {
	    assertEquals("multiples of three", true, TwoA.isMultiple(n, 3));
	} //for
	for (long n = 4; n < 300; n+= 3) {
	    assertEquals("not multiples of three", false, TwoA.isMultiple(n, 3));
	}
    } //test_isMultiple

    @Test
    public void test_isOdd() {
	assertEquals("zero", false, TwoA.isOdd(0));
	for (int n = 2; n < 200; n+= 2) {
	    assertEquals("positive even", false, TwoA.isOdd(n)); 	
	} //for
	for (int n = 1; n < 200; n+= 2) {
	    assertEquals("positive odd", true, TwoA.isOdd(n)); 	
	} //for
	for (int n = -100; n < 0; n+= 2) {
	    assertEquals("negative even", false, TwoA.isOdd(n)); 	
	} //for
	for (int n = -99; n < 0; n+= 2) {
	    assertEquals("negative odd", true, TwoA.isOdd(n)); 	
	} //for
    } //test_isOdd

    @Test
    public void test_oddSumTo(){
	for (int n = -100; n < 2; n++) {
	    assertEquals("no positive odds less than", 0, TwoA.oddSumTo(n));
	} //for
	assertEquals("11", 25, TwoA.oddSumTo(11));
	assertEquals("10", 25, TwoA.oddSumTo(10));
    } //test_OddSumTo

    @Test
    public void test_isOddProd(){
	int[] negTrue = {-3, -5, -10, -20};
	int[] negFalse = {-2, -4, -6, -8, -10};
	int[] posTrue = {3, 5, 10, 20};
	int[] posFalse = {2, 4, 6, 8, 10};
	int[] empty = new int[0];
	int[] oneElement = {1};

	assertEquals("negative true", true, TwoA.isOddProd(negTrue));
	assertEquals("negative false", false, TwoA.isOddProd(negFalse));
	assertEquals("positive true", true, TwoA.isOddProd(posTrue));
	assertEquals("positive false", false, TwoA.isOddProd(posFalse));
	assertEquals("empty array", false, TwoA.isOddProd(empty));
	assertEquals("one element array", false, TwoA.isOddProd(oneElement));
    } //test_isOddProd

    @Test
    public void test_allDistict(){
	int[] empty = new int[0];
	int[] oneElement = {1};
	int[] allDistinctArray = {1, 2, 3, 4, 5, 6, 7};
	int[] notDistinct = {1, 1, 3, 5, 6};
	int[] notAtAllDistinct = {1, 1, 1, 1, 1, 1, 1};

	assertEquals("empty array", true, TwoA.allDistinct(empty));
	assertEquals("one element array", true, TwoA.allDistinct(oneElement));
	assertEquals("distinct array", true, TwoA.allDistinct(allDistinctArray));
	assertEquals("not distinct", false, TwoA.allDistinct(notDistinct));
	assertEquals("not at all distinct", false, TwoA.allDistinct(notAtAllDistinct));
    } //test_allDistinct

    @Test
    public void test_reverseInts(){
	int[] empty = new int[0];
	int[] oneElement = {1};
	int[] allOnes = {1, 1, 1, 1, 1, 1, 1};
	int[] arrayOne = {1, 2, 3, 4, 5};
	int[] reverseArrayOne = {5, 4, 3, 2, 1};
	int[] arrayTwo = {1, 2, 3, 4, 5};

	assertEquals("empty array", empty, TwoA.reverseInts(empty));
	assertEquals("one element", oneElement, TwoA.reverseInts(oneElement));
	assertEquals("all the same", allOnes, TwoA.reverseInts(allOnes));
	assertArrayEquals("1 through 5", reverseArrayOne, TwoA.reverseInts(arrayOne));
	assertArrayEquals("1 through 5 reverse", arrayTwo, TwoA.reverseInts(reverseArrayOne));
	/**
	 * We found assertArrayEquals on:
	 *     www.stackoverflow/questions/4228161
	 *         /comparing-arrays-in-junit-assertions-concise-built-in-way
	 */
    } //reverseInts

}
