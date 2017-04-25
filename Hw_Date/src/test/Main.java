package test;

import java.util.*;
import java.text.*;

public class Main {
	public static void main (String[] args){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd E");
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		System.out.println("当前日期为："+df.format(date));
		c.setTime(date);
		if(c.get(c.DAY_OF_WEEK) != Calendar.MONDAY){
			c.set(c.DAY_OF_WEEK,Calendar.MONDAY);
		}
		date = c.getTime();//Callendar类转Date类要用getTime()方法
		System.out.println("本周一的日期为："+df.format(date));//df.format()方法只能转化Date类
	}
}
