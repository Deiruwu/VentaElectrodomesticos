package VentaElectrodomesticos;

public class Lavadora extends Electrodomesticos{
    final int CARGA=5;
    int carga;

    public int getCarga() {
        return carga;
    }

    public int precioFinal(char consumoEnergetico, int peso){
        return (carga < 30) ? super.precioFinal(consumoEnergetico, peso) : super.precioFinal(consumoEnergetico, peso) + 50;
    }

    public Lavadora() {
        super();
        this.carga = CARGA;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
}
