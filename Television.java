package VentaElectrodomesticos;

public class Television extends Electrodomesticos{
    int resolucion;
    boolean sintonizadorTDT;
    final boolean SINTONIZADOR_TDT = false;
    final int RESOLUCION  = 20;

    public Television() {
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }
    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADOR_TDT;
    }
    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion,boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    @Override
    public int precioFinal(char consumoEnergetico, int peso) {
    int precio = super.precioFinal(consumoEnergetico, peso);
    precio += (resolucion > 40) ? precio * 0.3 : 0;
    precio += sintonizadorTDT ? 50 : 0;
    return precio;
    }

    
    
}
