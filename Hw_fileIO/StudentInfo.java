package IOsystem;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * 学生打印类
 * @author LeeMaster
 *
 */
public class StudentInfo {
	private static List<Student> infoContainer = new ArrayList<Student>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		infoContainer.add(new Student("20151111","张三","90","81","70"));
		infoContainer.add(new Student("20151112","李四","60","82","70"));
		infoContainer.add(new Student("20151113","王五","95","83","70"));
		infoContainer.add(new Student("20151114","孙六","70","86","70"));
		infoContainer.add(new Student("20151115","周七","88","60","70"));
		File record = new File("student.txt");
		if(!record.exists()){
			record.createNewFile();
		}
		FileWriter in = new FileWriter(record);
		for(Student s : infoContainer){
			in.write(s.getInfo()+'\n');
		}
		in.close();
		
		BufferedReader out = new BufferedReader(new InputStreamReader(new FileInputStream(record)));
		String tmp = null;
		while((tmp = out.readLine()) != null){
			System.out.println(tmp);
		}
		out.close();
	}

}


/**
 * Student
 * @author LeeMaster
 *
 */
class Student{
	private String name;
	private String id;
	private String math;
	private String english;
	private String PE;
	Student(String i,String n,String m,String p,String e){
		name = n;
		id = i;
		math = m;
		PE = p;
		english = e;
	}
	 public String getInfo(){
		 return id +"\t"+ name +"\t"+ math +"\t"+ english +"\t"+ PE;
	 }
	
}