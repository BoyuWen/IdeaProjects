package shape;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;
	public Triangle(){
		this.a = 0f;
		this.b = 0f;
		this.c = 0f;
	}
	public Triangle(double x,double y,double z){
		if (x>=0 && y>=0 && z>=0 && (x+y)>z && (y+z)>x && (x+z)>y) {
			this.a = x;
			this.b = y;
			this.c = z;	
		}else{
			if (x>=0 && y>=0 && z>=0 && ((a+b)<=c || (b+c)<=a || (a+c)<=b)) {
				System.out.println("边长不符合构成三角形条件，已置0.");
			}else{
				System.out.println("边长不应为负数，已置0.");
			}
			this.a = 0f;
			this.b = 0f;
			this.c = 0f;
		}
	}
	public void getPerimeter(){
		System.out.println("三角形周长："+(a+b+c));
	}
	public void getArea(){
		double s1=(a+b+c)/2;
		double s2 = s1*(s1-a)*(s1-b)*(s1-c); 
		double area= Math.sqrt(s2);
		System.out.println("三角形面积："+area);
	}
}
