public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 750.50, 5);

        System.out.println("--- Antes de vender ---");
        laptop.mostrarProducto();

        System.out.println("\n--- Venta válida (2 unidades) ---");
        new Venta(2).aplicar(laptop);
        laptop.mostrarProducto();

        System.out.println("\n--- Venta inválida (10 unidades) ---");
        new Venta(10).aplicar(laptop);
        laptop.mostrarProducto();
    }
}
