package cz.kakika.formular;

public class DataHolder {

    public void ulozit(Gui okenkoVAppce) {
        System.out.println("Teď ukládám: ");

        String jmeno = okenkoVAppce.getTextJmeno().getText();
        System.out.println("Jméno: " + jmeno);

        String prijmeni = okenkoVAppce.getTextPrijmeni().getText();
        System.out.println("Příjmení: " + prijmeni);

        String datumNarozeni = okenkoVAppce.getTextDatumNarozeni().getText();
        System.out.println("Datum narození: " + datumNarozeni);
    }

}



//todo přes getter vytáhnout data z gui (okenkoVAppce) do dataholder a uložit je zde
//todo v gui se budou muset udělat vlastní gettery ?! :o