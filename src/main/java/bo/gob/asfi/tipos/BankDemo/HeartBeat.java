package bo.gob.asfi.tipos.BankDemo;

import java.util.TimerTask;

/**
 * Created by fernando on 10/13/16.
 */
public class HeartBeat extends TimerTask
{

	public void run() {
		java.util.Timer t1 = new java.util.Timer();

		int timeInterval = 1*1000;
		HeartBeatTask timerTask = new HeartBeatTask(timeInterval);
		t1.schedule(timerTask, 5, timeInterval);

	}
}
