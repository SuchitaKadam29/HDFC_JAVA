package observer;

public class SubjectImp implements Subject {

	@Override
	public int add() {

		System.out.println("add method is called");
		
		return 0;
	}

}
