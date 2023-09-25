package com.meubanco.contas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    private ContaCorrente contaCorrente;

    @BeforeEach
    public void setUp() {
        contaCorrente = new ContaCorrente(12345, "Titular da Conta", 1000.0);
    }


    @Test
    public void testSaqueComSaldoSuficiente() {
        double novoSaldo = contaCorrente.sacar(500.0);
        assertEquals(500.0, novoSaldo, 0.001); // Comparação com tolerância de erro
    }

    @Test
    public void testSaqueComSaldoInsuficiente() {
        double novoSaldo = contaCorrente.sacar(1500.0);
        assertEquals(1000.0, novoSaldo, 0.001); // O saldo não deve mudar
    }

}