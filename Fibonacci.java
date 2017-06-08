/*
	An analysis of Fibonacci sequence with time function
*/

import java.util.*;


public class Fibonacci{

	public static void main(String[] args){

	System.out.println("Simple Fibonacci Sequence Recursive Program");

	int term = 1000000;
	long timeElapsedMillis = 0;

	// Start the timer
	long startTime = System.currentTimeMillis();

	while(timeElapsedMillis < 900000){ // 90,000 ms = 15 mintues limit

		fibonacciSequence(term);

		// Stop the timer
		long stopTime = System.currentTimeMillis();

		// Obtain time elapsed in ms
		timeElapsedMillis = stopTime - startTime;

		//long timeElapsedSeconds = (timeElapsedMillis / 1000) % 60;
		//long seconds = (long) timeElapsedSeconds % 60;
		//long timeElapsedMinutes = (timeElapsedMillis / 1000) / 60;
		//long timeElapsedHours = (timeElapsedMillis /1000) / 60 / 60;
		// Divide by 100 to convert from milliseconds to seconds
		//System.out.printf("n = %d Time Elapsed: %02d:%02d:%02d HH:MM:SS Format\n", term, timeElapsedHours, timeElapsedMinutes, timeElapsedSeconds);

		System.out.printf("n = %d Time Elapsed: %d ms\n", term, timeElapsedMillis);

		// Increment for next Fibo term
		term ++;
		}
		
		System.out.println("Total time elapsed is 15 mintues");
	}


	// Fibonacci Sequence Iterative Method
	/*public static void fibonacciSequence(int n){

		long f[] = new long[n];

		f[0] = 0;
		f[1] = 1;

		for(int i = 2; i<n; i++){
			f[i] = f[i-1] + f[i-2];
		}

		//System.out.println(Arrays.toString(f));


	}*/
	
	// Fibonacci Sequence Recusive Method 
	/*public static int fibonacciSequence(int i){

		// Check for base conditions
		if(i == 0) return 0;
		if(i <= 2) return 1;

		// fn = fn-1 + fn-2
		int fiboTerm = fibonacciSequence(i-1) + fibonacciSequence(i-2);
		return 0;
	}*/

	// Fibonacci Sequence Memorized Recusive Method
	static int fibArray[] = new int[100000000];

	public static int fibonacciSequence(int n){
		//int fibArray[] = new int[n+1];

		if(n == 0) return 0;
		if(n == 1) return 1;

		if(fibArray[n] != 0){
			fibArray[n] = fibonacciSequence(n-1) + fibonacciSequence(n-2);
			return fibArray[n];
		}else{
			return fibArray[n];
		}
	}

}
