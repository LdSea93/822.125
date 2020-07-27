package school_Is_Cool;

public class Teacher extends Person {
//quick access attributes:
	static int counter = 0;
//constructor attributes:
	String profession;

	protected Teacher() {
		this.name = "Teacher " + counter++;
		this.age = School.rand.nextInt(25) + 55;
		this.profession = generateProfession();
	}

	protected String getProfession() {
		return profession;
	}

	@Override
	public String toString() {
		return name + " age= " + age + ", profession=" + profession;
	}

	private String generateProfession() {
		String[] professionArray = { "Mathematics", "Chemistry", "Geography", "Literature", "Physics", "Sports" };
		return professionArray[School.rand.nextInt(5)];
	}
}// class