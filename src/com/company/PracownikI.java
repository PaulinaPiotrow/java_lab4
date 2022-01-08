package com.company;

public interface PracownikI extends CzlowiekI{
    public void zglos_usterke(String zgloszenie);
    public void zapytaj_o_pensje();
    public void potrac_pensje(int kara);
}
