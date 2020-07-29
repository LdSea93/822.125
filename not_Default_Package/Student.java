package not_Default_Package;

import java.util.Random;

public class Student {

	static Random rand = new Random();
	private static int counter = 0;
	
	private int id;
	private String name;
	private float age;
	private boolean isNice;

	protected Student(String name) {
		this.id = counter++;
		this.name = name;
		this.age = rand.nextFloat()*20+20;
		this.isNice = rand.nextBoolean();
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected float getAge() {
		return age;
	}

	protected void setAge(float age) {
		this.age = age;
	}

	protected boolean isNice() {
		return isNice;
	}

	protected void setNice(boolean isNice) {
		this.isNice = isNice;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", isNice=" + isNice + "]";
	}

	
}// class