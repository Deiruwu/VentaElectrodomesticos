package VentaElectrodomesticos;
import java.util.HashMap;
public class Electrodomesticos {
    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    private static final int PRECIO_BASE = 100;
    private static final String COLOR = "blanco";
    private static final char CONSUMO_ENERGETICO = 'F';
    private static final int PESO = 5;

    public Electrodomesticos(){
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
    }

    public Electrodomesticos(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
    }

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO;
        }
    }

    private String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String id : colores) {
            if (color.equals(id))
            return id;
        }
        return COLOR;
    }

    public int calcularPrecioPorPeso(int peso) {
        if (peso >= 0 && peso <= 19) {
            return 10;
        } else if (peso >= 20 && peso <= 49) {
            return 50;
        } else if (peso >= 50 && peso <= 79) {
            return 80;
        } else {
            return 100;
        }
    }

    public int precioFinal(char consumoEnergetico, int peso) {
        HashMap<Character, Integer> preciosPorConsumo = new HashMap<Character, Integer>();
        preciosPorConsumo.put('A', 100);
        preciosPorConsumo.put('B', 80);
        preciosPorConsumo.put('C', 60);
        preciosPorConsumo.put('D', 50);
        preciosPorConsumo.put('E', 30);
        preciosPorConsumo.put('F', 10);
        return this.precioBase + preciosPorConsumo.get(consumoEnergetico) + calcularPrecioPorPeso(peso);
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }
}


