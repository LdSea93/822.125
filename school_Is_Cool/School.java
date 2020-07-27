package school_Is_Cool;

import java.util.Arrays;
import java.util.Random;

public class School {
//quick access attributes:
	static Random rand = new Random();
	static int numOfClassroomsPerSchool = 5;
//constructor attributes:
	Classroom[] classroom;

	protected School() {
		this.classroom = generateClassroomArray();
	}

	protected Classroom[] getClassroom() {
		return classroom;
	}

	@Override
	public String toString() {
		return "School [classroom=" + Arrays.toString(classroom) + "]";
	}

	private Classroom[] generateClassroomArray() {
		Classroom[] classroomArray = new Classroom[numOfClassroomsPerSchool];
		for (int i = 0; i < classroomArray.length; i++) {
			classroomArray[i] = new Classroom();
		}
		return classroomArray;
	}

	protected static double getTotalSchoolAverageScores() {
		double sum = 0.0;
		for (int i = 0; i < numOfClassroomsPerSchool; i++) {
			sum += classroom[i].getTotalClassroomAverageScores();
		}
		return sum / numOfClassroomsPerSchool;
	}// getTotalSchoolAverageScores

	protected static void getSchoolSportsTeam() {
		// xxxx ==== reach inside each student, pull i=5 in the grade array
		for (int i = 0; i < numOfClassroomsPerSchool * Classroom.numOfStudentsPerClassroom; i++) {
			if (xxxx >= 90) {
				System.out.println(student name);
			}
		}
		return null;
	}// getSchoolSportsTeam

}// class