package esercizi;

import libreria.Console;
import libreria.FileReader;

import java.util.ArrayList;

public class MainTemplateListaFile
{
    static void main()
    {
        ArrayList<TelefonoCorrezione> telefoni = new ArrayList<>();
        inizializzaLista(telefoni);
        int cmd = 0;
        do
        {
            Console.print("Dammi comando");
            cmd = Console.readInt();

            switch (cmd)
            {
                case 1 -> stampaFiltratoPerMarca(telefoni);
                case -1 ->Console.print("CIAO CIAO, ALLA PROSSIMA");
                default ->Console.print("Comando non presente");
            }

        }while (cmd!=-1);
    }

    static void stampaFiltratoPerMarca(ArrayList<TelefonoCorrezione> lista)
    {
        Console.print("We, di che marca?");
        String marca = Console.readString();

        ArrayList<TelefonoCorrezione> marcaGiusta = new ArrayList<>();

        for(TelefonoCorrezione t : lista)
            if(t.getMarca().equalsIgnoreCase(marca))
                marcaGiusta.add(t);

        if(marcaGiusta.size()!=0) {
            Console.print("ECCO I TELEFONI DELLA TUA MARCA");
            for (TelefonoCorrezione t : marcaGiusta)
                Console.print(t);
        }
        else
            Console.print("NO TELEFONI DI QUELLA MARCA");
    }

    static void inizializzaLista( ArrayList<TelefonoCorrezione> daRiempire)
    {
        FileReader fr = new FileReader("datitelefoni.txt");
        ArrayList<String> righe = new ArrayList<>();

        while (fr.hasNextLine())
            righe.add(fr.readString());



        for(String riga : righe)
        {
            String[] splittato = riga.split(",");
            int prezzo = Integer.parseInt(splittato[1]);
            TelefonoCorrezione t = new TelefonoCorrezione(
                    splittato[0],
                    splittato[2],
                    prezzo
            );
            daRiempire.add(t);
        }
    }
}
