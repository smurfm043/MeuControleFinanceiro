package model;

import java.time.LocalDate;

// Representa uma ENTRADA de dinheiro
// HERDA de Movimentacao
public class Receita extends Movimentacao {

    public Receita(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        super(id, descricao, valor, data, categoria);
    }

    // POLIMORFISMO:
    // Receita soma no saldo
    @Override
    public double calcularImpacto() {
        return getValor();
    }
}