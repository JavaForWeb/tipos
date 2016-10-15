package bo.gob.asfi.tipos.threads;

import java.util.Random;

/**
 * Created by fernando on 10/15/16.
 */
public class RunnableDemo implements Runnable
{
	private Thread t;
	private String threadName;

	RunnableDemo( String name) {
		threadName = name;
		System.out.println("Creating " +  threadName );
	}

	public void run() {
		Random r = new Random();
		System.out.println("Running " +  threadName );
		try {
			for(int i = 10; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				if (r.nextBoolean()) {
					System.out.println( threadName + "* * dentro del random ");
					this.t.interrupt();

					System.out.println( threadName +"* * despues de interrupt ");

				}
				Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start () {
		System.out.println("Starting " +  threadName );
		//run();
		//*
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
		//*/
	}
}
