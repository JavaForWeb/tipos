package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.utils.Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by fernando on 10/10/16.
 */
public class DateTime
{
	public void run(String args[])
	{
		Common.displayTitle("Date and Time functions");

		System.out.println( "");
		System.out.println( "Obtener la fecha y hora actual");

		Date now = new Date();
		System.out.println( now);

		System.out.println( "");
		System.out.println( "en milisegundos desde January 1, 1970, 00:00:00 GMT");
		System.out.println( now.getTime());

		System.out.println( "");
		System.out.println( "convertir Date a String  con formato, usando SimpleDateFormat");
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/Y HH:mm:ss");
		String fechaFormato1 = sdf.format(now);
		System.out.println( fechaFormato1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMMM/YYYY H:m:s");
		String fechaFormato2 = sdf2.format(now);
		System.out.println( fechaFormato2);

		System.out.println( "");
		System.out.println( "convertir String a Date, usando SimpleDateFormat");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "25-12-2015 10:20:56";
		try {
			Date date = sdf3.parse(dateInString);
			System.out.println(date);
		} catch(ParseException e) {

		}


		System.out.println( "");
		System.out.println( "convertir Calendar a Date");

		Calendar calendar = Calendar.getInstance();
		Date date =  calendar.getTime();
		System.out.println( date);

		System.out.println("");
		System.out.println("add one month");
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf2.format(calendar.getTime()));

		System.out.println("");
		System.out.println("subtract 10 days");
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Date : " + sdf2.format(calendar.getTime()));


		System.out.println("");
		System.out.println( "Calendar");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendarGreg = new GregorianCalendar(2016,0,31);
		System.out.println(sdf4.format(calendarGreg.getTime()));

		int year       = calendarGreg.get(Calendar.YEAR);
		int month      = calendarGreg.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendarGreg.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek  = calendarGreg.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendarGreg.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendarGreg.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendarGreg.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendarGreg.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendarGreg.get(Calendar.MINUTE);
		int second     = calendarGreg.get(Calendar.SECOND);
		int millisecond= calendarGreg.get(Calendar.MILLISECOND);


		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);

	}

	public static void main(String[] args)
	{
		new DateTime().run(args);
	}
}
