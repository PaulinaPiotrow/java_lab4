public interface Budynek
{
    void setBudynek(String budynek);

    String getBudynek();

    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
}
