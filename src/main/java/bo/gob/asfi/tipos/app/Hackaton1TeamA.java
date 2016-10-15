package bo.gob.asfi.tipos.app;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * Created by alesanchez on 15/10/2016.
 */
public class Hackaton1TeamA {
    String cadenaABuscar;

    static void run() throws IOException {
        //CiudadesTeamA
        BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/fixtures/cities.txt"));
        // Leemos la primera linea
        String s1;
        int lineas = 0;
        ArrayList<CiudadesTeamA> listaCiudades = new ArrayList<>();
        while ((s1 = br.readLine())!=null)
        {
            s1 = s1.replace("\"","");
            if (lineas > 0) {
                String[] p = s1.split(",");
                CiudadesTeamA ciudad = new CiudadesTeamA(
                        Integer.parseInt(p[0]),
                        Integer.parseInt(p[1]),Integer.parseInt(p[2]),p[3],Double.parseDouble(p[4]),Double.parseDouble(p[5]),p[6],
                        Integer.parseInt(p[7]),p[8]);
                listaCiudades.add(ciudad);
            }
            lineas +=1;
        }
        //RegionTeamA
        br = new BufferedReader(new FileReader("./src/main/resources/fixtures/Regions.txt"));
        // Leemos la primera linea
        lineas = 0;
        ArrayList<RegionTeamA> listaRegiones = new ArrayList<>();
        while ((s1 = br.readLine())!=null)
        {
            s1 = s1.replace("\"","");
            if (lineas > 0) {
                String[] p = s1.split(",");
                RegionTeamA region = new RegionTeamA(
                        Integer.parseInt(p[0]),
                        Integer.parseInt(p[1]),
                        p[2],
                        p[3],
                        p[4]);
                listaRegiones.add(region);
            }
            lineas +=1;
        }
        //PaisesTeamA
        br = new BufferedReader(new FileReader("./src/main/resources/fixtures/Countries.txt"));
        // Leemos la primera linea
        lineas = 0;
        ArrayList<PaisesTeamA> listaPaises = new ArrayList<>();
        while ((s1 = br.readLine())!=null)
        {
            s1 = s1.replace("\"\"","\"_\"").replace("\"","");
            if (lineas > 0) {
                String[] p = s1.split(",");
                PaisesTeamA pais = new PaisesTeamA(
                        Integer.parseInt(p[0]),
                        p[1],
                        p[2],
                        p[3],
                        p[4],
                        p[5],
                        p[6],
                        p[7],
                        p[8],
                        p[9],
                        p[10],
                        p[11],
                        p[12],
                        p[13],
                        p[14],
                        p[15].replace("_",""));
                listaPaises.add(pais);
            }
            lineas +=1;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la ciudad a ser buscada:\n");
        //For string
        String texto= scan.nextLine();
        ArrayList<CiudadesTeamA> ciudadesEncontradas = new ArrayList<>();
        for(CiudadesTeamA buscar:listaCiudades)
        {
            if (buscar.getCity().contains(texto))
            {
                ciudadesEncontradas.add(buscar);
            }
        }
        if (ciudadesEncontradas.isEmpty())
        {
            System.out.println("No se encontro ninguna ciudad con el texto: "  + texto);
        }
        else
        {
            System.out.println("|------------------------------|------------------------------|------------------------------|------------------------------|") ;
            System.out.println("|"  + String.format("%-30s", "Ciudad")   + "|" + String.format("%-30s", "Country Id") + "|" + String.format("%-30s", "Latitude") + "|" + String.format("%-30s", "Longitude") + "|") ;
            System.out.println("|------------------------------|------------------------------|------------------------------|------------------------------|") ;
            for (CiudadesTeamA ciudad: ciudadesEncontradas)
            {
                System.out.println(ciudad);
            }
            System.out.println("|------------------------------|------------------------------|------------------------------|------------------------------|") ;
            System.out.println("\n") ;
            System.out.println("|------------------------------|------------------------------|------------------------------|------------------------------|------------------------------|") ;
            System.out.println("|"  + String.format("%-30s", "Ciudad")   + "|" + String.format("%-30s", "País") + "|" + String.format("%-30s", "RegionTeamA") + "|" + String.format("%-30s", "Latitude") + "|" + String.format("%-30s", "Longitude") + "|") ;
            System.out.println("|------------------------------|------------------------------|------------------------------|------------------------------|------------------------------|") ;
            for (CiudadesTeamA ciudad: ciudadesEncontradas)
            {
                String NombreRegion, NombrePais;
                NombreRegion = "";
                NombrePais = "";
                for(RegionTeamA region: listaRegiones)
                {
                    if (region.getRegionId() == ciudad.getRegionId() )
                    {
                        NombreRegion = region.getRegion();
                        break;
                    }
                }
                for(PaisesTeamA pais: listaPaises)
                {
                    if (pais.getCountryId() == ciudad.getCountryId() )
                    {
                        NombrePais= pais.getCountry();
                        break;
                    }
                }
                System.out.println("|"  + String.format("%-30s", ciudad.getCity())   + "|" + String.format("%-30s", NombrePais) + "|" + String.format("%-30s", NombreRegion) + "|" + String.format("%-30s", ciudad.getLatitude()) + "|" + String.format("%-30s", ciudad.getLongitude()) + "|") ;
            }
            System.out.println("|------------------------------|------------------------------|------------------------------|------------------------------|------------------------------|") ;

            System.out.println("\n") ;
            System.out.println("|------------------------------|------------------------------|------------------------------|") ;
            System.out.println("|"  + String.format("%-30s", "Pais")   + "|" + String.format("%-30s", "Regiones") + "|" + String.format("%-30s", "CiudadesTeamA") + "|") ;
            System.out.println("|------------------------------|------------------------------|------------------------------|") ;
            for (PaisesTeamA pais: listaPaises)
            {
                int contadorRegiones = 0;
                for (RegionTeamA region : listaRegiones)
                {
                    if (region.getCountryId() == pais.getCountryId())
                    {
                        contadorRegiones +=1;
                    }
                }
                int contadorCiudad = 0;
                for (CiudadesTeamA ciudad : listaCiudades)
                {
                    if (ciudad.getCountryId() == pais.getCountryId())
                    {
                        contadorCiudad +=1;
                    }
                }
                System.out.println("|"  + String.format("%-30s", pais.getCountry())   + "|" + String.format("%-30s", contadorRegiones) + "|" + String.format("%-30s", contadorCiudad) + "|") ;
            }
            System.out.println("|------------------------------|------------------------------|------------------------------|") ;
        }
    }

}
