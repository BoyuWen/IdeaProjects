package shape;

public class Circle extends Shape {
	private double radius;
	public Circle(){
		this.radius = 0f;
	}
	public Circle(double r){
		if (r >= 0) {
			this.radius = r;
		}else{
			System.out.println("半径不应为负数，已置0.");
			this.radius = 0f;
		}
	}
	public void getPerimeter(){
		System.out.println("圆形周长："+radius*2*Math.PI);
	}
	public void getArea(){
		System.out.println("圆形面积："+radius*radius*Math.PI);
	}
}
