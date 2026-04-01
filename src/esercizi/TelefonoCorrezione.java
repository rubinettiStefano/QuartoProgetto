package esercizi;

import java.util.ArrayList;

public class TelefonoCorrezione
{
    private String marca,modello;
    private int prezzo;
    private ArrayList<String> appPreinstallate = new ArrayList<>();

    public TelefonoCorrezione(){}

    public TelefonoCorrezione(String marca, String modello, int prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public ArrayList<String> getAppPreinstallate()
    {
        return appPreinstallate;
    }

    public int lunghezzaTotaleAppPreinstallate()
    {
        int res = 0;
        for(String app: appPreinstallate)
        {
            res += app.length();
        }

        return res;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String toString()
    {
        return "Telefono di marca "+marca+", Modello "+modello+", Prezzo "+prezzo;
    }
}
