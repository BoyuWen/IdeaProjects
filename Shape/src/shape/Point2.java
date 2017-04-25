package shape;

public class Point2 implements Distance{
	private int x;
	private int y;
	public Point2(){
		this.x = 0;
		this.y = 0;
	}
	public Point2(int a,int b){
		this.x = a;
		this.y = b;
	}
	int getX(){
		return this.x;
	}
	int getY(){
		return this.y;
	}
	public void getDistance(Object obj){
		Point2 s = (Point2)obj;
		int q = this.x - s.getX();
		int p = this.y - s.getY();
		System.out.println("����ά���ľ���Ϊ:"+Math.sqrt(q*q+p*p));
	}
}
