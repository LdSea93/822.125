package modules_1_to_5;

import java.util.Random;

public class Ex4_Operators {

	static Random rand = new Random();

	public static void main(String[] args) {
//create & print
		int rngNum1 = rand.nextInt(100) + 1; // no 0 to calculate field of rectangle
		int rngNum2 = rand.nextInt(100) + 1;
		System.out.println("First random number is: " + rngNum1 + "\nSecond random number is: " + rngNum2);
//the sum of the numbers
		System.out.println("The summery of the 2 random numbers is: " + (rngNum1 + rngNum2));
//the average value
		System.out.println("The average of the 2 random numbers is: " + ((double)(rngNum1 + rngNum2)/2));
//the remainder when dividing each in 10
		System.out.println("First number reminder is: "+(rngNum1%10)+"\nSecond number reminder is: "+(rngNum2%10));
//the area of a rectangle where one num is the width and the other is the height
		System.out.println("The area of this random generated rectangle is: " + (rngNum1 * rngNum2)+" squared cm");
	}// main
}// class