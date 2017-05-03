package IOsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File origin = new File("student.txt");
		File target = new File("Text/studentCopy.txt"); 
		Copy(origin, target);
	}

	public static void Copy(File origin,File target) throws IOException{
		if(!target.exists()){
			target.createNewFile();
		}
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
		int status;
		while((status = in.read()) != -1){
			out.write(status);
		}
			
	}
}
