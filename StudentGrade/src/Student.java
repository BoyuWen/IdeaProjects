public class Student{
		private String name;
		private int eng;
		private int math;
		private int pe;
		public Student(){
			this.name = "ÎŞÃûÊÏ";
			this.eng = 0;
			this.math = 0;
			this.pe = 0;
		}
		public Student(String name,int eng,int math,int pe){
			this.name = name;
			this.eng = eng;
			this.math = math;
			this.pe = pe;
		}
		public Grade grade(){
			float avg = (eng+math+pe)/3;
			if(avg>=90){
				return Grade.A;
			}else if(avg<90 && avg>=80){
				return Grade.B;
			}else if(avg<80 && avg>=60){
				return Grade.C;
			}else{
				return Grade.D;
			}
		}
}