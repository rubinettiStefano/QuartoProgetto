package aprile2.spiegazione;

public class Mobile {
    private String materiale, modello, colore;
    private double prezzo;

    public Mobile() {
    }

    public Mobile(String materiale, String modello, String colore, double prezzo) {

        setMateriale(materiale);
        setModello(modello);
        setColore(colore);
        setPrezzo(prezzo);
    }


    public void setMateriale(String materiale) {
        //esegue controlli e lancia eccezione se falliscono
        if (materiale == null || materiale.length() < 3)
            throw new RuntimeException("Materiale non valido");

        //assegnamento del parametro alla proprietà
        this.materiale = materiale;
    }

    public String getMateriale() {
        return materiale == null ? "Materiale non scelto" : materiale;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        if (modello == null || modello.length() < 3)
            throw new RuntimeException("Materiale non valido");
        this.modello = modello;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        if (colore == null)
            throw new RuntimeException("Colore nullo");

        switch (colore.toLowerCase()) {
            case "blu", "nero", "bianco", "marrone", "rosso", "giallo" -> this.colore = colore;
            default -> throw new RuntimeException("Colore non valido");
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo < 0)
            throw new RuntimeException("No prezzi negativi");

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

    public double prezzoScontato(double percSconto) {
        //sconto >= 1
        if (percSconto >= 1)
            throw new RuntimeException("Buffone, dammi percentuale minore del 100%");

        if (percSconto < 0)
            throw new RuntimeException("Buffone, dammi percentuale maggiore uguale a 0");
        //sconto negativo
        return prezzo * (1 - percSconto);
    }

    public boolean pocoCostoso() {
        if (prezzo < 0)
            throw new RuntimeException("Prezzo negativo");
        return prezzo < 300;
    }
}
