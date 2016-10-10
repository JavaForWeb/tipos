package bo.gob.asfi.tipos.app;

import java.util.Scanner;

/**
 * Created by fernando on 10/10/16.
 */
public class InputFromKeyboard
{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println( "ingrese un texto y luego presione enter");
		//For string
		String text= scan.nextLine();

		System.out.println("input: " + text);

		//for int
		System.out.println( "ingrese un número entero y luego presione enter");
		int num= scan.nextInt();

		System.out.println("input: " + num);
	}
}
