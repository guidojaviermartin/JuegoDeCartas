package barajas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Barajas {
    private List<Cartas> cartas;
    private List<Cartas> cartasMonton;

    public Barajas() {
        cartas = new ArrayList<>();
        cartasMonton = new ArrayList<>();
        for (String palo : new String[]{"espadas", "bastos", "oros", "copas"}) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Cartas(numero, palo));
                }
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Cartas siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        Cartas e = cartas.get(0);
        cartasMonton.add(e);
        cartas.remove(0);
        return e;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Cartas> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }
        List<Cartas> cartasDadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Cartas carta = siguienteCarta();
            if (carta != null) {
                cartasDadas.add(carta);
            }
        }
        return cartasDadas;
    }

    public void cartasMonton() {
        if (cartasMonton.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavía.");
        } else {
            for (Cartas carta : cartasMonton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
