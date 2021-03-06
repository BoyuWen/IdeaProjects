package main;
import shot.*;
public class Main {
	public static void main(String[] args){
		Gun gun = new Gun();
		for(int i=1;i<=gun.getCount();i++) {
			Bullet a = new Bullet(i,"M54");
			try{
				gun.load(a);
			}catch(FullException e){
				e.printStackTrace();
			}
		}
		System.out.println(gun.getAmount());
		gun.show();
		int num = gun.getAmount();
		for(int i=1;i<=num;i++) {
			try{
				gun.shot();
			}catch(EmptyException e){
				e.printStackTrace();
			}
		}
		System.out.println(gun.getAmount());
		gun.show();
	}
}
