package com.company;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
        Budynek budynek = new Budynek() {

            private double _powierzchnia;
            private String _adresBudynku;
            private int _liczbaOkien;
            private int _liczbaMieszkancow;
            private KolorEnum _kolorDomu;

            public double get_powierzchnia() {
                return _powierzchnia;
            }

            public double set_powierzchnia(double pow){
                this._powierzchnia = pow;
                return this._powierzchnia;
            }

            public String get_adresBudynku() {
                return _adresBudynku;
            }

            public String set_adresBudynku(String adres)
            {
                this._adresBudynku = adres;
                return this._adresBudynku;
            }


            public int get_liczbaOkien() {
                return _liczbaOkien;
            }

            public int set_liczbaOkien(int value){
                this._liczbaOkien = value;
                return this._liczbaOkien;
            }

            public int get_liczbaMieszkancow() {
                return _liczbaMieszkancow;
            }

            public void set_liczbaMieszkancow(int value){
                this._liczbaMieszkancow = value;

            }

            public KolorEnum get_kolorDomu() {
                return _kolorDomu;
            }

            public void set_kolorDomu(KolorEnum kolor){
                this._kolorDomu = kolor;

            }

            public void ustawPowierzchnie(double szerokosc, double dlugosc){
                this._powierzchnia = szerokosc * dlugosc;
            }
        };
        budynek.set_adresBudynku("ul. Stanów Zjednoczonych 144B");
        budynek.set_powierzchnia(64);
        budynek.set_kolorDomu(KolorEnum.szary);
        budynek.set_liczbaMieszkancow(7);
        budynek.set_liczbaOkien(16);

        Dom moj_dom = new Dom();
        moj_dom.set_adresBudynku("ul. Warszawska 144B");
        moj_dom.set_powierzchnia(76);
        moj_dom.set_kolorDomu(KolorEnum.czerowny);
        moj_dom.set_liczbaMieszkancow(9);
        moj_dom.set_liczbaOkien(24);

        System.out.println(moj_dom.toString());
        System.out.println(budynek.toString());
    }

}
