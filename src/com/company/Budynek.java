package com.company;

public interface Budynek
{

    double set_powierzchnia(double pow);
    String set_adresBudynku(String adres);
    int set_liczbaOkien(int value);
    void set_liczbaMieszkancow(int value);
    void set_kolorDomu(KolorEnum kolor);

    void ustawPowierzchnie(double szerokosc, double dlugosc);
}
