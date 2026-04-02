package aprile2.spiegazione;

import libreria.Console;

public class EsempioTryCatch {
    static void main() {




        creaMobileDaUtente();

        //chiusura delicata del programma
        //quando utente non c'entra
        try
        {
            //istruzione
        }catch (RuntimeException e)
        {
            Console.print("STAMPA DI ERRORE");
            System.exit(-1);//TERMINA INTERO PROGRAMMA
        }
    }

    static Mobile creaMobileDaUtente()
    {
        //retry
        //quando errore deriva da input tastiera utente
        Mobile m = new Mobile();

        //RICHIESTA MODELLO
        Console.print("Dammi modello");
        while (true)
        {
            try
            {

                m.setModello(Console.readString());
                break;
            }
            catch (RuntimeException e)
            {
                Console.print("Sbagliato, rimettilo");
            }
        }
        //FINE RICHIESTA MODELLO

        Console.print("Dammi materiale");
        while (true)
        {
            try
            {

                m.setMateriale(Console.readString());
                break;
            }
            catch (RuntimeException e)
            {
                Console.print("Sbagliato, rimettilo");
            }
        }

        Console.print("Dammi colore");
        while (true)
        {
            try
            {
                m.setColore(Console.readString());
                break;
            }
            catch (RuntimeException e)
            {
                Console.print("Sbagliato, rimettilo");
            }
        }

        Console.print("Dammi prezzo");
        while (true)
        {
            try
            {
                m.setPrezzo(Console.readDouble());
                break;
            }
            catch (RuntimeException e)
            {
                Console.print("Sbagliato, rimettilo");
            }
        }

        return m;
    }
}
