package ExceptionHandling;

public class Task {
	public void printNumber(String threadName) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(threadName + " : " + i);
		}
	}

}
