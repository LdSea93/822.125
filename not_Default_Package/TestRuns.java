package not_Default_Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestRuns {

	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//GUI
		printGUI();
//list + Object creation
		List<Student> jB122_125 = new ArrayList<>();
		jB122_125.add(new Student("Noam"));
		jB122_125.add(new Student("Tom"));
		jB122_125.add(new Student("Marina"));
		jB122_125.add(new Student("Ron"));
		jB122_125.add(new Student("Ido S"));
		jB122_125.add(new Student("Meital"));
		jB122_125.add(new Student("Shmuel"));
		jB122_125.add(new Student("Elad"));
		jB122_125.add(new Student("Tal"));
		jB122_125.add(new Student("Dana"));
		jB122_125.add(new Student("Hagay"));
		jB122_125.add(new Student("Liam"));
		jB122_125.add(new Student("Hadar"));
		jB122_125.add(new Student("Ori"));
		jB122_125.add(new Student("Ido Z"));
		jB122_125.add(new Student("Dana Klinger"));
		jB122_125.add(new Student("Ofir"));
//use userInput
		takeActionFromGUI(jB122_125);
		scan.close();
	}// main

	private static void printGUI() {
		System.out.println("Welcome to \"Sort My Classroom\"");
		System.out.println("To Start, Choose an action");
		System.out.println("1 - Sort By Name Descending \t(יורד)");
		System.out.println("2 - Sort By Name Ascending \t(עולה)");
		System.out.println("3 - Sort By Id Descending \t(יורד)");
		System.out.println("4 - Sort By Id Ascending \t(עולה)");
		System.out.println("5 - Sort By Age Descending \t(יורד)");
		System.out.println("6 - Sort By Age Ascending \t(עולה)");
		System.out.println("7 - Sort By Are They Nice? \t(יורד)");
		System.out.println("9 - Thank You and good bye");
		System.out.println("Please Choose:");
	}

	private static void takeActionFromGUI(List<Student> jB122_125) {

		String userInput = scan.next();
		while (userInput != "9") {
			switch (userInput) {
			case "1":
				// Sort By Name Descending
				Collections.sort(jB122_125, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o2.getName().compareTo(o1.getName());
					}// compare
				});
				System.out.println(jB122_125);
				break;
			case "2":
				// Sort By Name Ascending
				Collections.sort(jB122_125, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}// compare
				});
				System.out.println(jB122_125);
				break;
			case "3":
				// Sort By Id Descending
				Collections.sort(jB122_125, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o2.getId() - o1.getId();
					}// compare
				});
				System.out.println(jB122_125);
				break;
			case "4":
				// Sort By Id Ascending
				Collections.sort(jB122_125, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getId() - o2.getId();
					}// compare
				});
				System.out.println(jB122_125);
				break;
			case "5":
				// Sort By Age Descending
				Collections.sort(jB122_125, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return (int) (o2.getAge() - o1.getAge());
					}// compare
				});
				System.out.println(jB122_125);
				break;
			case "6":
				// Sort By Age Ascending
				Collections.sort(jB122_125, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return (int) (o1.getAge() - o2.getAge());
					}// compare
				});
				System.out.println(jB122_125);
				break;
			case "7":
				// האזרח הקטן אני?
				break;
			case "9":
				System.out.println("Thank you for using our highly sophisticated software,");
				System.out.println("Have a great day, Goodbye.");
				break;
			default:
				System.out.println("wtf happened?, what did you insert?!?");
				break;
			}
			userInput = scan.next();
		}
	}// takeActionFromGUI

}// class