package bo.gob.asfi.tipos.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by fernando on 10/13/16.
 */
public class Mapas
{
	public void run()
	{
		System.out.println("Mapas - Votación de Colores");

		String[] colores = {
			"rojo", "verde", "amarillo", "rojo", "azul",
			"negro", "rosado", "verde", "azul", "celeste",
			"verde", "amarillo", "negro", "blanco", "celeste",
			"rojo", "azul", "blanco", "celeste", "naranja",
			"amarillo", "rosado", "negro","blanco",
			"naranja", "amarillo", "púrpura"
		};

		System.out.println("\nResultados usando HashMap");
		Map<String, Integer> mapa1 = new HashMap();

		for (String color: colores) {
			if (mapa1.containsKey(color)) {
				Integer contador = mapa1.get(color);
				mapa1.put(color,contador  + 1);
			} else {
				mapa1.put(color, 1);
			};
		}

		//mostrar resultados
		System.out.println("--> for( : ) ");
		for (String color: mapa1.keySet()) {
			System.out.printf("%-15s %3d\n", color, mapa1.get(color));
		}

		System.out.println("\n--> Iterator<Map.Entry<String, Integer>> ");
		Iterator<Map.Entry<String,Integer>>it = mapa1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Integer> e = it.next();

			System.out.printf ("%-15s %3d\n", e.getKey(), e.getValue());
		}

		System.out.println("\n--> Iterator<Map.Entry<String, Integer>> ");
		Iterator<String>it2 = mapa1.keySet().iterator();
		while (it2.hasNext()) {
			String color = it2.next();
			System.out.printf("%-15s %3d\n", color, mapa1.get(color));
		}

		System.out.println("\n\nResultados usando LinkedHashMap");
		Map<String, Integer> mapa2 = new LinkedHashMap();

		for (String color: colores) {
			if (mapa2.containsKey(color)) {
				Integer contador = mapa2.get(color);
				mapa2.put(color,contador  + 1);
			} else {
				mapa2.put(color, 1);
			};
		}

		//mostrar resultados
		System.out.println("--> for( : ) ");
		for (String color: mapa2.keySet()) {
			System.out.printf("%-15s %3d\n", color, mapa2.get(color));
		}


		System.out.println("\n\nResultados usando LinkedHashMap");
		Map<String, Integer> mapa3 = new TreeMap<>();

		for (String color: colores) {
			if (mapa3.containsKey(color)) {
				Integer contador = mapa3.get(color);
				mapa3.put(color,contador  + 1);
			} else {
				mapa3.put(color, 1);
			};
		}

		//mostrar resultados
		System.out.println("--> for( : ) ");
		for (String color: mapa3.keySet()) {
			System.out.printf("%-15s %3d\n", color, mapa3.get(color));
		}
		/*
*/
	}
}
