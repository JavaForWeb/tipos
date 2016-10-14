package bo.gob.asfi.tipos.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by fernando on 10/13/16.
 */
public class CopyFile
{
	public void run() throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("./src/main/java/META-INF/MANIFEST.MF");
			out = new FileOutputStream("output.txt");

			int c;
			int n = 0;
			while ((c = in.read()) != -1) {
				out.write(c);
				n++;
			}

			System.out.println( "copiados " + n + " bytes");
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
