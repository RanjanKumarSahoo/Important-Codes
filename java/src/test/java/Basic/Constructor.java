package Basic;

public class Constructor {
	String gender;
	int age;
	public void humanbeing() {
		System.out.println(this.gender);
		System.out.println(this.age);
	}
	Constructor(String gender, int age)
	{
		this.gender=gender;
		this.age=age;
	}

	public static void main(String[] args) {
Constructor c= new Constructor("male", 27);
c.humanbeing();
	}

}
