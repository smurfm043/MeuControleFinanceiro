package model;

// Classe que representa uma categoria de movimentação financeira
// Ex: Alimentação, Salário, Transporte
public class Categoria {

    private int id;
    private String nome;
    private String tipo; // "Receita" ou "Despesa"
    private double limiteMensal;

    // Construtor completo
    public Categoria(int id, String nome, String tipo, double limiteMensal) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.limiteMensal = limiteMensal;
    }

    // Getters e Setters (ENCAPSULAMENTO)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        // Pequena validação (diferencial)
        if (!tipo.equalsIgnoreCase("Receita") && !tipo.equalsIgnoreCase("Despesa")) {
            System.out.println("Tipo inválido! Use Receita ou Despesa.");
            return;
        }
        this.tipo = tipo;
    }

    public double getLimiteMensal() {
        return limiteMensal;
    }

    public void setLimiteMensal(double limiteMensal) {
        if (limiteMensal < 0) {
            System.out.println("Limite não pode ser negativo.");
            return;
        }
        this.limiteMensal = limiteMensal;
    }

    // Sobrescrita (POLIMORFISMO)
    @Override
    public String toString() {
        return "Categoria: " + nome + " | Tipo: " + tipo + " | Limite: R$" + limiteMensal;
    }
}