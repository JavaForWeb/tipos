package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.BankDemo.BankDemo;
import bo.gob.asfi.tipos.BankDemo.HeartBeat;
import bo.gob.asfi.tipos.collections.ListaEnlazada;
import bo.gob.asfi.tipos.collections.Listas;
import bo.gob.asfi.tipos.collections.Conjuntos;
import bo.gob.asfi.tipos.collections.Mapas;
import bo.gob.asfi.tipos.hackathon1.HackathonMain;
import bo.gob.asfi.tipos.threads.JoinExample;
import bo.gob.asfi.tipos.threads.JoinExample2;
import bo.gob.asfi.tipos.threads.TestRunnableDemo;
import bo.gob.asfi.tipos.threads.TestThreadDemo;
import bo.gob.asfi.tipos.threads.ThreadClassDemo;
import bo.gob.asfi.tipos.EquipoE.Buscador;
import bo.gob.asfi.tipos.utils.Common;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    static void multiplesArgumentosCadena ( String ... cadenas)
    {

        System.out.println(cadenas);


    }

    static void multiplesArgumentosEntero ( String cadenaNormal, Integer ... enteros)
    {

        System.out.println(cadenaNormal);
        System.out.println(enteros);


    }
    public static void main(String[] args) {

        Common.displayTitle("tipos");
	    //System.out.println("hello from Intellij ");

        /*
        multiplesArgumentosCadena( "uno", "dos", "tres");
        multiplesArgumentosCadena();

        multiplesArgumentosEntero("demo" );


        for(int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
        */

        //new Listas().run();
        //new ListaEnlazada().run();
        //new Conjuntos().run();
        //new Mapas().run();

        //Excepciones

        //new CopyFile().run();
        /*
        try {
            new CopyFile().run();
        } catch( IOException e) {
            e.printStackTrace();
        }
        */
        //Excepciones de usuario
        //new BankDemo().run();


        //System.setErr(OutputStreamWriter );

        //new SubFolders().run();

        //stack
        //new TokenizerStringSample().run();


        //logs
       // LogExample.run();

        //Schedulers
     //   new HeartBeat().run();

        //threads

        //TestRunnableDemo.run();
        //TestThreadDemo.run();

        //Hackaton1TeamA.run();
        //ThreadClassDemo.run();

        //JoinExample2.run();
        //JoinExample.run();

        //new HackathonMain().run();


        try {
            Buscador.run();

        } catch( IOException e) {
            e.printStackTrace();
        }


    }
}
