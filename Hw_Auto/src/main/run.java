package main;
import java.util.*;
import auto.*;

public class run {
	public static void main(String[] args) {
		Auto a = new Auto(3,"�ʺ�",2000f);
		Car c = new Car(4,"�޺�",2500f,false,false);
		competition(a,c,40);
	}
	//��������
	public static void competition(Auto a,Car c,int time){
		Random random = new Random();
		float dis_a = a.journey(random.nextInt(10), 5f, time);
		float dis_c = c.journey(random.nextInt(10), 4f, time);
		if (dis_a > dis_c) {
			System.out.print("��һ����");
			a.print();
			System.out.print("�ڶ�����");
			c.print();
		}else{
			System.out.print("��һ����");
			c.print();
			System.out.print("�ڶ�����");
			a.print();
		}
	}
}


