package shape;

public class Point3 implements Distance{
	private int x;
	private int y;
	private int z;
	public Point3(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	public Point3(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
	int getX(){
		return this.x;
	}
	int getY(){
		return this.y;
	}
	int getZ(){
		return this.z;
	}
	public void getDistance(Object obj){
		Point3 s = (Point3)obj;
		int q = this.x - s.getX();
		int p = this.y - s.getY();
		int o = this.z - s.getZ();
		System.out.println("两三维点间的距离为:"+Math.sqrt(q*q+p*p+o*o));
	}
}
