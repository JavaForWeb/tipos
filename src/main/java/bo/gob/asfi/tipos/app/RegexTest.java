package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.utils.Common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fernando on 10/10/16.
 */
public class RegexTest
{
	public void run(String args[])
	{
		Common.displayTitle("Expresiones Regulares");

		System.out.println("");

		// String to be scanned to find the pattern.
		String line = "El número de factura es 3938 con estado Pendiente de Pago";
		String pattern = "(.*)(\\d+)(.*)";
		//String pattern = "(.*)\\s(\\d+)(.*)";
		//String pattern = ".*\\s(\\d+).*";
		//String pattern = ".*\\s(\\d+).*estado\\s(.*)";

		// Crear un objeto Pattern
		Pattern r = Pattern.compile(pattern);

		// ahora crear un objeto matcher
		Matcher m = r.matcher(line);

		//si encontró alguna coincidencia...
		//if (m.matches()) {
		if (m.find()) {
			//mostrar todos los grupos
			for (int i = 0; i <= m.groupCount(); i++) {
				System.out.println("Found value (group " + i + "): " + m.group(i));
			}
		} else {
			System.out.println("NO MATCH");
		}

		/*
		System.out.println("\nseparar en palabras");
		String[] Res = line.split("[\\p{Punct}\\s]+");
		System.out.println("* " + Res.length + " palabras");
		for (String s:Res){
			System.out.println(s);
		}
		*/
	}

	public static void main(String[] args)
	{
		new RegexTest().run(args);
	}


}
