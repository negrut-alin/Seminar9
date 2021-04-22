package ro.ase.cts.flyweight1.clase;

public class Rezervare {
    int nrMasa;
    int nrPersoane;
    int oraRezervare;

    public Rezervare(int nrMasa, int nrPersoane, int oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare=" + oraRezervare +
                '}';
    }
}
