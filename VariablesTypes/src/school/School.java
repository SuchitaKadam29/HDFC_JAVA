package school;

public class School {

	public static void main(String[] args) {


		Student   student1 = new Student(111, "smith", 6000, "java");
		
		
		System.out.println(student1.getStudentId() +" "+ student1.getStudentName()+" "+student1.getCourse()+"  "+student1.getFee());
		
			System.out.println(student1);
		
		Student student2 = new Student();
		
		student2.setStudentId(121);
		student2.setStudentName("ford");
		
		
	}

}
