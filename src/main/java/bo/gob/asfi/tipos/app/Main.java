package bo.gob.asfi.tipos.app;

import bo.gob.asfi.tipos.BankDemo.BankDemo;
import bo.gob.asfi.tipos.BankDemo.HeartBeat;
import bo.gob.asfi.tipos.collections.ListaEnlazada;
import bo.gob.asfi.tipos.collections.Listas;
import bo.gob.asfi.tipos.collections.Conjuntos;
import bo.gob.asfi.tipos.collections.Mapas;
import bo.gob.asfi.tipos.utils.Common;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Common.displayTitle("tipos");
	    //System.out.println("hello from Intellij ");

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

        //new HeartBeat().run();


        //stack
        new TokenizerStringSample().run();
    }
}
