package aprile2.spiegazione;

public class Mobile
{
    private String materiale,modello,colore;
    private double prezzo;

    public Mobile(){}

    public Mobile(String materiale, String modello, String colore, double prezzo) {
        this.materiale = materiale;
        this.modello = modello;
        this.colore = colore;
        this.prezzo = prezzo;
    }





     public String toString() {
        return "Mobile{" +
                "materiale='" + materiale + '\'' +
                ", modello='" + modello + '\'' +
                ", colore='" + colore + '\'' +
                ", prezzo=" + prezzo + '\'' +
                ", pocoCostoso=" + pocoCostoso() +
                '}';
    }

    public double prezzoScontato(double percSconto)
    {
        //sconto >= 1
        if(percSconto>=1)
            throw new RuntimeException("Buffone, dammi percentuale minore del 100%");

        if(percSconto<0)
            throw new RuntimeException("Buffone, dammi percentuale maggiore uguale a 0");
        //sconto negativo
        return prezzo*(1-percSconto);
    }

    public boolean pocoCostoso()
    {
        if(prezzo<0)
            throw new RuntimeException("Prezzo negativo");
        return prezzo<300;
    }
}
