package test;

import java.util.*;
import java.text.*;

public class Main {
	public static void main (String[] args){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd E");
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		System.out.println("��ǰ����Ϊ��"+df.format(date));
		c.setTime(date);
		if(c.get(c.DAY_OF_WEEK) != Calendar.MONDAY){
			c.set(c.DAY_OF_WEEK,Calendar.MONDAY);
		}
		date = c.getTime();//Callendar��תDate��Ҫ��getTime()����
		System.out.println("����һ������Ϊ��"+df.format(date));//df.format()����ֻ��ת��Date��
	}
}
