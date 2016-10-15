package bo.gob.asfi.tipos.threads;

/**
 * Created by fernando on 10/15/16.
 */
public class DisplayMessage implements Runnable
{
	private String message;

	public DisplayMessage(String message) {
		this.message = message;
	}

	public void run() {
		while(true) {
			System.out.println(message);

			try
			{
				Thread.sleep( 100 );
			}
			catch( InterruptedException e )
			{

			}
		}
	}
}
