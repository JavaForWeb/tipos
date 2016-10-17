package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.model.Adrian.City;
import bo.gob.asfi.tipos.model.Adrian.Countries;
import bo.gob.asfi.tipos.model.Adrian.Regions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lumartinez on 15/10/2016.
 */
public class LecturaAdrian {

    static List<City> listaCiudades = new ArrayList<City>();
    static List<Countries> listaPaises = new ArrayList<Countries>();
    static List<Regions> listaRegiones = new ArrayList<Regions>();

    public void run() {


        System.out.println("Empezamos el programa");

        //Ciudades
        List<String> lec = leer("D:\\fixtures\\cities.txt");
        Integer contador = 0;
        String[] d;
        for (String fila : lec) {
            if (contador > 0) {
                d = fila.split(",");
                listaCiudades.add(new City(d[0], d[1], d[2], d[3], d[4], d[5], d[6], d[7], d[8]));
            }

            contador = contador + 1;
        }

        //Paises
        contador = contador = 0;
        List<String> paises = leer("D:\\fixtures\\Countries.txt");
        for (String fila : paises) {
            if (contador > 0) {
                d = fila.split(",");
                listaPaises.add(new Countries(d[0], d[1], d[2], d[3], d[4], d[5], d[6], d[7], d[8], d[9], d[10], d[11], d[12], d[13], d[14], d[15]));
            }

            contador = contador + 1;
        }

        //Regiones
        contador = contador = 0;
        List<String> regiones = leer("D:\\fixtures\\Regions.txt");
        for (String fila : regiones) {
            if (contador > 0) {
                d = fila.split(",");
                listaRegiones.add(new Regions(d[0], d[1], d[2], d[3], d[4]));
            }

            contador = contador + 1;
        }


        System.out.println("Por favor introduzca una cadena por teclado:");

        Scanner teclado = new Scanner(System.in);

        String ciudadBusqueda;

        ciudadBusqueda = teclado.nextLine();

        Integer contadoR = 0;



        for (City obj : listaCiudades) {
            if (obj.getCityName().contains(ciudadBusqueda)) {


                 System.out.print(obj.getCityName().toString() + " " + obj.getRegionID().toString() + " " + obj.getLatitude().toString() +  "\n");
                                contadoR = contadoR + 1;

            }

        }

        System.out.print("Número de resultado obtenidos: " + contadoR.toString() + "\n");

        System.out.print("\n");
        System.out.print("\n");

        contadoR = 0;

        for (City obj : listaCiudades) {
            if (obj.getCityName().contains(ciudadBusqueda)) {


                for (Countries obj2 : listaPaises) {
                    if (obj.getCountryID().equals(obj2.getCountryId())) {
                        for (Regions obj3 : listaRegiones) {
                            if (obj.getRegionID().equals(obj3.getRegionId())) {
                                System.out.print(obj.getCityName().toString() + " " + obj2.getCountry().toString() + " " + obj3.getRegion().toString() +  " " +  obj.getLatitude().toString() + " " + obj.getLongitude().toString() + "\n");
                                contadoR = contadoR + 1;
                            }
                        }

                       // System.out.print(obj.getCityId().toString() + " " + obj2.getCountry().toString() + " " + obj.getCode().toString() + "\n");

                    }
                }
            }

        }



        System.out.print("Número de resultado obtenidos: " + contadoR.toString() + "\n");





    }


    public List<String> leer(String nombre)

    {

        List<String> resultado = new ArrayList<String>();
        File f;
        FileReader lectorArchivo;
        try {
            f = new File(nombre);
            lectorArchivo = new FileReader(f);
            BufferedReader br = new BufferedReader(lectorArchivo);
            String l = "";
            String aux = "";

            Integer contador = 0;
            while (true) {
                aux = br.readLine();
                if (aux != null) {
                    l = l + aux + "\n";
                    resultado.add(aux);
                } else {
                    break;
                }

            }
            br.close();
            lectorArchivo.close();
            return resultado;
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return null;
    }
}



