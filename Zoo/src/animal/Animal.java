package animal;

public class Animal{
	protected String name;
	public Animal(){this.name = "Animal";}
	public void eat(Food x){
		System.out.println(this.name+"³Ô"+x.getName());
	}
}
