package runnable;

public class MyThread  implements Runnable {

	public static void main(String[] args) {

		Runnable r = new MyThread();
		Thread td1 = new Thread(r);

		td1.start();

		Thread td2 = new Thread(r);

		td2.start();

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName());

		}

	}

}
