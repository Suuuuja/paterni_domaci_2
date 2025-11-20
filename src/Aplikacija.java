/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Korisnik
 */
public class Aplikacija {
    public static void main(String[] args) {
          
        KonfiguracijaPanela model = new KonfiguracijaPanela();

        KonfiguracijaPanelaForma view = new KonfiguracijaPanelaForma();

        Kontroler controller = Kontroler.getInstanca();

        controller.setModel(model);
        controller.setView(view);
        view.setVisible(true);
    }
}
