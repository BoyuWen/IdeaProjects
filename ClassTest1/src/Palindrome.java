import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String c = "";
		int b = a;
		int d = 0;
		while (b != 0) {
			c += b % 10;
			b /= 10;
		}
		d = Integer.parseInt(c);
		if (d == a) {
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
	}
}
