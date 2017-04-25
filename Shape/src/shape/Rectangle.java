package shape;

public class Rectangle extends Shape {
	private double high;
	private double wid;
	public Rectangle(){
		this.high = 0f;
		this.wid = 0f;
	}
	public Rectangle(double a,double b){
		if (a>=0 && b>=0) {
			this.high = a;
			this.wid = b;
		}else{
			System.out.println("宽高不应为负数，已置0.");
			this.high = 0f;
			this.wid = 0f;
		}
	}
	public void getPerimeter(){
		System.out.println("矩形周长："+(high + wid)*2);
	}
	public void getArea(){
		System.out.println("矩形周长："+high*wid);
	}
}
