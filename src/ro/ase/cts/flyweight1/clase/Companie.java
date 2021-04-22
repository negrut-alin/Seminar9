package ro.ase.cts.flyweight1.clase;

public class Companie implements Flyweight {
    private String numeCompanie;
    private String nrTelefon;
    private String CUI;


    public Companie(String numeCompanie, String nrTelefon, String CUI) {
        this.numeCompanie = numeCompanie;
        this.nrTelefon = nrTelefon;
        this.CUI = CUI;
    }

    @Override
    public String toString() {
        return "Companie{" +
                "numeCompanie='" + numeCompanie + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", CUI='" + CUI + '\'' +
                '}';
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        toString();
    }
}
