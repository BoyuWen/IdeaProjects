import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args){
		System.out.println("请输入一个年份：");
		Scanner sc = new Scanner(System.in);
		int yearlnPut = sc.nextInt();
		if(yearlnPut%400==0 || (yearlnPut%100!=0 && yearlnPut%4==0)){
			System.out.println(yearlnPut+"年是闰年");
		}else{
			System.out.println(yearlnPut+"年是平年");
		}
	}
}
