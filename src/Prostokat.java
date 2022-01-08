
public class Prostokat extends Figura{
    public double bok_a;
    public double bok_b;


    public double pole(){
        return bok_a * bok_b;
    }

    public double obwod(){
        return bok_a * 2 + bok_b * 2;
    }
}
