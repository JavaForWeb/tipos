package bo.gob.asfi.tipos.BankDemo;

/**
 * Created by fernando on 10/14/16.
 */
public class ThrowDemo
{
	public static void main(String args[]){
		try{
			char array[] = {'a','b','g','j'};
	   /*I'm displaying the value which does not
	    * exist so this should throw an exception
	    */
			System.out.println(array[78]);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception!!");
		}
	}
}
