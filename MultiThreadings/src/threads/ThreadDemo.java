package threads;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {

			System.out.println("Main Thread");
		
			ThreadDemo t1 = new ThreadDemo();
			
			t1.setPriority(NORM_PRIORITY); // 5
			t1.setName("Child");
			
			System.out.println(t1);
			
			System.out.println(t1.getId() +" "+t1.getState() );
			System.out.println(t1.getName());
			
			System.out.println(Thread.currentThread());
			
			t1.start();
		

	}
	
	@Override
	public void run() {
		
		System.out.println("current thread in run "+Thread.currentThread().getName());
		System.out.println("run() is executed by above thread");
		
		
	}
	
	

}
