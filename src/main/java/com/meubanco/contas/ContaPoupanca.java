package com.meubanco.contas;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        return 0;
    }
}
