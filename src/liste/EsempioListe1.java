package liste;

import libreria.Console;

import java.util.ArrayList;

//classe di LAVORO/AVVIO
public class EsempioListe1
{
    static void main()
    {
        int[] numeri = new int[5];
        numeri[0] = 10;
        numeri[1] = 12;
        numeri[2] = 7;
        numeri[3] = 78;
        numeri[4] = 3;

        //creo una nuova lista di interi vuota
        ArrayList<Integer> numeriInLista = new ArrayList<>();
        numeriInLista.add(10);
        numeriInLista.add(12);
        numeriInLista.add(7);
        numeriInLista.add(78);
        numeriInLista.add(3);

        //stampo tutti numeri array
        Console.print("STAMPA ARRAY");
        for(int i=0;i<numeri.length;i++)
        {
            Console.print(numeri[i]);
        }
        Console.print("STAMPA LISTA");
        //stampo tutti numeri in lista
        for(int i=0;i<numeriInLista.size();i++)
        {
            Console.print(numeriInLista.get(i));
        }
    }
}
