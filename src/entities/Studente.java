package entities;

public class Studente extends Persona {
    public double media;

    //    public Studente()
//    {
//        super();
//        //richiamato il costruttore di Persona
//    }
    public Studente(String n, String c, int e,double m) {
        super(n,c,e);
        //richiamato il costruttore di Persona
        media=m;
    }
    public Studente(){
        super();
    }


    public boolean promosso() {
        return media >= 6;
    }

    @Override
    public String toString() {
        String risultatoPresentatiDiPersona = super.toString();

        return risultatoPresentatiDiPersona + " e ho una media di " + media;
    }
}
