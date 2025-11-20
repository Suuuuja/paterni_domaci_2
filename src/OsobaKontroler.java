/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Korisnik
 */
public class OsobaKontroler {
    private GlavnaForma view;

    public OsobaKontroler(GlavnaForma view) {
        this.view = view;
        poveziListenere();
    }

    private void poveziListenere() {
        view.getBtnSacuvajOsobu().addActionListener(e -> sacuvajOsobu());
    }

    private void sacuvajOsobu() {
        boolean validno = true;

        // Ime
        String ime = (String) view.getPanelIme().vratiVrednost();
        if (ime == null || ime.trim().isEmpty()) {
            view.getPanelIme().prikaziGresku("Polje je obavezno");
            validno = false;
        } else {
            view.getPanelIme().ocistiGresku();
        }

        // Prezime
        String prezime = (String) view.getPanelPrezime().vratiVrednost();
        if (prezime == null || prezime.trim().isEmpty()) {
            view.getPanelPrezime().prikaziGresku("Polje je obavezno");
            validno = false;
        } else {
            view.getPanelPrezime().ocistiGresku();
        }

        // Pol
        Object polObj = view.getPanelPol().vratiVrednost();
        String pol = polObj == null ? "" : polObj.toString();
        if (pol.trim().isEmpty()) {
            view.getPanelPol().prikaziGresku("Pol je obavezan");
            validno = false;
            } else if ("oba".equals(polObj)) {
        // oba selektovana
        view.getPanelPol().prikaziGresku("Možete selektovati samo jedan pol");
        validno = false;
    } else {
            view.getPanelPol().ocistiGresku();
        }

        // Mesto
        Object mestoObj = view.getPanelMesto().vratiVrednost();
        String mesto = mestoObj == null ? "" : mestoObj.toString();
        if (mesto.trim().isEmpty()) {
            view.getPanelMesto().prikaziGresku("Mesto je obavezno");
            validno = false;
        } else {
            view.getPanelMesto().ocistiGresku();
        }

        if (!validno) {
            return;
        }

        Osoba osoba = new Osoba(ime, prezime, pol, mesto);

        javax.swing.JOptionPane.showMessageDialog(
                view,
                "Uspešno sačuvana osoba:\n" +
                        "Ime: " + osoba.getIme() + "\n" +
                        "Prezime: " + osoba.getPrezime() + "\n" +
                        "Pol: " + osoba.getPol() + "\n" +
                        "Mesto: " + osoba.getMesto(),
                "Sačuvano",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }
}
