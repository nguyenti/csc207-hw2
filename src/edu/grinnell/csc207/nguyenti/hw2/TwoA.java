package edu.grinnell.csc207.nguyenti.hw2;

/**
 * 
 * @author nguyenti (Tiffany)
 * @author goldstei1 (Daniel)
 * @author lewismar (Mark)
 * @author wheelere (Earnest)
 * 
 * CSC 207 (Rebelsky) Assignment 2
 *
 * Citations:
 * Unit Testing Reading and Lab found online at:
 *     http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2013F
 *         /readings/unit-testing.html
 *     http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2013F
 *         /labs/unit-testing.html
 * In order to properly follow Java conventions, we used information
 *     found online at:
 *     http://www.oracle.com/technetwork/java/javase/documentation
 *         /codeconvtoc-136057.html
 * Sun Microsystems. (1999, April 20). Code conventions for the 
 *     java tm programming language. Retrieved from:
 *     http://www.oracle.com/technetwork/java/javase/documentation
 *         /codeconvtoc-136057.html
 */


public class TwoA {
    /**
     * Takes integers a and b and checks if there is an integer
     * i such that a == b*i. Returns true if i exists and false
     * if not.
     */
    public static boolean isMultiple(long a, long b) {
	if (a == 0 && b == 0) {
	    return true;
	} //a==b==0
	if (a == 0) {
	    return true;
	} //a==0
	if (b == 0) {
	    return false;
	} //b==0
	if (b == 1) {
	    return true;
	} //b ==1
	if (a % b == 0) {
	    return true;
	} //a % b == 0
	return false; //if not a multiple and hasn't satisfied the other cases
    } //isMultiple

    /**
     * Takes an integer i and checks if it is odd.
     * Returns true if odd and false if not.
     */
    public static boolean isOdd(int i) {
	if (i == 1 || i == -1) {
	    return true;
	}  
	if (isMultiple(i, 2)) {
	    return false;
	} //isMultiple(i, 2)
	return true;
    } //isOdd	

    /**
     * Computes and returns the sum of all positive odd 
     * integers that are less than an integer n. If n is 1
     * or less, returns 0.
     */
    public static int oddSumTo(int n) {
	int sum = 0;
	/**
	 * This equation is true for all even n.
	 * When an even is incremented to n+1, the result is the same.
	 * It's true for n = 2, and f(n+2) = (n/2)^2 + (n+1) = f(n) + (n+1).
	 * This is equivalent to adding the next odd number when incremented by 2.
	 */ 
	if (n >= 0) {
	    sum = (n / 2) * (n / 2);
	} 
	return sum;
    } //oddSumTo

    /**
     * Takes an array of integers and checks if any product of two of 
     * the integers in the array is odd. Returns true if there is at
     * least one odd product, and false if not.
     */
    public static boolean isOddProd(int[] ints) {
	//there is an odd product if at least two elements in the array are odd
	int count = 0;
	for (int i = 0; i < ints.length && count < 2; i++) {
	    if (isOdd(ints[i])) {
		count++;
	    } //isOdd(ints[i])
	} //for ints
	return (count > 1);

    } //oddSumTo

    /**
     * Takes an array of integers and checks if all of the elements
     *     in it are unique.
     * Returns true if all elements are unique or false if any two 
     *     elements are the same.
     */
    public static boolean allDistinct(int[] ints) {
	if (ints.length < 2) {
	    return true;
	} //if ints.length < 2
	for (int i = 0; i < ints.length -1; i++) {
	    for (int j = i+1; j < ints.length; j++) {
		if (ints[i] == ints[j]) {
		    return false;
		} //if int[i] == int[j]
	    }//for
	} //for
	return true;
    } //allDistinct

    /**
     * Takes an array of integers and reverses it.
     * Returns the address of the array given, with the elements in
     *     reverse order.
     */
    public static int[] reverseInts(int[] ints) {
	for (int i = 0; i < ints.length/2; i++) {
	    int temp = ints[i];
	    ints[i] = ints[ints.length-(i+1)];
	    ints[ints.length-(i+1)] = temp;
	} //for
	return ints;
    } //reverseInts
} //TwoA
