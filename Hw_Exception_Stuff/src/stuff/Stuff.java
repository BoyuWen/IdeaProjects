package stuff;

public class Stuff {
	//属性
	private String number;
	private String name;
	private int age;
	private double salary;
	private String ID;
	private int stutotal = 10;
	private double totalsalary = 10000;
	//构造器
	public Stuff(String a,String b,int c) throws LowAgeException,HighAgeException,BlankException{
		number = a;
		if(c>=18 && c<=60){
			age = c;
		}else if(c<18){
			throw new LowAgeException();
		}else{
			throw new HighAgeException();
		}
		if(b=="" || b==null){
			throw new BlankException();
		}else{
			name = b;
		}	
	}
	public Stuff(double d,String e) throws LowSalaryException{
		if(d < 600){
			throw new LowSalaryException();
		}else{
			salary = d;
		}
		ID = e;
	}
	//方法
	public void addSalary(double addSalary) throws HighSalaryException{
		if((salary+addSalary)*stutotal > totalsalary){
			throw new HighSalaryException();
		}else{
			salary += addSalary;
		}
	}
	public void minusSalary(double minusSalary) throws LowSalaryException{
		if(salary-minusSalary < 600){
			throw new LowSalaryException();
		}else{
			salary -= minusSalary;
		}
	}
	public void showTotalSalary() throws BlankException{
		if(totalsalary == 0){
			throw new BlankException();
		}else{
			System.out.println("总工资："+totalsalary);
		}
	}
	public void showTotalStuff() throws BlankException{
		if(stutotal == 0){
			throw new BlankException();
		}else{
			System.out.println("总员工："+stutotal);
		}
	}
}
