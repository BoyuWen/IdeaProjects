package auto;

public class Auto {
	protected int tyre_num;
	protected String color;
	protected float weight;
	protected float speed;
	public Auto(){
		this.tyre_num = 4;
		this.color = "��ɫ";
		this.weight = 2f;
		this.speed = 0f;
	}
	public Auto(int a,String b,float c){
		this.tyre_num = a;
		this.color = b;
		this.weight = c;
		this.speed = 0f;
	}
	//����
	public void speedUp(int minutes,float a){
		this.speed += a*minutes;
	}
	//ͣ��
	public void stop(){
		this.speed = 0;   //�����м��ٶ�,�����û��ͣ�����̼���,��ֱ����0��
	}
	//·��
	public float journey(int minutes,float a,int time){
		float startspeed = this.speed;
		speedUp(minutes,a);
		return (startspeed*minutes + 0.5f*this.speed*minutes) + (time-minutes)*this.speed;
	}
	//�����Ϣ
	public void print(){
		System.out.println("{��̥��:"+tyre_num+"��  ��ɫ:"+color+"  ����:"+weight+"kg  ����:"+speed+"m/min}");
	}
}
