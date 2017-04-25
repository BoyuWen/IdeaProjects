package main;
import profession.*;

public class run {
	public static void main(String[] args){
		Waiter a = new Waiter(2500f);
		Peasant b = new Peasant(2700f);
		Teacher c = new Teacher(3800f,50f,25);
		Scientist d = new Scientist(5000f,12000f);
		a.printTatalSalary();
		b.printTatalSalary();
		c.printTatalSalary();
		d.printTatalSalary();
	}
}
