package test;
import java.util.*;

public class CalendarDemo {
	public static void main(String[] args){
		//����Calender����
		Calendar c = Calendar.getInstance();
		System.out.println("�꣺"+c.get(Calendar.YEAR));
		System.out.println("�£�"+(c.get(Calendar.MONTH)+1));
		System.out.println("�գ�"+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ��"+c.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+c.get(Calendar.MINUTE));
		System.out.println("�룺"+c.get(Calendar.SECOND));
		//תΪDate��
		Date d = c.getTime();
		//����ƫ��
		c.add(c.YEAR,100);
		System.out.println(c.getTime());
		//��ֹʱ��
		c.setTime(new Date());
		c.add(c.DAY_OF_MONTH, 1);
		c.set(c.HOUR_OF_DAY,0);
		c.set(c.MINUTE, 0);
		c.set(c.SECOND,0);
		System.out.println(c.getTime().toLocaleString());
		c.add(c.DAY_OF_MONTH,-7);
		System.out.println(c.getTime().toLocaleString());
	}
}
