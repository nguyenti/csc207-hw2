package edu.grinnell.csc207.nguyenti.hw2;

public class TwoB {

    public static int average(int left, int right) {
	//An issue occurs when the sum of left and right is greater than Integer.MAX_VALUE
	double l = (double) (left);
	double r = (double) (right);
	double ave = (l/2 + r/2);
	return (int) ave;
    } // average(int,int)

}
