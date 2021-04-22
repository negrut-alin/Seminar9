package ro.ase.cts.strategy.clase;

public class Portofel implements Strategy{

    private float SumaDisponibila;

    public Portofel(float sumaDisponibila) {
        SumaDisponibila = sumaDisponibila;
    }

    @Override
    public void realizeazaPlata(float Suma) {
        if(SumaDisponibila >= Suma) {
            System.out.println("Tranzactia a  fost efectuata cash pentru suma de  " +  Suma  + " lei !");
            SumaDisponibila -= Suma;
            return;
        }
        System.out.println("Fonduri Insuficiente !");

    }
}
