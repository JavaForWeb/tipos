package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class TestRunnableDemo
{
	public static void run() {

		RunnableDemo R1 = new RunnableDemo( "Thread-AAAA");
		R1.start();

		RunnableDemo R2 = new RunnableDemo( "Thread-BBBB");
		R2.start();
	}
}
