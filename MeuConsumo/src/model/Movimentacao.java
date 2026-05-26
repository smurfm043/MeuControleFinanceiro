package model;

import java.time.LocalDate;

// Classe ABSTRATA (HERANÇA)
// Representa qualquer movimentação financeira (receita ou despesa)
public abstract class Movimentacao {

    private int id;
    private String descricao;
    private double valor;
    private LocalDate data;
    private Categoria categoria;

    public Movimentacao(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    // POLIMORFISMO:
    // Cada classe filha implementa de forma diferente
    public abstract double calcularImpacto();

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return descricao + " - R$" + valor + " (" + data + ")";
    }
}