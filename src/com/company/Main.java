package com.company;

public class Main {

    public static void main(String[] args) {
	    Pracownik hr = new Pracownik();

        hr.setImie("Ania");
        hr.setPensja(1900);

        Pracownik manager =  new Pracownik();

        manager.setImie("Przemyslaw");
        manager.setPensja(7000);

        Student politolog = new Student();

        politolog.setKierunek("Politologia");
        politolog.setIndeks(0);
        politolog.setImie("Patrycja");

        Student informatyk = new Student();

        informatyk.setIndeks(354);
        informatyk.setKierunek("Informatyka");
        informatyk.setImie("Jakub");

        System.out.println(hr.toString());
        System.out.println(manager.toString());
        System.out.println(politolog.toString());
        System.out.println(informatyk.toString());


    }
}
