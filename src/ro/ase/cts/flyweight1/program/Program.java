package ro.ase.cts.flyweight1.program;

import ro.ase.cts.flyweight1.clase.FlyweightFactory;
import ro.ase.cts.flyweight1.clase.Rezervare;

public class Program {
    public static void main(String[] args){
         Rezervare r1 = new Rezervare(5,3,17);
        Rezervare r2 = new Rezervare(3,2,17);
        Rezervare r3 = new Rezervare(4,3,17);

        FlyweightFactory factory = new FlyweightFactory();

        factory.getClient("076422111").printeazaRezervare(r1);



    }
}
