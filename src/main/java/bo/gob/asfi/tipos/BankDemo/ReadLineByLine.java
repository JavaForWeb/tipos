package bo.gob.asfi.tipos.BankDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by fernando on 10/14/16.
 */
public class ReadLineByLine
{
	public void run()
	{
		String str;

		BufferedReader reader = new BufferedReader(
			new StringReader(contentTextArea.getText()));

		try {
			while ((str = reader.readLine()) != null) {

				if (str.length() > 0) System.out.println(str.charAt(0));

			}

		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
