package student;

public class Student {
	//����
	private long snum;
	private String sname;
	private float engscr;
	private float mathscr;
	private float pescr;
	//����
	public Student(){}
	public Student(long num,String name,float eng,float math,float pe){
		this.snum = num;
		this.sname = name;
		this.engscr = eng;
		this.mathscr = math;
		this.pescr = pe;
	}
	//����
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
		System.out.println("\tѧ�ţ�"+snum);
		System.out.println("\t������"+sname);
		System.out.println("\tӢ��ɼ���"+engscr);
		System.out.println("\t��ѧ�ɼ���"+mathscr);
		System.out.println("\t�����ɼ���"+pescr);
	}
	public void printScore(){
		System.out.println("\tӢ��ɼ���"+engscr);
		System.out.println("\t��ѧ�ɼ���"+mathscr);
		System.out.println("\t�����ɼ���"+pescr);
	}
}













