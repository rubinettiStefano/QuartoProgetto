package esercizi;

import libreria.Console;

import java.util.ArrayList;

public class GiocoTipi
{
    static void main() {
        String n = "Stefano";
        String s = "Ciao "+n;
        //parametro di un metodo che richiede in ingresso String
        //parte di una espressione di concatenazione
        //aggiunta ad una lista di stringhe

        //arr     ->   arr[1]

//        if(roba.get(0).split(" ")[1].equals(n))
//        {
//            Console.print("Era effettivamente un boolean con valore vero");
//        }
        //roba -> ArrayList<String>
        //roba.get(0) -> String
        // roba.get(0).split(" ")-> String[] di dimensione 2
        //roba.get(0).split(" ")[1]-> String di valore "Stefano"
        // roba.get(0).split(" ")[1].equals(n) -> boolean

        ArrayList<String> roba = new ArrayList<>();
        roba.add(s);

        //voglio creare un array di Stringhe con DIMENSIONE lunghezza della stringa
        //alla posizione 0 di roba più lunghezza dell'array
        // di quella stessa String splittata per lo spazio
        String[] arr = new String[ roba.get(0).length() + new String[roba.get(0).split(" ").length].length];

        TelefonoCorrezione t = new TelefonoCorrezione();
        t.setMarca("OnePlus");
        t.setModello("Nord Qualcosa");
        t.setPrezzo(150);


        t.getAppPreinstallate().add("GMAIL");
        t.getAppPreinstallate().add("RUBRICA");
        t.getAppPreinstallate().add("MESSAGGI");
        t.getAppPreinstallate().add("PippoPlutoPaperino&Co");



        TelefonoCorrezione t1 = new TelefonoCorrezione();
        t1.setMarca("APple");
        t1.setModello("iPhOnE19");
        t1.setPrezzo(10000);

        t1.getAppPreinstallate().add("iMAIL");
        t1.getAppPreinstallate().add("iRUBRICA");
        t1.getAppPreinstallate().add("iMESSAGGI");


        ArrayList<TelefonoCorrezione> l = new ArrayList<>();
        l.add(t1);
        l.add(t);


//        t.getAppPreinstallate().add("GMAIL");
//        t.getAppPreinstallate().add("RUBRICA");
//        t.getAppPreinstallate().add("MESSAGGI");
//        t.getAppPreinstallate().add("PippoPlutoPaperino&Co");
        //41
//        t.lunghezzaTotaleAppPreinstallate();
        //22
//        t1.lunghezzaTotaleAppPreinstallate();
        int somma = 0;
        for(TelefonoCorrezione tel : l)
        {
            somma+=tel.lunghezzaTotaleAppPreinstallate();
        }
        Console.print(somma);


    }
}
