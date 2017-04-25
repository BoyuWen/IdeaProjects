package animal;

public class Food {
	protected String name;
	public Food(String a){
		this.name = a;
	}
	public Food(){
		this.name = "Food";
	}
	public String getName(){
		return this.name;
	}
}
