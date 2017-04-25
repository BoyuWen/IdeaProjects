package main;
import java.util.*;
import auto.*;

public class run {
	public static void main(String[] args) {
		Auto a = new Auto(3,"彩虹",2000f);
		Car c = new Car(4,"霓虹",2500f,false,false);
		competition(a,c,40);
	}
	//赛车方法
	public static void competition(Auto a,Car c,int time){
		Random random = new Random();
		float dis_a = a.journey(random.nextInt(10), 5f, time);
		float dis_c = c.journey(random.nextInt(10), 4f, time);
		if (dis_a > dis_c) {
			System.out.print("第一名：");
			a.print();
			System.out.print("第二名：");
			c.print();
		}else{
			System.out.print("第一名：");
			c.print();
			System.out.print("第二名：");
			a.print();
		}
	}
}


