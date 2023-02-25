package lambdaexp;

public class DemoImp implements MyInterface {

	public static void main(String[] args) {

		MyInterface mi	= new DemoImp();
		int res =	mi.add(4, 5);
			
		System.out.println("Result: "+res);
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
