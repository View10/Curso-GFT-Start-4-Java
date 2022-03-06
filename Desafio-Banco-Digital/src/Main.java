public class Main {
    public static void main(String[] args) {
        Cliente Kevin = new Cliente();
        Kevin.setNome("Kevin");

        Conta cc = new Conta_Corrente(Kevin);
        Conta cp = new Conta_Poupanca(Kevin);
        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
