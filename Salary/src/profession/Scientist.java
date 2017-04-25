package profession;

public class Scientist extends Person{
	private float year_endbonus;
	public Scientist() {
		super();
		this.year_endbonus = 0;
	}
	public Scientist(float x,float y) {
		this.salary = x;
		this.year_endbonus = y;
	}
	public void printTatalSalary(){
		System.out.println("Scientist's salary: гд" + (salary*12+year_endbonus));
	}
}
