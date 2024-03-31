package VentaElectrodomesticos;
import java.util.ArrayList;

public class Ejecutar {
    public static void main(String[] args) {
                ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<>();
                electrodomesticos.add(new Electrodomesticos());
                electrodomesticos.add(new Electrodomesticos(50, 10));
                electrodomesticos.add(new Electrodomesticos(200, "Verde", 'C', 60));
                electrodomesticos.add(new Electrodomesticos(600, "gris", 'D', 20));
                electrodomesticos.add(new Lavadora(150, 30));
                electrodomesticos.add(new Lavadora(300, "blanco", 'Z', 40, 40));
                electrodomesticos.add(new Lavadora(400, "verde", 'A', 100, 15));
                electrodomesticos.add(new Television(250, 70));
                electrodomesticos.add(new Television(500, "negro", 'E', 80, 42, false));
                electrodomesticos.add(new Television(600, "naranja", 'A', 60, 30, true));

        for (int i = 0; i < electrodomesticos.size(); i++) {
            System.out.println("Precio del objeto " + i + ": " + electrodomesticos.get(i).precioFinal(electrodomesticos.get(i).getConsumoEnergetico(), electrodomesticos.get(i).getPeso()));
        }
    }
}