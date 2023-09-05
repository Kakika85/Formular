package cz.kakika.formular;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui {
    private Container c;
    private JLabel nazev;
    private JLabel jmeno;
    private JTextField textJmeno;
    public JTextField getTextJmeno() {
        return textJmeno;
    }
    private JLabel prijmeni;
    private JTextField textPrijmeni;

    public JTextField getTextPrijmeni() {
        return textPrijmeni;
    }
    private JLabel datumNarozeni;

    private JTextField textDatumNarozeni;
    public JTextField getTextDatumNarozeni() {
        return textDatumNarozeni;
    }

    private JButton odeslat;

    private JButton zrusit;


    public void createOkenko(Application appkaArgument) {
        JFrame okno = new JFrame("FORMULÁŘ");
        okno.setSize(700,800);
        okno.setLocationRelativeTo(null);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setResizable(false);

        c = okno.getContentPane();
        c.setLayout(null);

        nazev = new JLabel("FORMULÁŘ");
        nazev.setFont(new Font("Arial", Font.BOLD, 36));
        nazev.setBackground(new Color(220, 220, 220));
        nazev.setOpaque(true);
        nazev.setSize(206, 45);
        nazev.setLocation(230,50);
        c.add(nazev);

        jmeno = new JLabel("Jméno:");
        jmeno.setFont(new Font("Arial", Font.PLAIN, 20));
        jmeno.setBackground(new Color(220, 220, 220));
        jmeno.setOpaque(true);
        jmeno.setSize(150, 25);
        jmeno.setLocation(20,145);
        c.add(jmeno);

        textJmeno = new JTextField();
        textJmeno.setFont(new Font("Arial", Font.PLAIN, 15));
        textJmeno.setBackground(new Color(220, 220, 220));
        textJmeno.setOpaque(true);
        textJmeno.setSize(150, 25);
        textJmeno.setLocation(200, 145);
        c.add(textJmeno);

        prijmeni = new JLabel("Přijmení:");
        prijmeni.setFont(new Font("Arial", Font.PLAIN, 20));
        prijmeni.setBackground(new Color(220, 220, 220));
        prijmeni.setOpaque(true);
        prijmeni.setSize(150, 25);
        prijmeni.setLocation(20,190);
        c.add(prijmeni);

        textPrijmeni = new JTextField();
        textPrijmeni.setFont(new Font("Arial", Font.PLAIN, 15));
        textPrijmeni.setBackground(new Color(220, 220, 220));
        textPrijmeni.setOpaque(true);
        textPrijmeni.setSize(150, 25);
        textPrijmeni.setLocation(200,190);
        c.add(textPrijmeni);

        datumNarozeni = new JLabel("Datum narození");
        datumNarozeni.setFont(new Font("Arial", Font.PLAIN,20));
        datumNarozeni.setBackground((new Color(220, 220 ,220)));
        datumNarozeni.setOpaque(true);
        datumNarozeni.setSize(150,25);
        datumNarozeni.setLocation(20, 235);
        c.add(datumNarozeni);

        textDatumNarozeni = new JTextField();
        textDatumNarozeni.setFont(new Font("Arial", Font.PLAIN, 15));
        textDatumNarozeni.setBackground(new Color(220, 220, 220));
        textDatumNarozeni.setOpaque(true);
        textDatumNarozeni.setSize(150, 25);
        textDatumNarozeni.setLocation(200,235);
        c.add(textDatumNarozeni);

        odeslat = new JButton("ODESLAT");
        odeslat.setFont(new Font("Arial", Font.PLAIN, 25));
        odeslat.setSize(250,30);
        //odeslat.setLocation(380, 700);
        odeslat.setLocation(okno.getWidth()-50-odeslat.getWidth()-20, 700);
        odeslat.addActionListener(this::akceOdeslat);
        odeslat.addActionListener(appkaArgument::akceOdeslat);
        c.add(odeslat);

        zrusit = new JButton("ZRUŠIT");
        zrusit.setFont(new Font("Arial", Font.PLAIN, 25));
        zrusit.setSize(250, 30);
        zrusit.setLocation(50, 700);
        zrusit.addActionListener(this::akceZrusit);
        c.add(zrusit);


        okno.setVisible(true);
    }

    private void akceZrusit(ActionEvent e) {
        System.out.println("akce zrusit");

        textJmeno.setText("");
        textPrijmeni.setText("");
        textDatumNarozeni.setText("");
    }

    private void akceOdeslat(ActionEvent e) {
        System.out.println("Akce: " + e.getActionCommand());

        if(textJmeno.getText().isBlank()) {
            System.out.println("Vyplňte jméno s použitím znaků abecedy");
            return;
        }

        if(textPrijmeni.getText().isBlank()) {
            System.out.println("Vyplňte příjmení s použitím znaků abecedy");
            return;
        }

        if(textDatumNarozeni.getText().isBlank()) {
            System.out.println("Vyplňte datum narození s použitím numerologických znaků a tečky");
        }

        //System.out.println("Jméno: " + textJmeno.getText());
        //System.out.println("Příjmení: " + textPrijmeni.getText());
    }
}
