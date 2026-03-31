package letturaoggettifile;

import entities.Persona;
import libreria.Console;
import libreria.FileReader;

import java.util.ArrayList;
import java.util.Collection;

public class LettorePersone {

    static void main() {

        FileReader fr = new FileReader("dati.txt");
        ArrayList<String> righe = new ArrayList<>();

        while (fr.hasNextLine())
            righe.add(fr.readString());

        ArrayList<Persona> persone = new ArrayList<>();

        for(String riga : righe)
        {
            String[] splittato = riga.split(",");
            int convertita = Integer.parseInt(splittato[2]);
            Persona p = new Persona(
                    splittato[0],
                    splittato[1],
                    convertita
            );
            persone.add(p);
        }

        ArrayList<Persona> personeVecchie = new ArrayList<>();
        for(Persona p : persone)
            if(p.eta>29)
                personeVecchie.add(p);

        Console.print(personeVecchie);

    }
}
/*
        String esempioRiga = "Stefano,Rubinetti,30";
        String[] splittato = esempioRiga.split(",");
        //splittato[0] = "Stefano";
        //splittato[1] = "Rubinetti";
        //splittato[2] = "30";
        int convertita = Integer.parseInt(splittato[2]);
        //se fosse un double allora double convertita = Double.parseDouble(splittato[2]);
        Persona p = new Persona(
                splittato[0],
                splittato[1],
                convertita
        );
 */