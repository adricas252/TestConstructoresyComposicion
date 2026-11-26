public class Procesador {

    private int nucleos;

    public Procesador(int nucleos) {
        if (nucleos <= 0) {
            throw new IllegalArgumentException("El número de núcleos debe ser mayor que 0.");
        }

        this.nucleos = nucleos;
    }

    public int getNucleos() {
        return nucleos;
    }
}
