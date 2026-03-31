package entities;

public class Docente extends Persona
{
    public String materia;

    public String toString()
    {
        String risultatoPresentatiDiPersona = super.toString();

        return risultatoPresentatiDiPersona+" e insegno "+materia;
    }
}
