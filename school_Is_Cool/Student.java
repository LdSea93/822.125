package school_Is_Cool;

import java.util.Arrays;

public class Student extends Person {
//quick access attributes:
	static int counter = 0;
	static int numOfGradesPerStudent = 6;
//constructor attributes:
	int[] grades;

	protected Student() {
		this.name = "Student " + counter++;
		this.age = School.rand.nextInt(25) + 20;
		this.grades = generateStudentGrades();
	}

	protected int[] getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		return name + " age= " + age + ", grades=" + Arrays.toString(grades);
	}

	private int[] generateStudentGrades() {
		int[] grades = new int[numOfGradesPerStudent];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = School.rand.nextInt(60) + 40;
		}
		return grades;
	}// generateStudentGrades

	protected static double calcStudentAverage(Student studentX) {
		double sum = 0.0;
		for (int i = 0; i < studentX.grades.length; i++) {
			sum += studentX.grades[i];
		}
		return sum / studentX.grades.length;
	}// calcStudentAverage

}// class