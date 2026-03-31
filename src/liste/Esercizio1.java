package liste;

import libreria.Console;

import java.util.ArrayList;

public class Esercizio1
{
    static void main() {

        //CREARE LISTA DI STRING CHIAMATA parole
        ArrayList<String> parole = new ArrayList<>();
        //voglio aggiungere, in questo ordine, pippo,pluto e paperino
        parole.add("pippo");
        parole.add("pluto");
        parole.add("paperino");

        //voglio scorrere la lista e stampare ogni parola preceduta da ciao
        for(String p : parole)
        {
            Console.print("ciao "+p);
        }
    }
}
