package bo.gob.asfi.tipos.EquipoE;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jaduran on 15/10/2016.
 */
public class Buscador {

    public static void run() throws IOException
    {
        LinkedList<Cities> linkedCiudad = new LinkedList<Cities>();

        try {
            String cities ="./src/main/resources/fixtures/cities.txt";
            String cadena;
            FileReader f = new FileReader(cities);
            BufferedReader b = new BufferedReader(f);
            int n=0;
            while((cadena = b.readLine())!=null) {
                if (n>0)
                {
                  //  System.out.println(cadena);
                    String[] parts = cadena.split(",");

                    Cities Ciudades = new Cities();
                    Ciudades.setCityId(parts[0]);
                    Ciudades.setCountryID(parts[1]);
                    Ciudades.setRegionID(parts[2]);
                    Ciudades.setCity(parts[3]);
                    Ciudades.setLatitude(parts[4]);
                    Ciudades.setLongitude(parts[5]);
                    Ciudades.setTimeZone(parts[6]);
                    Ciudades.setTimeZone(parts[7]);
                    Ciudades.setCode(parts[8]);

                    linkedCiudad.addLast(Ciudades);
                }
                n++;

            }
            b.close();
            System.out.println ("Busqueda de ciudad");
            System.out.println ("Por favor introduzca la ciudad por teclado:");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in);
            entradaTeclado = entradaEscaner.nextLine ();
            System.out.println("Ciudad  | CountryID  | Latitud | Longitud");
            for( Cities Ciudad : linkedCiudad) {

                String datoCiudad= Ciudad.getCity();
                datoCiudad.replaceAll("\"", "");

                if (datoCiudad.equals( "\"" + entradaTeclado + "\""))
                {

                    System.out.println(Ciudad.getCity() + " | " + Ciudad.getCountryID() + " | " + Ciudad.getLatitude()+ " | " + Ciudad.getLongitude() );
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {

        }
    }
}
