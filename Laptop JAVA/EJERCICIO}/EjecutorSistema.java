import java.util.ArrayList;
import java.util.Scanner;

public class EjecutorSistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<ComputadoraPortatil> vectorLaptops = new ArrayList<>();
        ComputadoraPortatil cp1 = new ComputadoraPortatil("samsung", 0, "lcd ips", 13, 7);
        cp1.agregarPrograma(new Programa("Word", 200));
        cp1.agregarPrograma(new Programa("Excel", 150));
        
        ComputadoraPortatil cp2 = new ComputadoraPortatil("hp", 0, "oled", 15, 9);
        cp2.agregarPrograma(new Programa("Photoshop", 500));
        
        ComputadoraPortatil cp3 = new ComputadoraPortatil("lenovo", 0, "amoled", 13, 7);
        cp3.agregarPrograma(new Programa("Chrome", 300));
        cp3.agregarPrograma(new Programa("VSCode", 250));
        cp3.agregarPrograma(new Programa("Zoom", 100));
        
        vectorLaptops.add(cp1);
        vectorLaptops.add(cp2);
        vectorLaptops.add(cp3);

        System.out.println("b. Laptop con mas apps");
        ComputadoraPortatil mayor = vectorLaptops.get(0);
        for (ComputadoraPortatil l : vectorLaptops) {
            if (l.getTotalProgramas() > mayor.getTotalProgramas()) {
                mayor = l;
            }
        }
        System.out.println(mayor);

        System.out.println("\nc. Agregar app ");
        System.out.print("Ingrese modelo X: ");
        String x = teclado.nextLine();
        for (ComputadoraPortatil l : vectorLaptops) {
            if (l.getMarcaModelo().equalsIgnoreCase(x)) {
                System.out.print("Nombre nueva app: ");
                String nom = teclado.nextLine();
                System.out.print("Tamanio nueva app: ");
                int tam = Integer.parseInt(teclado.nextLine());
                l.agregarPrograma(new Programa(nom, tam));
                System.out.println("Agregada a " + l.getMarcaModelo());
            }
        }

        System.out.println("\nd. Eliminar apps por ancho Y");
        System.out.print("Ingrese ancho Y: ");
        int y = Integer.parseInt(teclado.nextLine());
        for (ComputadoraPortatil l : vectorLaptops) {
            if (l.getPanel().getDimensionAncho() == y) {
                l.borrarProgramas();
                System.out.println("Apps eliminadas de: " + l.getMarcaModelo());
            }
        }

        System.out.println("\ne. Laptop con mas apps (actualizado)");
        mayor = vectorLaptops.get(0);
        for (ComputadoraPortatil l : vectorLaptops) {
            if (l.getTotalProgramas() > mayor.getTotalProgramas()) {
                mayor = l;
            }
        }
        System.out.println(mayor);

        System.out.println("\nf. Apps ordenadas");
        for (ComputadoraPortatil l : vectorLaptops) {
            l.ordenarProgramas();
            System.out.println(l);
        }
    }
}