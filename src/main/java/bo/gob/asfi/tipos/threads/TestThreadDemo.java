package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class TestThreadDemo
{
	public static void run() {

		ThreadDemo T1 = new ThreadDemo( "Thread-1");
		T1.start();

		ThreadDemo T2 = new ThreadDemo( "Thread-2");
		T2.start();
	}
}
