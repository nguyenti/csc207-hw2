package edu.grinnell.csc207.nguyenti.hw2;



public class TwoA {
    public static boolean isMultiple(long a, long b){
	if (a == 0 && b== 0){
	    return true;
	} //a==b==0
	if (a == 0){
	    return true;
	} //a==0
	if (b == 0){
	    return false;
	} //b==0
	if(b == 1){
	    return true;
	} //b ==1
	if(a % b == 0){
	    return true;
	} //a % b == 0
	return false; //if not a multiple and hasn't satisfied the other cases
    } //isMultiple
    
    public static boolean isOdd(int i){
	if(i == 1 || i == -1){
	    return true;
	}  
	if(isMultiple(i, 2)){
	    return false;
	} //isMultiple(i, 2)
	return true;
    } //isOdd	
    
    public static int oddSumTo(int n){
	int sum = 0;
	for(int i = 1; i < n; i+= 2){
	    sum += i;
	} //for
	return sum;
    } //oddSumTo
    
    public static boolean isOddProd (int[] ints){
	//there is an oddProd if two elements in the array are odd
	int count = 0;
	for(int i = 0; i < ints.length && count < 2; i++){
	    if (isOdd(ints[i])){
		count++;
	    } //isOdd(ints[i])
	} //for ints
	return (count > 1);
	    
    } //oddSumTo
    
    public static boolean allDistinct(int[] ints){
	if(ints.length < 2){
	    return true;
	} //if ints.length < 2
	for(int i = 0; i < ints.length -1; i++){
	    for(int j = i+1; j < ints.length; j++){
		if(ints[i] == ints[j]){
		    return false;
		} //if int[i] == int[j]
	    }//for
	} //for
	return true;
    } //allDistinct
    
    public static int[] reverseInts(int[] ints){
	for(int i = 0; i < ints.length/2; i++){
	    int temp = ints[i];
	    ints[i] = ints[ints.length-(i+1)];
	    ints[ints.length-(i+1)] = temp;
	} //for
	return ints;
    } //reverseInts
    public static void main(String[] args) {
	
	int[] seven = {1, 2, 3, 4, 5, 6, 7, 8};
	reverseInts(seven);
	for(int i = 0; i < 8; i++) {
	    System.out.print(seven[i] + " ");
	}
    }
} //TwoA
