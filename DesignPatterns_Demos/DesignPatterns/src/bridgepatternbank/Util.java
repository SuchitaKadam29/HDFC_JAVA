package bridgepatternbank;

public class Util {
	
	
	public static IBank getObject(){
		
		
		return new BankImp2();
		
	}

}
