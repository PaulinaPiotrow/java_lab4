package com.company;

public class Pracownik implements PracownikI{
    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    private int pensja;
    private String imie;

    public void przywitaj_sie() {
        System.out.println("Dzienbody, mam na imię " + imie + "i jestem pracownikiem");
    }
    public void pozegnaj_sie() {
        System.out.println("Dowidzenia, i zapraszam ponownie.");
    }

    public void zglos_usterke(String zgloszenie){
        System.out.println("Niestety nic sie nie da zrobic, u mnie wszystko dziala.");
    }

    public void zapytaj_o_pensje(){
        System.out.println("Moja pensja to " + pensja);
    }

    public void potrac_pensje(int kara){
        this.pensja -= kara;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pensja=" + pensja +
                ", imie='" + imie + '\'' +
                '}';
    }
}
