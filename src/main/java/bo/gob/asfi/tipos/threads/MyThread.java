package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class MyThread implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: "+t.getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread ended: "+t.getName());

	}
}

