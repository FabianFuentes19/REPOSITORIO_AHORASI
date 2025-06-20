public class Inventario {

    private Producto[]stock;

    public Inventario(int tamano) {
        stock = new Producto[tamano];
    }

    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = p;
            return true;
            }
        }
        return false;
    }
    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].getCodigo().equals(codigo)) {
                stock[i] = null;
                return true;
            }

        }
        return false;
    }
    public Producto buscar(String codigo) {
       for(Producto p : stock) {
           if(p.getCodigo().equals(codigo)) {
               return p;
           }
       }
       return null;
    }
    public int totalItems(){
        int total=0;
        for(Producto p : stock) {
            if(p != null) {
                total+= p.getCantidad();
            }
        }
        return total;
    }
}
