/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Korisnik
 */
public class Kontroler {
    private static Kontroler instanca;
    private KonfiguracijaPanela model;
    private KonfiguracijaPanelaForma view;
    private Kontroler() {
       
    }

    public static Kontroler getInstanca() {
        if(instanca==null)
            instanca=new Kontroler();
        return instanca;
    }

    public KonfiguracijaPanela getModel() {
        return model;
    }

    public void setModel(KonfiguracijaPanela model) {
        this.model = model;
    }

    public KonfiguracijaPanelaForma getView() {
        return view;
    }

    public void setView(KonfiguracijaPanelaForma view) {
        this.view = view;
        poveziListenere();
    }

    private void poveziListenere() {
         view.getjButton1().addActionListener(e -> sacuvajKonfiguraciju());
    }

    private void sacuvajKonfiguraciju() {
        if (model == null) {
            model = new KonfiguracijaPanela();
        }

        String imeTxt = view.getjTextField1().getText();
        String prezimeTxt = view.getjTextField2().getText();
        String polTxt = view.getComboPol().getSelectedItem().toString();
        String mestoTxt = view.getComboMesto().getSelectedItem().toString();

        model.setTipIme(pretvoriUTip(imeTxt));
        model.setTipPrezime(pretvoriUTip(prezimeTxt));
        model.setTipPol(pretvoriUTip(polTxt));
        model.setTipMesto(pretvoriUTip(mestoTxt));

        System.out.println("Model podaci:");
        System.out.println(model.getTipIme());
        System.out.println(model.getTipPrezime());
        System.out.println(model.getTipPol());
        System.out.println(model.getTipMesto());
        GlavnaForma forma = new GlavnaForma(model);
    forma.setVisible(true);
    
OsobaKontroler osobaController = new OsobaKontroler(forma);
    }

    private TipUnosa pretvoriUTip(String tekst) {
          switch (tekst) {
            case "Tekstualni unos":
                return TipUnosa.TEKSTUALNI_UNOS;
            case "Padajuca lista":
                return TipUnosa.PADAJUCA_LISTA;
            case "Radio dugmad":
                return TipUnosa.RADIO_DUGMAD;
            default:
                return TipUnosa.TEKSTUALNI_UNOS;
        }
    }

    
    
}
