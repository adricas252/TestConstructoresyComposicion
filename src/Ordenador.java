public class Ordenador {

    private String marca, modelo;
    private Procesador procesador;

    public Ordenador(String marca, String modelo, int nucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = new Procesador(nucleos);
    }

    public Ordenador(String marca, String modelo) {
        this(marca, modelo, 4);
    }

    public Ordenador() {
        this("Lenovo", "V15 G4", 0);
    }

    @Override
    public String toString() {
        return "Ordenador [marca = " + marca + ", modelo = " + modelo + ", nucleos = " + procesador.getNucleos() + "]";
    }
}
