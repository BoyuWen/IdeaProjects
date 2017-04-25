package main;

import stuff.*;

public class Main {
	public static void main(String[] args){
		try {
			Stuff a = new Stuff(500,"2015");
		} catch (LowSalaryException e) {
			e.printStackTrace();
		}
	}
}
