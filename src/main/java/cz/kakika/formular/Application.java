package cz.kakika.formular;

import java.awt.event.ActionEvent;

public class Application {                                         // vytvoření classy
    private DataHolder ulozenkaVAppce;                             // atribut (datový typ "DataHolder" , název "ulozenkaVAppce")
    private Gui okenkoVAppce;

    public Application (DataHolder ulozenkaArgument, Gui okenkoArgument){    // konstruktor (je tam pouze public + název třídy)
        ulozenkaVAppce = ulozenkaArgument;
        okenkoVAppce = okenkoArgument;
    }

    public void run() {                                          // metoda (public + void/String/int... + libovolný název)
        okenkoVAppce.createOkenko(this);
    }

    public void akceOdeslat(ActionEvent e) {
        System.out.println("Akce odeslat se hlási z aplication");
        ulozenkaVAppce.ulozit(okenkoVAppce);
    }
}
