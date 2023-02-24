package synchronization;

public class Admission  implements Runnable {

	
	static int seats = 1;
	
	public static void main(String[] args) {


			Admission  obj = new Admission();
			
			Thread thread1 = new Thread(obj,"Raju");
			
			Thread thread2 = new Thread(obj);
					thread2.setName("Satish");
					
				System.out.println("*** welcome ***");
				
				System.out.println("No. of Seats : "+seats);
		
					thread1.start();
					thread2.start();

	}

	@Override
	public synchronized void run() {
		
		
		if(seats > 0)
		{
			
			try {
				Thread.sleep(1000);
				
				System.out.println("Seat Allocated to : "+Thread.currentThread().getName());
				
				seats = seats-1;
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		else {
			
			System.err.println("Sorry Try Next Year!");
			
		}
	
			
				
			
		
			System.out.println("Seats Left: "+seats);
			
			
		
	}
	
	
	

}
