package modules_1_to_5;

import java.util.Random;

public class Ex6_Loops {

	static Random rand = new Random();

	public static void main(String[] args) {

//1
		printAllUpTo(rand.nextInt(10) + 1);
//2
		printBetween(rand.nextInt(10) + 1, rand.nextInt(100) + 1);
//3
		printEvensUpTo(rand.nextInt(22) + 3);
//4
		devideByDenUpToMax(rand.nextInt(10) + 1, rand.nextInt(100) + 1);
//5
		doCoolThingsWithThisNumber(rand.nextInt(10001));
//6
		isItPalindrome(rand.nextInt(100001));
//7
		whatIsTheFactorialOf(rand.nextInt(10) + 1); // limited to 15
//8
		iFibonacciXtimes(rand.nextInt(30));
//9
		iFibonacciUpToX(rand.nextInt(50));
//10
		sevenBoom();
	}// main

	private static int reverseThisNum(int numX) {
		int reversed = 0;
		while (numX != 0) {
			int digit = numX % 10;
			reversed = reversed * 10 + digit;
			numX /= 10;
		}
		return reversed;
	}// reverseThisNum

	private static void sevenBoom() {
		System.out.println("\tsevenBoom was Activated");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 || (i % 10) == 7 || (i / 10) == 7) {
				System.out.println("boom");
			} else {
				System.out.println(i);
			}
		}
	}// sevenBoom

	private static void iFibonacciUpToX(int numX) {
		System.out.println("\tiFibonacciUpToX was Activated (" + numX + ")");
		int fiboLow = 1, fiboHigh = 1, fiboPrint = 1;
		while (fiboPrint < numX) {
			System.out.println(fiboPrint);
			fiboPrint = fiboLow + fiboHigh;
			fiboLow = fiboHigh;
			fiboHigh = fiboPrint;
		}
	}// iFibonacciUpToX

	private static void iFibonacciXtimes(int numX) {
		System.out.println("\tiFibonacciXtimes was Activated (" + numX + ")");
		int fiboLow = 1, fiboHigh = 1, fiboPrint = 1;
		for (int i = 0; i < numX; i++) {
			System.out.println(fiboPrint);
			fiboPrint = fiboLow + fiboHigh;
			fiboLow = fiboHigh;
			fiboHigh = fiboPrint;
		}
	}// iFibonacciXtimes

	private static void whatIsTheFactorialOf(int numX) {
		System.out.println("\twhatIsTheFactorialOf was Activated (" + numX + ")");
		int mult = 1;
		for (int i = 1; i <= numX; i++) {
			mult *= i;
		}
		System.out.println(mult);
	}// whatIsTheFactorialOf

	private static void isItPalindrome(int numX) {
		System.out.println("\tisItPalindrome was Activated (" + numX + ")");
		if (numX == reverseThisNum(numX)) {
			System.out.println("Is " + numX + " a palindrome? = True");
		} else {
			System.out.println("Is " + numX + " a palindrome? = False");
		}
	}// isItPalindrome

	private static void doCoolThingsWithThisNumber(int numX) {
		System.out.println("\tdoCoolThingsWithThisNumber was Activated (" + numX + ")");
		// 1 -> number of digits:
		String numXstring = "" + numX;
		System.out.println("The length of " + numX + " is: " + numXstring.length());
		// 2 -> the leftest digit:
		System.out.println("The first left digit of " + numX + " is: " + numXstring.charAt(0));
		// 3 -> sum of the whole number’s digits:
		int sumOfNumX = 0, numXcopy = numX;
		while (numXcopy != 0) {
			int digit = numXcopy % 10;
			sumOfNumX += digit;
			numXcopy /= 10;
		}
		System.out.println("The sum of all digits of " + numX + " is: " + sumOfNumX);
		// 4 -> reverse the number:
		System.out.println(numX + " Inverted = " + reverseThisNum(numX));
	}// doCoolThingsWithThisNumber

	private static void devideByDenUpToMax(int max, int den) {
		System.out.println("\tdevideByDenUpToMax was Activated (" + max + ", " + den + ")");
		if (max < den) {
			int temp = max;
			max = den;
			den = temp;
		}
		for (int i = den; i < max; i++) {
			if (i % den == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}// devideByDenUpToMax

	private static void printEvensUpTo(int numX) {
		System.out.println("\tprintEvensUpTo was Activated (" + numX + ")");
		for (int i = 2; i < numX; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}// printEvensUpTo

	private static void printBetween(int numX, int numY) {
		System.out.println("\tprintBetween Activated, rng are: (" + numY + ", " + numX + ")");
		if (numX < numY) {
			int temp = numX;
			numX = numY;
			numY = temp;
		}
		for (int i = numY + 1; i < numX; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}// printBetween

	private static void printAllUpTo(int numX) {
		System.out.println("\tprintAllUpTo Activated, rng is: (" + numX + ")");
		for (int i = 1; i <= numX; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}// printAllUpTo
}// class