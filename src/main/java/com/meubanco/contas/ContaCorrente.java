package com.meubanco.contas;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double saldoAnterior = getSaldo();
        double saldo = saldoAnterior;
        if (valor <= saldo) {
            // Permite saque se o saldo for suficiente
            double novoSaldo = saldo -= valor;
            setSaldo(novoSaldo);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Novo saldo: " + novoSaldo);
        } else {
            System.out.println("Saldo atual: " + saldoAnterior);
            System.out.println("Não é possível sacar " + valor);
            System.out.println("Insuficiente para o saque.");
        }
        return saldo;
    }
}
