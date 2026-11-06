public class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso: " + usuario.getNombre() + " (C.I. "
                    + usuario.getCedula() + ") se llevó \"" + libro.getTitulo() + "\".");
        } else {
            System.out.println("No se pudo prestar: \"" + libro.getTitulo()
                    + "\" no está disponible para " + usuario.getNombre() + ".");
        }
    }
}
