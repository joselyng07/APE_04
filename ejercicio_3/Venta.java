public class Venta {
    private int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Recibe un Producto como parámetro (objeto como parámetro)
    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = producto.getPrecio() * cantidad;
            System.out.println("Venta realizada: " + cantidad + " x " + producto.getNombre());
            System.out.println("Total a pagar: $" + String.format("%.2f", total));
        }
    }
}
