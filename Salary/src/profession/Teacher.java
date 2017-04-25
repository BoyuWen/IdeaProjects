package profession;

public class Teacher extends Person{
	private float dailysalary;
	private int days;
	public Teacher() {
		super();
		this.dailysalary = 0f;
		this.days = 0;
	}
	public Teacher(float x,float y,int z) {
		this.salary = x;
		this.dailysalary = y;
		this.days = z;
	}
	public void printTatalSalary(){
		System.out.println("Teacher's salary: гд" + (salary*12+days*dailysalary));
	}
}
