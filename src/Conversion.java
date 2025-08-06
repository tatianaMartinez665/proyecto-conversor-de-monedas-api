public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double monto;
    private double resultado;

    public Conversion(String monedaOrigen, String monedaDestino, double monto, double resultado) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.monto = monto;
        this.resultado = resultado;
    }

    public Conversion(ConversionApi otro){
        this.monedaOrigen=otro.base_code();
        this.monedaDestino=otro.target_code();
        this.monto=otro.conversion_rate();
        this.resultado=Double.valueOf(otro.result());
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Conversion: " +
                "monedaOrigen='" + monedaOrigen  +
                ", monedaDestino='" + monedaDestino  +
                ", monto=" + monto +
                ", resultado=" + resultado +
                '\n';
    }
}
