package main;

import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Main {
    public static void main(String [] args){ 
        Cliente pedro = new Cliente("Pedro");

        ContaPoupanca cp = new ContaPoupanca(pedro);
        ContaCorrente cc = new ContaCorrente(pedro);

        cp.depositar(400);
        cc.depositar(200);
        cp.transferir(100, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
