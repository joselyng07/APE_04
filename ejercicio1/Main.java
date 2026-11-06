public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Miguel de Cervantes", "Española");

        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("Don Quijote de la Mancha", 1605, autor2);

        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
    }
}
