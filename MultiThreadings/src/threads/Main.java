package threads;

public class Main {

	public static void main(String[] args) {

		
			//thread-1
		MyThread t1 = new MyThread();
		t1.setName("child-1");
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();

		
			//thread-2
		MyThread t2 = new MyThread();
		t2.setName("child-2");
		t2.start();

	
		
		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * System.out.println(Thread.currentThread().getName());
		 * 
		 * }
		 */

	}

}
