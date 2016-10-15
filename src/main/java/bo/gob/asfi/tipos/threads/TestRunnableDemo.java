package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class TestRunnableDemo
{
	public static void run() {

		RunnableDemo R1 = new RunnableDemo( "Thread-1");
		R1.start();

		RunnableDemo R2 = new RunnableDemo( "Thread-2");
		R2.start();
	}
}
