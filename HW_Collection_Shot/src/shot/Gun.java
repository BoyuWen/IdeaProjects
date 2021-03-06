package shot;
import java.util.*;

public class Gun {
	private int num;
	private String model;
	private List<Bullet> clip;
	private int count;
	
	public Gun(){
		num = 1;
		model = "M54";
		count = 6;
		clip = new ArrayList<Bullet>(count);
	}
	public Gun(int a,String b,int c){
		num = a;
		model = b;
		count = c;
		clip = new ArrayList<Bullet>(count);
	}
	public int getCount(){
		return count;
	}
	public void load(Bullet a) throws FullException{
		if(clip.size() >= count){
			throw new FullException();
		}
		clip.add(a);
	}
	public Bullet shot() throws EmptyException{
		if(clip.size() <= 0){
			throw new EmptyException();
		}
		return clip.remove(0);
	}
	public void show(){
		for(Bullet i:clip){
			i.show();
		}
	}
	public int getAmount(){
		return clip.size();
	}
}