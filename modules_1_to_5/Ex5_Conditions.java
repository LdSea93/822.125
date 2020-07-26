package modules_1_to_5;

import java.util.Random;

public class Ex5_Conditions {

	static Random rand = new Random();

	public static void main(String[] args) {
// 1
		printBigger(rand.nextInt(101), rand.nextInt(101));
// 2
		checkEqualTo50(rand.nextInt(101));
// 3
		bigOrSmallAndIsItEven(rand.nextInt(101));
// 4
		SalaryRaiser(rand.nextInt(1001) + 5000);
// 5
		printBiggestOfThree(rand.nextInt(101), rand.nextInt(101), rand.nextInt(101));
// 6
		salaryTax(rand.nextInt(115000));
// 7
		isLeapYear(rand.nextInt(2021));
	}// main

	private static void isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a Leap Year!");
		} else {
			System.out.println(year + " is not a Leap Year!");
		}
	}// isLeapYear

	private static void salaryTax(int highSalary) {
		System.out.println("Salary Pre-Tax is: " + highSalary);
		if (highSalary <= 23000) {
			System.out.println("Salary with 10% tax step is: " + (highSalary * 0.9));
		} else {
			if (highSalary <= 50001) {
				System.out.println("Salary with 20% tax step is: " + (20700 + ((highSalary - 23000) * 0.8)));
			} else {
				if (highSalary <= 100001) {
					System.out.println("Salary with 30% tax step is: " + (42300 + ((highSalary - 50000) * 0.7)));
				} else {
					System.out.println("Salary with 40% tax step is: " + (77300 + ((highSalary - 100000) * 0.6)));
				}
			}
		}
	}// salaryTax

	private static void printBiggestOfThree(int rngNum1, int rngNum2, int rngNum3) {
		System.out.println("biggest of the 3 is: " + Math.max(Math.max(rngNum1, rngNum2), rngNum3) + " (" + rngNum1
				+ ", " + rngNum2 + ", " + rngNum3 + ")");
		// with advanced java utilities i would obtain "int..." as inputs,
		// and use a loop to go trough the int array and search for the highest input.
	}// printBiggestOfThree

	private static void SalaryRaiser(int salary) {
		if (salary < 6000) {
			System.out.println("Current salary: " + salary);
			salary *= 1.1;
			System.out.println("Raised salary: " + salary);
		}
	}// SalaryRaiser

	private static void bigOrSmallAndIsItEven(int numX) {
		if (numX > 50) {
			System.out.println("Number inserted is bigger than 50 (" + numX + ")");
		} else {
			System.out.println("Number inserted is smaller than 50 (" + numX + ")");
		}
		if (numX % 2 == 0) {
			System.out.println(numX + " is Even");
		} else {
			System.out.println(numX + " is Odd");
		}
	}// bigOrSmallAndIsItEven

	private static void checkEqualTo50(int numX) {
		if (numX == 50) {
			System.out.println("Bingo!, RNG is equal to 50");
		} else if (numX > 50) {
			System.out.println("Big!, RNG is Bigger than 50");
		} else {
			System.out.println("Small!, RNG is Smaller than 50");
		}
	}// checkEqualTo50

	private static void printBigger(int numX, int numY) {
		System.out.println("The bigger RNG is: " + Math.max(numX, numY) + " (" + numX + ", " + numY + ")");
	}// printBigger
}// class