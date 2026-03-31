import entities.Docente;
import entities.Persona;
import entities.Studente;
import libreria.Console;

void main()
{
    Persona p = new Persona();
    p.nome = "AAA";
    p.cognome = "BBB";
    p.eta = 21;
    Console.print(p.toString());

    Docente d = new Docente();
    d.nome = "CCC";
    d.cognome = "DDD";
    d.eta = 30;
    d.materia = "JAVA";
    Console.print(d.toString());

    Studente s = new Studente();
    s.nome = "EEE";
    s.cognome = "FFF";
    s.eta = 18;
    s.media = 7.5;
    Console.print(s.toString());
}