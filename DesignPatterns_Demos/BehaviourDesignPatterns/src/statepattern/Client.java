package statepattern;

public class Client {
	
	

	public static void main(String[] args) {
		TVContext context = new TVContext();
		
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		State tvUpdateState = new TVUpdateState();
		
		context.setState(tvStartState);
		context.doAction();
		
		context.setState(tvUpdateState);
		context.doAction();
		
		context.setState(tvStopState);
		context.doAction();
		
		
		
		
		
		
	}
	

}
