
public class Test {
	public static void main(String[] args){
		Student[] array = {
							new Student("student_1",94,95,96),//95
							new Student("student_2",89,90,91),//90
							new Student("student_3",85,86,87),//86
							new Student("student_4",81,82,83),//82
							new Student("student_5",77,78,79),//78
							new Student("student_6",73,74,75),//74
							new Student("student_7",68,69,70),//69
							new Student("student_8",64,65,66),//65
							new Student("student_9",59,60,61),//60
							new Student("student_10",53,54,55),//54
		};
		int a = 0,b = 0,c = 0,d = 0;
		for(Student i:array){
			switch (i.grade()){
			case A:
				a++;
				break;
			case B:
				b++;
				break;
			case C:
				c++;
				break;
			case D:
				d++;
				break;
			default:
			}
		}
		float sum = a+b+c+d;
		System.out.println("A级学生百分比为："+(a/sum)*100+"%.");
		System.out.println("B级学生百分比为："+(b/sum)*100+"%.");
		System.out.println("C级学生百分比为："+(c/sum)*100+"%.");
		System.out.println("D级学生百分比为："+(d/sum)*100+"%.");
	}
}


