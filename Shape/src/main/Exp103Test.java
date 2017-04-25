package main;
import shape.*;

public class Exp103Test {
	public static void main(String[] args){
		//圆
		Circle circle = new Circle(3f);
		circle.getPerimeter();
		circle.getArea();
		//矩形
		Rectangle rectangle = new Rectangle(3f,4f);
		rectangle.getPerimeter();
		rectangle.getArea();
		//三角形
		Triangle triangle = new Triangle(3f,4f,5f);
		triangle.getPerimeter();
		triangle.getArea();
		//二维点距离
		Point2 a = new Point2(2,3);
		Point2 b = new Point2(8,9);
		a.getDistance(b);
		//三维点距离
		Point3 x = new Point3(2,1,3);
		Point3 y = new Point3(1,8,9);
		x.getDistance(y);
	}
}
