public class Panel {
    private String tecnologia;
    private int dimensionAncho;
    private int dimensionAlto;

    public Panel(String tecnologia, int dimensionAncho, int dimensionAlto) {
        this.tecnologia = tecnologia;
        this.dimensionAncho = dimensionAncho;
        this.dimensionAlto = dimensionAlto;
    }
    public Panel() {
        this.tecnologia = "amoled";
        this.dimensionAncho = 7;
        this.dimensionAlto = 6;
    }

    public int getDimensionAncho() { return dimensionAncho; }

    @Override
    public String toString() {
        return "Panel{tecnologia=" + tecnologia + ", dimensionAncho=" + dimensionAncho + ", dimensionAlto=" + dimensionAlto + '}';
    }
}