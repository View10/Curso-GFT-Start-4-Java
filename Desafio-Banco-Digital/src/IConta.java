public interface IConta {
    public void sacar(double a);

    public void depositar(double a);

    public void transferir(double a, Conta CD);

    public void imprimirExtrato();
}
