
public class student 
{
	private String name;
	private int age;
	private char gender;
	
	public student(String sName, int sAge, char sGender)
	{
		this.name = sName;
		this.age = sAge;
		this.gender = sGender;
	}
	
	public void showStudent()
	{
		System.out.println("Name:" + this.name + "\nAge:" + this.age + "\nGender:" + this.gender);
	}
}
