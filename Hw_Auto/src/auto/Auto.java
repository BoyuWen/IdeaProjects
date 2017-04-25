package auto;

public class Auto {
	protected int tyre_num;
	protected String color;
	protected float weight;
	protected float speed;
	public Auto(){
		this.tyre_num = 4;
		this.color = "黑色";
		this.weight = 2f;
		this.speed = 0f;
	}
	public Auto(int a,String b,float c){
		this.tyre_num = a;
		this.color = b;
		this.weight = c;
		this.speed = 0f;
	}
	//加速
	public void speedUp(int minutes,float a){
		this.speed += a*minutes;
	}
	//停车
	public void stop(){
		this.speed = 0;   //减速有加速度,但结果没对停车过程计算,就直接置0了
	}
	//路程
	public float journey(int minutes,float a,int time){
		float startspeed = this.speed;
		speedUp(minutes,a);
		return (startspeed*minutes + 0.5f*this.speed*minutes) + (time-minutes)*this.speed;
	}
	//输出信息
	public void print(){
		System.out.println("{轮胎数:"+tyre_num+"个  颜色:"+color+"  重量:"+weight+"kg  车速:"+speed+"m/min}");
	}
}
