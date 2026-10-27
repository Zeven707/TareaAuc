public class Programa {
    private String titulo;
    private int pesoMb;

    public Programa(String titulo, int pesoMb) {
        this.titulo = titulo;
        this.pesoMb = pesoMb;
    }
    public Programa() {}

    public String getTitulo() { return titulo; }
    public int getPesoMb() { return pesoMb; }

    @Override
    public String toString() {
        return "Programa{titulo=" + titulo + ", pesoMb=" + pesoMb + '}';
    }
}