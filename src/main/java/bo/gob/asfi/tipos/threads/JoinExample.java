package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class JoinExample
{
	public static void run() {
		Thread th1 = new Thread(new MyThread(), "th1");
		Thread th2 = new Thread(new MyThread(), "th2");
		Thread th3 = new Thread(new MyThread(), "th3");

		// Start first thread immediately
		th1.start();

          /* Start second thread(th2) once first thread(th1)
           * is dead
           */
		try {
			th1.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		th2.start();

          /* Start third thread(th3) once second thread(th2)
           * is dead
           */
		try {
			th2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		th3.start();

		// Displaying a message once third thread is dead
		try {
			th3.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("All three threads have finished execution");
	}
}
