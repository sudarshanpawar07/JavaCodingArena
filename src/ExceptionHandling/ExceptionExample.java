package ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		t1.start();
		t1.start();// IllegalThreadStateException Occurred

	}

}
