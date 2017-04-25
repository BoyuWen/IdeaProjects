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
			System.out.println("�뾶��ӦΪ����������0.");
			this.radius = 0f;
		}
	}
	public void getPerimeter(){
		System.out.println("Բ���ܳ���"+radius*2*Math.PI);
	}
	public void getArea(){
		System.out.println("Բ�������"+radius*radius*Math.PI);
	}
}
