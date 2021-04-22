package ro.ase.cts.flyweight1.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Flyweight> clienti = new HashMap<>();

    public Flyweight getClient(String nrTelefon) {
        if (!clienti.containsKey(nrTelefon)) {
            clienti.put(nrTelefon, new Client("Ion", nrTelefon, "ion@gmail.com"));
        }

        return clienti.get(nrTelefon);
    }
}
