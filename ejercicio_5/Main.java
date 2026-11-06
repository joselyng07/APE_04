public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("María Pérez", "1712345678");
        Usuario u2 = new Usuario("Carlos Gómez", "1798765432");
        Libro libro = new Libro("Introducción a Java");

        // Dos usuarios intentan pedir el mismo libro
        new Prestamo(u1, libro).registrar();
        new Prestamo(u2, libro).registrar();

        System.out.println("\nLa usuaria devuelve el libro...");
        libro.devolver();

        new Prestamo(u2, libro).registrar();
    }
}
