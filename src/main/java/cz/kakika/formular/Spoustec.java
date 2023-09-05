package cz.kakika.formular;

public class Spoustec {

    public static void main(String[] args) {                     //vstupní bod aplikace
        System.out.println("Hello world :-)");

        DataHolder ulozenka = new DataHolder();                  // mám třídu "DataHolder" a vytvořila jsem si instanci třídy "uloženka"
        Gui okenko = new Gui();
        Application appka = new Application (ulozenka, okenko);  // mám třídu "Application", instance "appka" a ta chce dva argumenty konstruktoru
        appka.run();


    }
}
