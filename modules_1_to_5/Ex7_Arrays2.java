package modules_1_to_5;

import java.util.Arrays;
import java.util.Random;

public class Ex7_Arrays2 {

	static Random rand = new Random();

	public static void main(String[] args) {
//5
		int numOfStudents = 20;
		int numOfGrades = 10;
		int[][] class1 = new int[numOfStudents][numOfGrades];
		// fill with grades
		for (int i = 0; i < numOfStudents; i++) {
			for (int j = 0; j < numOfGrades; j++) {
				class1[i][j] = rand.nextInt(101);
			}
		}
		// printing 2D array:
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(Arrays.toString(class1[i]));
		}
		// calc & print student average & class average:
		double studentAverageSum;
		double classAverageSum = 0;
		for (int i = 0; i < numOfStudents; i++) {
			studentAverageSum = 0;
			for (int j = 0; j < numOfGrades; j++) {
				studentAverageSum += class1[i][j];
			}
			classAverageSum += studentAverageSum;
			System.out.println("Student " + i + " Avrage is: " + studentAverageSum / numOfGrades);
		}
		System.out.println("Class avrage is: " + classAverageSum / numOfStudents / numOfGrades);
	}// main
}// class