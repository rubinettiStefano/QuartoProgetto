package entities;

public class Persona
{
    public String nome,cognome;
    public int eta;

    public Persona(){}

    public Persona(String n,String c,int e)
    {
        nome=n;
        cognome=c;
        eta=e;
    }

    public String presentati()
    {
        return "Ciao sono "+nome+" "+cognome+" e ho "+eta+" anni";
    }
}
