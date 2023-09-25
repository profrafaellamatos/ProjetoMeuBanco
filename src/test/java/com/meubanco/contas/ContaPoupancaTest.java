package com.meubanco.contas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaPoupancaTest {
    private ContaPoupanca contaPoupanca;

    @BeforeEach
    public void setUp() {
        contaPoupanca = new ContaPoupanca(12345, "Titular da Conta", 1000.0);
    }

    @Disabled
    public void testSaqueComSaldoSuficiente() {
        double novoSaldo = contaPoupanca.sacar(500.0);
        assertEquals(475.0, novoSaldo, 0.001); // Comparação com tolerância de erro
    }

    @Disabled
    public void testSaqueComSaldoInsuficiente() {
        double novoSaldo = contaPoupanca.sacar(1500.0);
        assertEquals(1000.0, novoSaldo, 0.001); // O saldo não deve mudar
    }
}
