package liste;

import libreria.Console;

import java.util.ArrayList;

public class Esercizio4
{
    static void main() {

        //creo nuova lista di stringhe chiamata nomi
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Stefano");
        nomi.add("Giacomo");
        nomi.add("Pippo");
        nomi.add("Pluto");
        nomi.add("Paperino");

        //nuova lista con dentro il numero di caratteri per ogni parola
        //CREO UNA LISTA di Interi
        ArrayList<Integer> lunghezzeNomi = new ArrayList<>();

        for(String n : nomi)
        {
            int lunghezza = n.length();
            lunghezzeNomi.add(lunghezza);
        }

        Console.print(lunghezzeNomi);

        //alla prima posizione ci deve essere "Ciao Stefano!" e avanti così per le altre
        ArrayList<String> saluti = new ArrayList<>();

        for(String n : nomi)
        {
            String s = "Ciao " + n + "!";
            saluti.add(s);
        }

        Console.print(saluti);

       //possiamo concatenare filtro e mappatura
        //OBIETTIVO -> SALUTARE SOLO chi ha il nome che NON inizia per P
        //1) FILTRO per solo NON p
        //2) Mappatura con saluto
        ArrayList<String> nonP = new ArrayList<>();

        for(String n : nomi)
        {
            if(!n.toLowerCase().startsWith("p"))
                nonP.add(n);
        }

        //mappo
        ArrayList<String> salutiNonP = new ArrayList<>();

        for (String n : nonP)
        {
            String s = "Ciao " + n + "!";
            salutiNonP.add(s);
        }

        Console.print(salutiNonP);
    }
}
