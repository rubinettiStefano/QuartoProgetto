import entities.Persona;
import entities.Studente;
import libreria.Console;

void main()
{
    Persona p = new Persona("AAA","BBB",21);
    Console.print(p.presentati());

    Studente s = new Studente( "EEE", "FFF",18,7.5);
    Console.print(s.presentati());
}