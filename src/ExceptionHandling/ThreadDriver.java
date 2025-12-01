package ExceptionHandling;

public class ThreadDriver {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread();
		System.out.println("Name : " + Thread.currentThread().getName());
		System.out.println("Priority : " + thread.getPriority());
		System.out.println("Nature (Daemon / Non-Daemon) : " + thread.isDaemon());
		System.out.println();
		
		MyThread t1 = new MyThread("RAMESH");
		t1.setDaemon(true);
		t1.run();
		Thread.sleep(1000);
		System.out.println("Main goes to dead State.");

	}

}
