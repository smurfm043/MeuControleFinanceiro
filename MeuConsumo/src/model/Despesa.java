package model;

import java.time.LocalDate;

// Representa uma SAÍDA de dinheiro
// HERDA de Movimentacao
public class Despesa extends Movimentacao {

    public Despesa(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        super(id, descricao, valor, data, categoria);
    }

    // POLIMORFISMO:
    // Despesa subtrai do saldo
    @Override
    public double calcularImpacto() {
        return -getValor();
    }
}