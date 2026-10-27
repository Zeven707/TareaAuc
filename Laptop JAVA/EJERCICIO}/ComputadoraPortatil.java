import java.util.ArrayList;

public class ComputadoraPortatil {
    private String marcaModelo;
    private int totalProgramas;
    private ArrayList<Programa> listaProgramas = new ArrayList<>();
    private Panel panel;

    public ComputadoraPortatil(String marcaModelo, int totalProgramas, String tecnologia, int dimensionAncho, int dimensionAlto) {
        this.marcaModelo = marcaModelo;
        this.totalProgramas = totalProgramas;
        this.panel = new Panel(tecnologia, dimensionAncho, dimensionAlto); 
    }

    public void agregarPrograma(Programa prog){
        if(listaProgramas.size() < 50){
            this.listaProgramas.add(prog);
            this.totalProgramas = listaProgramas.size();
        }
    }
    
    public void borrarProgramas(){
        this.listaProgramas.clear();
        this.totalProgramas = 0;
    }
    
    public void ordenarProgramas(){
        listaProgramas.sort((p1, p2) -> {
            if(p2.getPesoMb() != p1.getPesoMb()){
                return p2.getPesoMb() - p1.getPesoMb();
            } else {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
    }

    public int getTotalProgramas(){ return listaProgramas.size(); }
    public String getMarcaModelo(){ return marcaModelo; }
    public Panel getPanel(){ return panel; }
    public ArrayList<Programa> getListaProgramas(){ return listaProgramas; }

    @Override
    public String toString() {
        return "ComputadoraPortatil{marcaModelo=" + marcaModelo + ", totalProgramas=" + totalProgramas + ", panel=" + panel + ", listaProgramas=" + listaProgramas + '}';
    }
}