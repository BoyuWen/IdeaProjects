package test;

public class StuffElephant {
	public static void main(String[] args){
		Elephant a = new Elephant(3,3,3);
		Fridge b = new Fridge(5,2,5);
		try{
			b.loading(a);
		}catch(OutOfVolumeException e){
			System.out.println(e);
		}finally{
			System.out.println("��ձ���");
		}
	}
}
