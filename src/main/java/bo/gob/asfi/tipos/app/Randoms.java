package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.utils.Common;

import java.util.Random;

/**
 * Created by fernando on 10/10/16.
 */
public class Randoms
{
	public void run(String args[])
	{
		Common.displayTitle("class Random");
		System.out.println("usar la clase Random (JSE7+)\n");

		Random rand = new Random();

		//rand.setSeed( 1234 );

		int  n = rand.nextInt(50) + 1;
		System.out.println("número aleatorio entre 1 y 50 (entero): " + n);

		long  l = rand.nextLong();
		System.out.println("número aleatorio (long): " + l);

		double d = rand.nextDouble();
		System.out.println("número aleatorio (double): " + d);

		boolean b = rand.nextBoolean();
		System.out.println("variable aleatoria (boolean): " + b);

		//el mismo objeto Random es reusado aqui
		System.out.println("100 números aleatorios: ");
		for (int idx = 1; idx <= 5; ++idx){
			for (int jdx = 1; jdx <= 20; ++jdx) {
				System.out.printf("%3d", rand.nextInt(100));
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{

		new Randoms().run(args);
	}
}
