package Cliente;

import Director.Barista;
import Producto.Bebida;

public class Main {
    public static void main(String[] args) throws Exception {
        Barista barista = new Barista();
        
        System.out.println("=== MENÚ CAFETERÍA STARBIKS ===");
        System.out.println("1. Preparar ChocoTin");
        System.out.println("2. Preparar Frezzberry");
        System.out.println("3. Preparar Bananini");
        System.out.println("===============================");

        // Simulación de preparación de bebidas
        System.out.println("\n--- Preparando ChocoTin ---");
        Bebida chocoTin = barista.prepararChocoTin("entera");
        chocoTin.mostrarResumen();

        System.out.println("--- Preparando Frezzberry ---");
        Bebida frezzberry = barista.prepararFrezzberry();
        frezzberry.mostrarResumen();

        System.out.println("--- Preparando Bananini ---");
        Bebida bananini = barista.prepararBananini("almendras");
        bananini.mostrarResumen();
    }
}
