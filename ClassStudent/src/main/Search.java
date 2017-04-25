package main;
import student.*;
public class Search {
	public void findName(Student[] a,String b){
		for(Student i:a){
			String x = i.getSname();
			if(x.contains(b)){
				System.out.println(i.getSname()+":");
				i.printScore();
			}
		}
	}
	public int searchUnpass(Student[] a){
		int sum = 0;
		System.out.println("不及格名单：");
		for(Student i:a){
			if(i.getEngscr()<60 || i.getMathscr()<60 || i.getPescr()<60){
				System.out.print(i.getSname()+"  ");
				sum++;
			}
		}
		System.out.println("\n不及格人数共有"+sum+"人。");
		return sum;
	}
	public static void main(String[] args){
		
	}
}
