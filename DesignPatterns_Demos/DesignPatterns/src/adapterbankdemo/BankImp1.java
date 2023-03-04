package adapterbankdemo;

/*
 * @author: Sahil
 * Date: 23-02-2023
 * Desc: Implementing IBank deposit() business service
 */


public  class BankImp1 extends Object implements IBank{
	
	public BankImp1() {
		
		super(); // Object();
		
	}
	

	

	@Override
	public void deposit() {


		System.out.println("Amount Deposited Successfully...");
		

	}




	@Override
	public void withdraw() {
		System.out.println("Amount Withdraw Successfully...");
		
	}
	
	
	
	
	

}
