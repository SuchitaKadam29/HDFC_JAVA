package school;

public class Student extends Object {
	
	private int studentId;
	private String studentName;
	private double fee;
	private String course;
	
	public Student() {
		
		super(); // Object();
	}
	
	
	public Student(int studentId, String studentName, double fee, String course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fee = fee;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", fee=" + fee + ", course="
				+ course + "]";
	}
	
	/*
	 * @Override public String toString() {
	 * 
	 * return "sid: "+this.studentId +"  sname: "+this.studentName;
	 * 
	 * }
	 */
	
	
	
	

}
