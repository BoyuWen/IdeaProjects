package dateclass;

import java.text.*;
import java.util.*;

public class Birthday {
	public static void main(String[] args) throws ParseException{
		Date date = new Date();
		System.out.println("��ǰʱ���ǣ�"+date.toLocaleString());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		long bir = df.parse("2017-05-20").getTime();
		long now = date.getTime();
		System.out.println("�������ջ��У�"+(bir-now)/(1000*60*60*24)+"��");
	}
}
