package dateclass;

import java.text.*;
import java.util.*;

public class Birthday {
	public static void main(String[] args) throws ParseException{
		Date date = new Date();
		System.out.println("当前时间是："+date.toLocaleString());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		long bir = df.parse("2017-05-20").getTime();
		long now = date.getTime();
		System.out.println("距离生日还有："+(bir-now)/(1000*60*60*24)+"天");
	}
}
