package mementopattern;

public final class EmployeeMemento {

	
	private final int eid;
	private final  String ename;
	private final String job;
	
	
	public EmployeeMemento(int eid, String ename, String job) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.job = job;
	}


	public int getEid() {
		return eid;
	}


	public String getEname() {
		return ename;
	}


	public String getJob() {
		return job;
	}
	
	
	
}
