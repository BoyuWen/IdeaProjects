package test;

public class Main {
	public static void main (String[] args){
		Calculate a = new Calculate();
		try{
			a.div(1, 0);
		}catch(NegativeNumberException e){
			e.printStackTrace();
			System.out.println("����ԭ��:"+e);
		}
	}
}

class Calculate{
	public int div(int i,int j) throws NegativeNumberException{
		if(j == 0){
			NegativeNumberException e = new NegativeNumberException("�������");
			NumberCalculateException e1 = new NumberCalculateException("��������Ϊ0");
			e.initCause(e1);
			throw e;
		}
		return i/j;
	}
}

class NegativeNumberException extends Exception{
	public NegativeNumberException(String msg){
		super(msg);
	}
}

class NumberCalculateException extends Exception{
	public NumberCalculateException(String msg){
		super(msg);
	}
}