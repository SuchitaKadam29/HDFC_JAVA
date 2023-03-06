package mementopattern;

public class Employee {

	
	private int eid;
	private  String ename;
	private String job;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
		
	}
	
	public EmployeeMemento createMemento() {
		
		EmployeeMemento  em = new EmployeeMemento(eid, ename, job);
		
		return em;
	}
	
	
	
	 public void restore(EmployeeMemento em){
		 
		 this.eid = em.getEid();
		 this.ename = em.getEname();
		 this.job = em.getJob();
		 
		 
	 }
	
	
	
	
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", job=" + job + "]";
	}
	
	
	
	
}
