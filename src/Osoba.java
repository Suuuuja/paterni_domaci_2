/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Korisnik
 */
public class Osoba {
    private String ime;
    private String prezime;
    private String pol;
    private String mesto;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, String pol, String mesto) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.mesto = mesto;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
    
}
