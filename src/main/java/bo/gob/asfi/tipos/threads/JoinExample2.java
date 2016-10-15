package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class JoinExample2
{
	public static void run() {
		Thread th1 = new Thread(new MyThread(), "th1");
		Thread th2 = new Thread(new MyThread(), "th2");
		Thread th3 = new Thread(new MyThread(), "th3");

		th1.start();
		th2.start();
		th3.start();
	}
}
