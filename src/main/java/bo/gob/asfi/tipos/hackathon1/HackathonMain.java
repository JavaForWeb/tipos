package bo.gob.asfi.tipos.hackathon1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by fernando on 10/15/16.
 */
public class HackathonMain
{
	static Logger log = Logger.getLogger(HackathonMain.class.getName());

	private final Integer MAX_THREADS = 10;
	private final Integer MAX_ITERATIONS = 5;

	ArrayList<Thread> threads = new ArrayList<>();
	Random random = new Random();

	String generatePayload() {
		int nextInt = random.nextInt(130)+1;
		String out = "";
		for (int i=0; i<nextInt; i++ ) {
			int car =  random.nextInt(24)+96;
			out += Character.toString((char) car);
		}
		return out;
	}

	public void run() {

		System.out.println("multiples threads");
		log.info("starting hackathon 1 - multiples threads");

		//leer archivos


		for (int iterations = 0; iterations< MAX_ITERATIONS; iterations++) {
			log.debug("starting iteration " + iterations);
			//init n threads
			log.info("init " + MAX_THREADS + " threads");
			for(int i = 0; i < this.MAX_THREADS; i++) {
				MyTask thread = new MyTask();
				String threadName = "worker " + (i + 1);
				Integer threadPriority = random.nextInt(10) + 1;
				String payload = generatePayload();

				log.debug("set name to " + threadName);
				thread.setName(threadName);
				thread.setPayload(payload);

				log.debug("set priority of " + threadName + " to " + threadPriority);
				thread.setPriority(threadPriority);

				threads.add(thread);
			}

			for (Thread thread:  threads) {
				thread.run();
			}

		}

	}
}
