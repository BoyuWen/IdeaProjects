package student;

public class Student {
	//属性
	private long snum;
	private String sname;
	private float engscr;
	private float mathscr;
	private float pescr;
	//构造
	public Student(){}
	public Student(long num,String name,float eng,float math,float pe){
		this.snum = num;
		this.sname = name;
		this.engscr = eng;
		this.mathscr = math;
		this.pescr = pe;
	}
	//方法
	public void setSnum(long x){
		this.snum = x;
	}
	public void setSname(String x){
		this.sname = x;
	}
	public void setMathscr(float x){
		this.mathscr = x;
	}
	public void setEngscr(float x){
		this.engscr = x;
	}
	public void setPescr(float x){
		this.pescr = x;
	}
	//
	public long getSnum(){
		return snum;
	}
	public String getSname(){
		return sname;
	}
	public float getEngscr(){
		return engscr;
	}
	public float getMathscr(){
		return mathscr;
	}
	public float getPescr(){
		return pescr;
	}
	//
	public void printStudent(){
		System.out.println("\t学号："+snum);
		System.out.println("\t姓名："+sname);
		System.out.println("\t英语成绩："+engscr);
		System.out.println("\t数学成绩："+mathscr);
		System.out.println("\t体育成绩："+pescr);
	}
	public void printScore(){
		System.out.println("\t英语成绩："+engscr);
		System.out.println("\t数学成绩："+mathscr);
		System.out.println("\t体育成绩："+pescr);
	}
}













