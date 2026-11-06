public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Retira de esta cuenta y deposita en destino solo si hay fondos.
    public void transferir(Cuenta destino, double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            destino.saldo += monto;
            System.out.println("Transferencia exitosa de $" + String.format("%.2f", monto)
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de " + titular);
        }
    }

    public void mostrar() {
        System.out.println(titular + " -> saldo: $" + String.format("%.2f", saldo));
    }
}
