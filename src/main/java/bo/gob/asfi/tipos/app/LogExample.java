package bo.gob.asfi.tipos.app;

import java.util.logging.Logger;


/**
 * Created by fernando on 10/15/16.
 */
public class LogExample
{
	static Logger log = Logger.getLogger(LogExample.class.getName());

	public static void run()
	{
		log.fine("Hello this is a fine message");
		//log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		System.out.println(log.getLevel());
	}

}
