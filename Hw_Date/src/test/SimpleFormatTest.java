package test;

import java.text.*;
import java.util.*;

public class SimpleFormatTest {
	public static void main(String[] args) throws ParseException{
		String pattern1 = "yyyyÄêMMÔÂddÈÕ E H:m:s";
		String pattern2 = "yyyy-MM-dd E H:m:s";
		String pattern3 = "yyyy/MM/dd H:m:s E";
		SimpleDateFormat d = new SimpleDateFormat();
		Date date = new Date();
		d.applyPattern(pattern1);
		System.out.println(d.format(date));
		d.applyPattern(pattern2);
		System.out.println(d.format(date));
		d.applyPattern(pattern3);
		System.out.println(d.format(date));
	}
}
