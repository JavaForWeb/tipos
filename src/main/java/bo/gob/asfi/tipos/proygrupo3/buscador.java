package bo.gob.asfi.tipos.proygrupo3;

import java.io.*;
import java.util.Scanner;

/**
 * Created by abaraujo on 15/10/2016.
 */
public class buscador {


    public void run() throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            FileReader fr = new FileReader("./src/main/resources/fixtures/cities.txt");
            BufferedReader br = new BufferedReader(fr);



            String linea;

            String[] resultados;

            Scanner valor = new Scanner(System.in);
            String texto = valor.nextLine();

            while((linea = br.readLine()) != null) {

                if (linea.toString().contains(texto)) {

                    resultados = linea.toString().split(",");
                    //System.out.println(resultados[3] + " " + resultados[1] + " " + resultados[4] +" "  + resultados[5] );

                    String contriesId = resultados[1];

                    String regionsId = resultados[2];

                    String lineaContries;

                    FileReader fr2 = new FileReader("./src/main/resources/fixtures/Countries.txt");
                    BufferedReader br2 = new BufferedReader(fr2);

                    while ((lineaContries = br2.readLine()) != null) {

                        String[] country = lineaContries.toString().split(",");

                        if (country[0].toString().equals(contriesId) ){

                            //System.out.println(resultados[3] + " " + country[1] +" "+ resultados[1] + " " + resultados[4] + " " + resultados[5]);


                            FileReader fr3 = new FileReader("./src/main/resources/fixtures/Regions.txt");
                            BufferedReader br3 = new BufferedReader(fr3);
                            String lineaRegions;

                            while ((lineaRegions = br3.readLine()) != null) {

                                String[] regions = lineaRegions.toString().split(",");

                                if (regions[0].toString().equals(regionsId) ){

                                    System.out.println(resultados[3] + " " + country[1] +" "+ regions[2] + " " + resultados[4] + " " + resultados[5]);

                                }
                            }
                            fr3.close();
                        }
                    }
                    fr2.close();
                }
            }
            fr.close();
        }
        catch(Exception e) {
            System.out.println("Excepcion leyendo fichero " + e);
        }

    }




}
