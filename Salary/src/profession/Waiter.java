package profession;

public class Waiter extends Person{
	public Waiter() {
		super();
	}
	public Waiter(float x){
		this.salary = x;
	}
	public void printTatalSalary(){
		System.out.println("Waiter's salary: ��"+salary*12);
	}
}
