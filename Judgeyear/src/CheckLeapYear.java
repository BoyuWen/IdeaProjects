import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args){
		System.out.println("������һ����ݣ�");
		Scanner sc = new Scanner(System.in);
		int yearlnPut = sc.nextInt();
		if(yearlnPut%400==0 || (yearlnPut%100!=0 && yearlnPut%4==0)){
			System.out.println(yearlnPut+"��������");
		}else{
			System.out.println(yearlnPut+"����ƽ��");
		}
	}
}
