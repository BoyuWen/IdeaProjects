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
	//����
	public void speedUp(int minutes,float a){
		this.speed += a*minutes;
		this.air_con = true;
		this.cd = true;
	}
	//�����Ϣ
	public void print(){
		String x;
		String y;
		if(this.air_con) x = "��"; else x = "��";
		if(this.cd) y = "��"; else y = "��";
		System.out.println("{��̥��:"+tyre_num+"��  ��ɫ:"+color+"  ����:"+weight+"kg  ����:"+speed+"m/min  �յ�:"+x+"  CD:"+y+"}");
	}
}
