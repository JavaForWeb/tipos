package bo.gob.asfi.tipos.BankDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by fernando on 10/13/16.
 */
public class HeartBeatTask	extends TimerTask
{

	private int timerInterval;
	private int times = 0;

	public HeartBeatTask(int timeInterval){
		this.timerInterval=timeInterval;
	}

	public void run() {
		times ++;
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.printf( "%d %s\n", times, sdf.format(new Date()));
	}

}
