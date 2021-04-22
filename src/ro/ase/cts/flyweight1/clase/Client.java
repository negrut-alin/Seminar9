package ro.ase.cts.flyweight1.clase;

public class Client implements Flyweight {
    String Nume;
    String NrTelefon;
    String Email;

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
           System.out.println(this.toString() + rezervare.toString());
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nume='" + Nume + '\'' +
                ", NrTelefon='" + NrTelefon + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    public Client(String nume, String nrTelefon, String email) {
        Nume = nume;
        NrTelefon = nrTelefon;
        Email = email;
    }
}
