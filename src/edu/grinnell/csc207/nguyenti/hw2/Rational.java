package edu.grinnell.csc207.nguyenti.hw2;

public class Rational {
    private int numerator;
    private int denominator;

    /*
     * Constructor, takes two integers to be a numerator and a denominator
     * produces a rational object, with the numerator and denominator stored privately
     */
    public Rational(int n, int d) {
	numerator = n;
	denominator = d;
    }

    /*
     * Observer, retrieves the private numerator value of the rational object
     */
    public int getNumerator() {
	return numerator;
    }

    /*
     * Observer, retrieves the private denominator value of the rational object
     */
    public int getDenominator() {
	return denominator;
    }

    /*
     * Mutator, to be able to change the value of the rational number
     */
    public void multiply(Rational multiplier) {
	numerator *= multiplier.getNumerator();
	denominator *= multiplier.getDenominator();
    }  

    /*
     * Mutator, to be able to change the value of the rational number
     */
    public void divide(Rational divisor) {
	Rational recip = new Rational(divisor.getDenominator(), divisor.getNumerator());
	multiply(recip);
    }

    /*
     * Observer, does not change any values stored but returns the numerator/denominator
     */
    public float computeValue(){
	return (float) numerator/denominator;
    }

    /*
     * Mutator, adds a rational number to a rational number 
     */
    public void add(Rational toAdd){
	numerator = numerator*toAdd.getDenominator() + denominator*toAdd.getNumerator();
	denominator *= toAdd.getDenominator();
    }  

    /*
     * Mutator, subtracts a rational number to a rational number 
     */
    public void subtract(Rational toSubtract){
	Rational neg = new Rational(toSubtract.getNumerator() * -1, toSubtract.getDenominator());
	add(neg);
    }
}

