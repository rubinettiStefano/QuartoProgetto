package liste;

import libreria.Console;

import java.util.ArrayList;

public class Esercizio3
{
    static void main()
    {
        //creo nuova lista di numeri
        ArrayList<Integer> numeri = new ArrayList<>();
        //aggiungo 3,9 e 14
        numeri.add(3);
        numeri.add(9);
        numeri.add(14);

        //creo nuova lista risultato, numeriRaddoppiati
        ArrayList<Integer> numeriRaddoppiati = new ArrayList<>();
        //scorro lista iniziale, voglio chiamare ogni elemento n
        for(Integer n : numeri)
        {
            //voglio creare una variabile chiamata doppio con il valore di n raddoppiato
            Integer doppio = n*2;
            //aggiungiamo doppio alla lista nuova
            numeriRaddoppiati.add(doppio);
        }

        Console.print(numeriRaddoppiati);
    }
}
