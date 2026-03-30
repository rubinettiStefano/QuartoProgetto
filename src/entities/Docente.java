package entities;

public class Docente extends Persona
{
    public String materia;

    @Override
    public String presentati()
    {
        String risultatoPresentatiDiPersona = super.presentati();

        return risultatoPresentatiDiPersona+" e insegno "+materia;
    }
}
