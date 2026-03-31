package esercizi;

import entities.Persona;
import libreria.Console;
import libreria.FileReader;

import java.util.ArrayList;

public class MainCorrezione
{
    static void main()
    {
        FileReader fr = new FileReader("datitelefoni.txt");
        ArrayList<String> righe = new ArrayList<>();

        while (fr.hasNextLine())
            righe.add(fr.readString());

        ArrayList<TelefonoCorrezione> telefoni = new ArrayList<>();

        for(String riga : righe)
        {
            String[] splittato = riga.split(",");
            int prezzo = Integer.parseInt(splittato[1]);
            TelefonoCorrezione t = new TelefonoCorrezione(
                    splittato[0],
                    splittato[2],
                    prezzo
            );
            telefoni.add(t);
        }

        for(TelefonoCorrezione t:telefoni)
            Console.print(t);
    }
}
