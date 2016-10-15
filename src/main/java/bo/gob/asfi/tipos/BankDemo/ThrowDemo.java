package bo.gob.asfi.tipos.BankDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by fernando on 10/14/16.
 */
public class ThrowDemo
{
	public static void main(String args[]){

		try {
			int c = 14 / 0;
			File file = new File(".\\file.txt");
			FileReader fr = new FileReader(file);
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage() );
			System.out.println(e.getCause() );
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage() );
			System.out.println(e.getCause() );
		}

	/*
		char array[] = {'a', 'b', 'g', 'j'};

		int a, b, c;

		try {

			//double a, b, c;
			b = 0;
			a = 123;

			c = a / 0;

			System.out.println(array[78]);
		//} catch( ArrayIndexOutOfBoundsException exception ) {
		} catch(  ArrayIndexOutOfBoundsException exception ) {
			System.out.println(exception.getMessage() );
			System.out.println(exception.getCause() );
			exception.printStackTrace();

		} catch( ArithmeticException exception) {
			System.out.println(exception.getMessage() );
			System.out.println(exception.getCause() );
			exception.printStackTrace();
		} finally {
			System.out.println( "this code ");
			System.out.println( "will always executed!");
			System.out.println( "continue");
		}
*/

/*
		try{
			char array[] = {'a','b','g','j'};
			System.out.println( array[78] );

		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception!!");
		}
		*/
	}
}
