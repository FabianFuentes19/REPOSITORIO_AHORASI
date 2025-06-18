//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage(4);

        Vehiculo moto1 = new Motocicleta("carabela", "20243ds032", false);
        Vehiculo moto2 = new Motocicleta("motochicleta", "12121", true);
        Vehiculo coche1 = new Coche("volkswagen", "xdxdxd1", 4);
        Vehiculo coche2 = new Coche("volvo", "sdsdsds", 5);


        garage.estacionar(moto1);
        garage.estacionar(coche1);
        garage.estacionar(coche2);
        garage.estacionar(moto2);

        garage.retirar("12121");
        System.out.println("Los vehiculos en el garage son: "+garage.contarVehiculos());


    }
}