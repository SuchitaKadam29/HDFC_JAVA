package adapterbankdemo;

public class AdapterTest {

	public static void main(String[] args) {

			BankImp2 bankUser = new BankImp2();
		
			// user-1
			
				bankUser.deposit();
				bankUser.withdraw();
				bankUser.changePin();
				
		// bank-employee
				
				BankImp1  bankEmp = (BankImp1) bankUser;
				
					bankEmp.deposit();
					bankEmp.withdraw();
					
				

	}

}
