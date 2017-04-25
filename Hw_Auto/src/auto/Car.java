package auto;

public class Car extends Auto{
	protected boolean air_con;
	protected boolean cd;
	public Car(){
		super();
		this.air_con = false;
		this.cd = false;
	}
	public Car(int a,String b,float c,boolean e,boolean f){
		super(a,b,c);
		this.air_con = e;
		this.cd = f;
	}
	//加速
	public void speedUp(int minutes,float a){
		this.speed += a*minutes;
		this.air_con = true;
		this.cd = true;
	}
	//输出信息
	public void print(){
		String x;
		String y;
		if(this.air_con) x = "开"; else x = "关";
		if(this.cd) y = "开"; else y = "关";
		System.out.println("{轮胎数:"+tyre_num+"个  颜色:"+color+"  重量:"+weight+"kg  车速:"+speed+"m/min  空调:"+x+"  CD:"+y+"}");
	}
}
