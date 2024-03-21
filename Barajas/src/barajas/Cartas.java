
package barajas;

class Cartas {
    private int numero;
    private String palo;

    public Cartas(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
