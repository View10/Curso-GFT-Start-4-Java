public class Conta_Corrente extends Conta{

    public Conta_Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        ImprimirInfosComuns();
    }
}
