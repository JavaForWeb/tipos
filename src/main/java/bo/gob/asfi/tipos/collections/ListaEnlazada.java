package bo.gob.asfi.tipos.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by fernando on 10/12/16.
 */
 public class ListaEnlazada
{

	public void run()
	{
		System.out.println("Listas Enlazadas");
		LinkedList<String> linkedlist = new LinkedList<String>();

		/*add(String Element) es usado para añadir elementos a la lista enlazada*/
		//linkedlist.add("Chuquisaca");
		linkedlist.add("La Paz");
		linkedlist.add("Oruro");
		linkedlist.add("Potosi");
		linkedlist.add("Tarija");
		linkedlist.add("Cochabamba");
		linkedlist.add("Beni");
		linkedlist.add("Pando");
		linkedlist.add("Santa Cruz");

		System.out.println("\nContenido de la lista: ");
		System.out.println(linkedlist);
/*
    	// añadir First Element
		linkedlist.addFirst("Sucre");

		System.out.println("\nContenido de la lista: ");
		System.out.println(linkedlist);
/*
		// modificar primer elemento
		Object firstvar = linkedlist.get(0);
		System.out.println("Primer elemento: " +firstvar);
		linkedlist.set(0, "Chuquisaca");

		System.out.println("\nContenido de la lista: ");
		System.out.println(linkedlist);

/*
         // add temp last item
		linkedlist.addLast("Litoral");
		System.out.println("\nContenido de la lista: ");
		System.out.println(linkedlist);

		//quitar ultimo elemento
		linkedlist.removeLast();
		System.out.println("\nContenido de la lista: ");
		System.out.println(linkedlist);

/*
		System.out.println("\nUsando descending Iterator: ");
		Iterator<String> it = linkedlist.descendingIterator();
		while (it.hasNext()) {
			System.out.println (it.next());
		}

/*

		System.out.println("\nUsando list Iterator <---: ");
		ListIterator<String> it2 = linkedlist.listIterator(5);
		//while (it2.hasNext()) {
		while (it2.hasPrevious()) {
			//System.out.println (it2.next());
			System.out.println (it2.previous());
		}

/*
		System.out.println("\nUsando list Iterator -->: ");
		it2 = linkedlist.listIterator(5);
		while (it2.hasNext()) {
			System.out.println (it2.next());
		}
		 */

	}

}
