package liste;

import libreria.Console;
import libreria.FileReader;

import java.util.ArrayList;

public class LetturaFileNumeriDouble
{
    static void main()
    {
        //CREARE LETTORE
        FileReader fr = new FileReader("numeridouble.txt");

        ArrayList<Double> numeriLettiDaFile = new ArrayList<>();

        //hasNextLine è un metodo BOOLEANO che da true se il file ha ancora
        //righe non lette, false altrimenti
        while(fr.hasNextLine())
        {
            double singolaRiga = fr.readDouble();
            numeriLettiDaFile.add(singolaRiga);
        }

        Console.print(numeriLettiDaFile);
    }
}
