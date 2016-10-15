package bo.gob.asfi.tipos.hackathon1;

import org.apache.log4j.Logger;

/**
 * Created by fernando on 10/15/16.
 */
public class MyTask extends Thread
{
	static Logger log = Logger.getLogger(MyTask.class.getName());
	private String payload;

	public void setPayload(String payload)
	{
		this.payload = payload;
	}

	public void run() {
		log.info(this.getName() + " " + payload);

		for (int j = 0; j < 1000; j++) {
			for(int i = 0; i < payload.length(); i++) {
				String sub = payload.substring(0, i);
				int x = sub.hashCode();
			}
		}

		log.info(this.getName() + " completed");
	}

	/*
	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
	}
*/
}
