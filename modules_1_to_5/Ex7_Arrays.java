package modules_1_to_5;

import java.util.Arrays;
import java.util.Random;

public class Ex7_Arrays {

	static Random rand = new Random();

	public static void main(String[] args) {
//1
		int[] array10 = new int[10];
		fillArrayWithRand(array10, 100);
		System.out.println(Arrays.toString(array10));
		int sum = 0;
		for (int i = 0; i < array10.length; i++) {
			sum += array10[i];
		}
		System.out.println("Array sum is: " + sum + ", & the average is: " + (double) sum / array10.length);
//2
		int[] array50 = new int[50];
		fillArrayWithRand(array50, 100);
		System.out.println(Arrays.toString(array50));
		int highestNum = 0, highestNumIDX = 0;
		for (int i = 0; i < array50.length; i++) {
			if (array50[i] > highestNum) {
				highestNum = array50[i];
				highestNumIDX = i;
			}
		}
		System.out.println(
				"Highest num in the array is: " + highestNum + ", and it is located in array slot: " + highestNumIDX);
//3
		int[] array10v2 = new int[10];
		fillArrayWithRand(array10v2, 10);
		System.out.println("array10v2 is: \t\t" + Arrays.toString(array10v2));
		System.out.println("deleteDuplicates is: \t" + Arrays.toString(deleteDuplicates(array10v2)));
//4
		int[] array10v3 = new int[10];
		fillArrayWithRand(array10v3, 10);
		System.out.println("array10v3 is: \t\t" + Arrays.toString(array10v3));
		System.out.println("reverseArray is: \t" + Arrays.toString(reverseArray(array10v3)));
	}// main

	private static int[] reverseArray(int[] arrayX) {
		int[] reversedArray = new int[arrayX.length];
		for (int i = 0; i < reversedArray.length; i++) {
			reversedArray[i] = arrayX[arrayX.length - 1 - i];
		}
		return reversedArray;
	}// reverseArray

	private static int[] deleteDuplicates(int[] arrayX) {
		for (int i = 0; i < arrayX.length; i++) {
			for (int j = i + 1; j < arrayX.length; j++) {
				if (arrayX[i] == arrayX[j]) {
					arrayX[j] = -1;
				}
			}
		}
		int counter = 0;
		for (int i = 0; i < arrayX.length; i++) {
			if (arrayX[i] == -1) {
				counter++;
			}
		}
		int[] arrayNew = new int[arrayX.length - counter];
		int steps = 0;
		for (int i = 0; i < arrayX.length; i++) {
			if (arrayX[i] != -1) {
				arrayNew[steps] = arrayX[i];
				steps++;
			}
		}
		return arrayNew;
	}// deleteDuplicates

	private static void fillArrayWithRand(int[] arrayX, int rngLimit) {
		for (int i = 0; i < arrayX.length; i++) {
			arrayX[i] = rand.nextInt(rngLimit);
		}
	}// fillArrayWithRand
}// class