package test;
import java.util.*;

public class CalendarDemo {
	public static void main(String[] args){
		//创建Calender对象
		Calendar c = Calendar.getInstance();
		System.out.println("年："+c.get(Calendar.YEAR));
		System.out.println("月："+(c.get(Calendar.MONTH)+1));
		System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("时："+c.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+c.get(Calendar.MINUTE));
		System.out.println("秒："+c.get(Calendar.SECOND));
		//转为Date类
		Date d = c.getTime();
		//日期偏移
		c.add(c.YEAR,100);
		System.out.println(c.getTime());
		//起止时间
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
