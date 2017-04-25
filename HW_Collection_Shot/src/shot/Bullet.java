package shot;

public class Bullet {
	private int num;
	private String model;
	public Bullet(){
		num = 1;
		model = "M54";
	}
	public Bullet(int a,String b){
		num = a;
		model = b;
	}
	public int getNum(){
		return num;
	}
	public String getModel(){
		return model;
	}
	public void show(){
		System.out.println(num + "-" + model);
	}
}
