package liste;

import libreria.Console;
import libreria.FileReader;

import java.util.ArrayList;

public class LetturaFileNumeri
{
    static void main()
    {
        //CREARE LETTORE
        FileReader fr = new FileReader("numeri.txt");

        ArrayList<Integer> numeriLettiDaFile = new ArrayList<>();

        //hasNextLine è un metodo BOOLEANO che da true se il file ha ancora
        //righe non lette, false altrimenti
        while(fr.hasNextLine())
        {
            int singolaRiga = fr.readInt();
            numeriLettiDaFile.add(singolaRiga);
        }

        Console.print(numeriLettiDaFile);
    }
}
