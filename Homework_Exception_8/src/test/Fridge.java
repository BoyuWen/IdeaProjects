package test;

public class Fridge{
	private int length;
	private int wide;
	private int high;
	public Fridge(){
		length = 0;
		wide = 0;
		high = 0;
	}
	public Fridge(int a,int b,int c){
		length = a;
		wide = b;
		high = c;
	}
	public int valume(int a,int b,int c){
		return a*b*c;
	}
	public void loading(Elephant a) throws OutOfVolumeException{
		if(a.getLength()<=length && a.getWide()<=wide && a.getHigh()<=high)
			System.out.println("已将大象装入冰箱");
		else
			throw new OutOfVolumeException("冰箱装不下大象");
	}
}
