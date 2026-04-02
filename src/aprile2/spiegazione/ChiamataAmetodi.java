package aprile2.spiegazione;

import libreria.Console;

import java.util.ArrayList;

public class ChiamataAmetodi
{
    static void main() {
        ArrayList<Mobile> mobili = new ArrayList<>();
        inizializza(mobili);
        //stampaTutti(mobili);

        Mobile m1 = mobili.get(0);
//        m1.setMateriale("aaaaa");
        //scrittura liscia
//        m1.materiale = "Pippi";
        //lettura liscia
//        String materialedim = m1.materiale;

        //scrittura con setter
        m1.setColore("giallo");
        //lettura con getter
        String materialedim1 = m1.getMateriale();
//        try
//        {
//            double prezzoScontato = m1.prezzoScontato(0.2);
//            Console.print(prezzoScontato);
//        }
//        catch (RuntimeException e)
//        {
//            Console.print("La percentuale di sconto era sbagliata e non ho fatto il calcolo");
//        }

        try
        {
        }
        catch (RuntimeException e)
        {
            Console.print(e.getMessage());
        }

        Console.print("FINE PROGRAMMA");
    }

    private static void stampaTutti(ArrayList<Mobile> mobili)
    {
        for(Mobile m : mobili) {
            String s = m.toString();
            Console.print(s);

        }
    }

    static void inizializza(ArrayList<Mobile> mobili)
    {
        mobili.add(
                new Mobile(
                        null,
                        "",
                        "Blallo",
                        -450.00
                )
        );
        mobili.add(
                new Mobile(
                                "Acciaio e Vetro",
                                "Scrivania Industrial",
                                "Nero",
                                220.50
                        )
        );
        mobili.add(new Mobile("Velluto", "Poltrona Relax", "Blu", 315.00));
        mobili.add(new Mobile("MDF Laccato", "Libreria Minimal", "Bianco", 120.00));
        mobili.add(new Mobile("Pino Massiccio", "Armadio Rustico", "Marrone", 580.99));
    }
}
