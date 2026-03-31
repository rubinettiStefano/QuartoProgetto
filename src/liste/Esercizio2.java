package liste;

import libreria.Console;

import java.util.ArrayList;

public class Esercizio2
{
    static void main()
    {
        //LISTA DI STRING DETTA PAROLE
        ArrayList<String> parole = new ArrayList<>();
        parole.add("Pippo");
        parole.add("albero");
        parole.add("catarifrangente");
        parole.add("gino");
        parole.add("parallelepipedo");
        parole.add("pluriennalle");
        parole.add("paperino");

        //ottenere lista solo con stringhe pi`u lunghe di 6 caratteri

        //1 - Creo lista risultato
        ArrayList<String> paroleLunghe = new ArrayList<>();
        //2 - fare scorrimento
        for(String el : parole)
        {
            //3 - Controllo criterio con if
            if(el.length()>6)
            {
                //4 - se è vero lo aggiungo alla lista
                paroleLunghe.add(el);
            }
        }
        Console.print(paroleLunghe);

        //lista con parole che iniziano per p
        ArrayList<String> paroleConP = new ArrayList<>();
        //2 - fare scorrimento
        for(String el : parole)
        {
            //3 - Controllo criterio con if          //se el="pArAlLeLePiPeDo" -> el.toLowerCase() -> "parellepipedo"
            //                                          el.toUpperCase() -> "PARALLELEPIPEDO"
            if(el.toLowerCase().startsWith("p")  )
            {
                //4 - se è vero lo aggiungo alla lista
                paroleConP.add(el);
            }
        }
        Console.print(paroleConP);

    }
}
