package bo.gob.asfi.tipos.collections;

import bo.gob.asfi.tipos.model.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by fernando on 10/12/16.
 */
public class Listas
{

	public void run()
	{
		System.out.println("Crear una lista");
/*
		dataType[] arrayRefVar = new dataType[arraySize];
		ejemplos:
		dataType[] arrayRefVar = new dataType[arraySize];

		dataType[] arrayRefVar = {value0, value1, ..., valuek};
*/

		Double[] doubleList = {10.0, 20.0, 30.0, 40.0, 50.0, 6.0, 70.0, 80.0, 100.0};

		Integer[] intList = {10, 20, 30, 40, 50, 60, 70, 80, 100};

		String[] stringList = {"a", "b", "c"};

		Usuario[] usuarioList = { new Usuario("juan"), new Usuario() };



		doubleList[0] = 11.0;
		doubleList[2] = 21.0;
		doubleList[4] = 31.0;
		//myList[10] = 31;

		//recorrer double
		System.out.println(doubleList);
		for( double num : doubleList) {

			System.out.println(num);

		}

		//recorrer int
		System.out.println(intList);
		for( int numInt : intList) {

			System.out.println(numInt);

		}

		//recorrer int
		System.out.println(stringList);
		for( String  s : stringList) {

			System.out.println(s);

		}

		//recorrer Usuario
		System.out.println(usuarioList);

		System.out.println("\nLista de Usuarios");
		for( Usuario usuario : usuarioList) {

			System.out.println(usuario.getName() + " " + usuario.getAddress() + " " + usuario.getBirthDate());

		}


		ArrayList<String> stringArrayList = new ArrayList<>();

		//stringArrayList.

		ArrayList<Usuario> usuarioArrayList = new ArrayList<>(4);


		Iterator<Usuario> iterator = usuarioArrayList.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			System.out.println(usuario.getName() + " " + usuario.getAddress() + " " + usuario.getBirthDate());
		}

		for (Iterator<Usuario> iterator2 = usuarioArrayList.iterator(); iterator2.hasNext();  ) {
			Usuario usuario = iterator.next();
			System.out.println(usuario.getName() + " " + usuario.getAddress() + " " + usuario.getBirthDate());
		}


		for( Usuario usuario : usuarioList) {
			System.out.println(usuario.getName() + " " + usuario.getAddress() + " " + usuario.getBirthDate());
		}

		usuarioArrayList.add( new Usuario("juan"));
		usuarioArrayList.add( new Usuario("jose"));
		usuarioArrayList.add( new Usuario("pedro"));


	}
}
