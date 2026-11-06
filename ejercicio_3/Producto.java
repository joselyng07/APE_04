public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Solo actúa si hay stock suficiente. Devuelve true si se pudo reducir.
    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + String.format("%.2f", precio)
                + " | Stock: " + stock);
    }
}
