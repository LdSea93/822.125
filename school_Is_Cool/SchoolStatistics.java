package school_Is_Cool;

public class SchoolStatistics {

	public static void main(String[] args) {

		School sc1 = new School();
		System.out.println(sc1);
//1
		System.out.println("School Average Is: " + School.getTotalSchoolAverageScores());
//2
		// move this method to "school" and make it go for all classes, and call it back
		// from here
		System.out.println("Classroom " + 1 + " Average Is: " + Classroom.getTotalClassroomAverageScores());
//3
		System.out
				.println("Major Averages are:" + "\nChemistry: " + Classroom.getEachMajorClassAverageScores("Chemistry")
						+ "\nMathematics: " + Classroom.getEachMajorClassAverageScores("Mathematics") + "\nGeography: "
						+ Classroom.getEachMajorClassAverageScores("Geography") + "\nLiterature: "
						+ Classroom.getEachMajorClassAverageScores("Literature") + "\nPhysics: "
						+ Classroom.getEachMajorClassAverageScores("Physics") + "\nSports: "
						+ Classroom.getEachMajorClassAverageScores("Sports"));
//4
		System.out.println("School's sports team layout: " + School.getSchoolSportsTeam());
	}// main

}// class