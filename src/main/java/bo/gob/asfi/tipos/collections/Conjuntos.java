package bo.gob.asfi.tipos.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by fernando on 10/13/16.
 */
public class Conjuntos
{
	public void run()
	{
		System.out.println("Conjuntos - Votación de Colores");

		String[] colores = {
			"rojo", "verde", "amarillo", "rojo", "azul",
			"negro", "rosado", "verde", "azul", "celeste",
			"verde", "amarillo", "negro", "blanco", "celeste",
			"rojo", "azul", "blanco", "celeste", "naranja",
			"amarillo", "rosado", "negro","blanco",
			"naranja", "amarillo", "púrpura"
		};

		System.out.println("\nResultados usando HashSet");
		Set<String> noRepetidos = new HashSet();

		for (String color: colores) {
			noRepetidos.add(color);
		}

		//mostrar resultados
		for (String color: noRepetidos) {
			System.out.println("  " + color);
		}

		System.out.println("\nResultados usando LinkedHashSet");
		Set<String> conjuntos2 = new LinkedHashSet<>();

		for (String color: colores) {
			conjuntos2.add(color);
		}

		//mostrar resultados
		for (String color: conjuntos2) {
			System.out.println("  " + color);
		}

		System.out.println("\nResultados usando TreeSet");
		Set<String> conjuntos3 = new TreeSet<>();

		for (String color: colores) {
			conjuntos3.add(color);
		}

		//mostrar resultados
		for (String color: conjuntos3) {
			System.out.println("  " + color);
		}

	}
}
