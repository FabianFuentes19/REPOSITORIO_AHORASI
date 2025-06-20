//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Inventario invetario = new Inventario(3);

    Producto producto1 = new Producto("CR7", "EL BICHOOOO", 2);
    Producto producto2 = new Producto("12G", "CHETOS", 4);
    Producto producto3 = new Producto("15M", "ESPONJABON", 5);
    Producto producto4 = new Producto("20F", "UN COCON", 3);

    invetario.agregarProducto(producto1);
    invetario.agregarProducto(producto2);
    invetario.agregarProducto(producto3);
    invetario.agregarProducto(producto4);

    System.out.println("Inventario:" +invetario.totalItems());

    System.out.println("Buscar 12G: " + (invetario.buscar("12G")));
    System.out.println("Buscar 23P: " + (invetario.buscar("23P")));

    System.out.println("Eliminar CR7: " + (invetario.eliminarProducto("CR7")));
    System.out.println("Inventario:" +invetario.totalItems());

    System.out.println("Agregar CR7: ");
    invetario.agregarProducto(producto1);
    System.out.println("Inventario:" +invetario.totalItems());

    }
}