public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(30);

        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        cc.imprimirInfosComuns();
        poupanca.imprimirExtrato();
        poupanca.imprimirInfosComuns();

    }
}