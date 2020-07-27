package school_Is_Cool;

import java.util.Arrays;

public class Classroom {
//quick access attributes:
	static int counter = 0;
	static int numOfStudentsPerClassroom = 15;
//constructor attributes:
	String nameOfClass;
	Teacher teacher;
	Student[] student;

	protected Classroom() {
		this.nameOfClass = "Classroom " + counter++;
		this.teacher = new Teacher();
		this.student = createStudentArray();
	}

	protected String getNameOfClass() {
		return nameOfClass;
	}

	protected Teacher getTeacher() {
		return teacher;
	}

	protected Student[] getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return nameOfClass + ", teacher=" + teacher + ", student=" + Arrays.toString(student) + "]";
	}

	private Student[] createStudentArray() {
		Student[] studentsArray = new Student[numOfStudentsPerClassroom];
		for (int i = 0; i < studentsArray.length; i++) {
			studentsArray[i] = new Student();
		}
		return studentsArray;
	}// createStudentArray

	protected static double getTotalClassroomAverageScores() {
		double sum = 0.0;
		for (int i = 0; i < numOfStudentsPerClassroom; i++) {
			sum += Student.calcStudentAverage(student[i]);
		}
		return sum / numOfStudentsPerClassroom;
	}// getTotalClassroomAverageScores

	protected static double getEachMajorClassAverageScores(String major) {
		double returningGrade = 0.0;
		switch (major) {
		case "Chemistry":
			for (int i = 0; i < School.numOfClassroomsPerSchool; i++) {
				for (int j = 0; j < numOfStudentsPerClassroom; j++) {
					returningGrade += classroom[i].getStudent(j).getGrades(0);
				}
			}
			break;
		case "Mathematics":
			for (int i = 0; i < School.numOfClassroomsPerSchool; i++) {
				for (int j = 0; j < numOfStudentsPerClassroom; j++) {
					returningGrade += classroom[i].getStudent(j).getGrades(1);
				}
			}
			break;
		case "Geography":
			for (int i = 0; i < School.numOfClassroomsPerSchool; i++) {
				for (int j = 0; j < numOfStudentsPerClassroom; j++) {
					returningGrade += classroom[i].getStudent(j).getGrades(2);
				}
			}
			break;
		case "Literature":
			for (int i = 0; i < School.numOfClassroomsPerSchool; i++) {
				for (int j = 0; j < numOfStudentsPerClassroom; j++) {
					returningGrade += classroom[i].getStudent(j).getGrades(3);
				}
			}
			break;
		case "Physics":
			for (int i = 0; i < School.numOfClassroomsPerSchool; i++) {
				for (int j = 0; j < numOfStudentsPerClassroom; j++) {
					returningGrade += classroom[i].getStudent(j).getGrades(4);
				}
			}
			break;
		case "Sports":
			for (int i = 0; i < School.numOfClassroomsPerSchool; i++) {
				for (int j = 0; j < numOfStudentsPerClassroom; j++) {
					returningGrade += classroom[i].getStudent(j).getGrades(5);
				}
			}
			break;
		default:
			System.out.println("Wrong input was inserted to getEachMajorAverageScores");
			return 0;
		}
		return returningGrade;
	}// getTotalSchoolAverageScores

}// class