package ExceptionHandling;

public class MyThread extends Thread {
	MyThread(String threadName) {
		super(threadName);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				System.out.println("try");
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println("Catch");
			} finally {
				System.out.println("Finally");
			}
		}
	}

}
