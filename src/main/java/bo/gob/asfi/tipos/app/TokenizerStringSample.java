package bo.gob.asfi.tipos.app;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by fernando on 10/14/16.
 */
public class TokenizerStringSample
{
	public void run()
	{
		String a = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo ";
		Stack stack = new Stack();

		//separar la cadena en palabras separadas por espacio
		StringTokenizer tempStringTokenizer = new StringTokenizer(a);

		// push all the words to the stack one by one
		while (tempStringTokenizer.hasMoreTokens()) {
			stack.push(tempStringTokenizer.nextElement());
		}

		System.out.println("\nOriginal: " + a);

		System.out.print("Reverse: ");

		// pop the words from the stack
		while(!stack.empty()) {
			System.out.print(stack.pop());
			System.out.print(" ");
		}

		System.out.println("\n");
	}
}
