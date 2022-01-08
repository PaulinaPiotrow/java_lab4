
public class Main {

    public static void main(String[] args) {
        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwdracik = new Kwadrat();

        kwdracik.bok_a = 4;

        System.out.println("pole kwadraciku =  " + kwdracik.pole() );
        System.out.println("obwod kwadraciku =  " + kwdracik.obwod() );

        Prostokat prostokacik = new Prostokat();

        prostokacik.bok_a = 4;
        prostokacik.bok_b = 34;

        System.out.println("pole prostokaciku =  " + prostokacik.pole() );
        System.out.println("obwod prostokaciku =  " + prostokacik.obwod() );
    }
}
