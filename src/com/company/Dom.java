package com.company;

public class Dom implements Budynek
{
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

    private double _powierzchnia;
    private String _adresBudynku;
    private int _liczbaOkien;
    private int _liczbaMieszkancow;
    private KolorEnum _kolorDomu;


    public double okna_na_mieszkanca(){
        double okna = this._liczbaOkien;
        double mieszkancy = this._liczbaMieszkancow;
        return okna/mieszkancy;
    }
    @Override
    public String toString() {
        return "Dom{" +
                "_powierzchnia=" + _powierzchnia +
                ", _adresBudynku='" + _adresBudynku + '\'' +
                ", _liczbaOkien=" + _liczbaOkien +
                ", _liczbaMieszkancow=" + _liczbaMieszkancow +
                ", _kolorDomu=" + _kolorDomu +
                '}';
    }










}
