package liste;

import libreria.Console;
import libreria.FileReader;

import java.util.ArrayList;

public class LetturaFile
{
    static void main()
    {
        //CREARE LETTORE
        FileReader fr = new FileReader("nomi.txt");

        ArrayList<String> nomiLettiDaFile = new ArrayList<>();

        //hasNextLine è un metodo BOOLEANO che da true se il file ha ancora
        //righe non lette, false altrimenti
        while(fr.hasNextLine())
        {
            String singolaRiga = fr.readString();
            nomiLettiDaFile.add(singolaRiga);
        }

        Console.print(nomiLettiDaFile);
    }
}
