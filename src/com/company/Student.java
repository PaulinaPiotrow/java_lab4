package com.company;

public class Student implements StudentI {
    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    private String kierunek;
    private int indeks;
    private String imie;

    public void przywitaj_sie() {
        System.out.println("Dzienbody, mam na imię " + imie + "i jestem studentem");
    }
    public void pozegnaj_sie() {
        System.out.println("Dowidzenia Panie profesorze.");
    }

    public void zadaj_pytanie(String pytanie){
        System.out.println("Nie wiem");
    }

    public void podaj_kierunek(){
        System.out.println("Jestem na kierunku " + kierunek);
    }

    public void podaj_indeks(){
        System.out.println("Moj indeks to " + indeks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "kierunek='" + kierunek + '\'' +
                ", indeks=" + indeks +
                ", imie='" + imie + '\'' +
                '}';
    }
}
