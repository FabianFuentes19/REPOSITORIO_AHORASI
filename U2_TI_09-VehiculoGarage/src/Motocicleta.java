public class Motocicleta extends Vehiculo {

    private boolean tieneCaja;

    public Motocicleta(String marca, String placa, boolean tieneCaja) {
        super(marca, placa);
        this.tieneCaja = tieneCaja;

    }
    public boolean tieneCaja() {
        return tieneCaja;
    }
    public void setTieneCaja(boolean tieneCaja) {
        this.tieneCaja = tieneCaja;
    }
}
