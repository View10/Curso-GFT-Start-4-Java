public abstract class Conta implements IConta{
    private  static final int AGENCIA = 0;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int num;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.num = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.num));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void sacar(double a) {
        saldo -= a;
    }

    @Override
    public void depositar(double a) {
        saldo += a;
    }

    @Override
    public void transferir(double a, Conta CD) {
        this.sacar(a);
        CD.depositar(a);
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

}
