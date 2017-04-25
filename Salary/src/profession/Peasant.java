package profession;

public class Peasant extends Person{
	public Peasant() {
		super();
	}
	public Peasant(float x) {
		this.salary = x;
	}
	public void printTatalSalary(){
		System.out.println("Peasant's salary: гд"+salary*12);
	}
}
