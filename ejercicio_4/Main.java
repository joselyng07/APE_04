public class Main {
    public static void main(String[] args) {
        Cuenta cuentaAna = new Cuenta("Ana", 500.00);
        Cuenta cuentaLuis = new Cuenta("Luis", 200.00);

        System.out.println("--- Saldos iniciales ---");
        cuentaAna.mostrar();
        cuentaLuis.mostrar();

        System.out.println("\n--- Transferencia válida ---");
        cuentaAna.transferir(cuentaLuis, 150.00);
        cuentaAna.mostrar();
        cuentaLuis.mostrar();

        System.out.println("\n--- Transferencia que falla ---");
        cuentaAna.transferir(cuentaLuis, 1000.00);
        cuentaAna.mostrar();
        cuentaLuis.mostrar();
    }
}
