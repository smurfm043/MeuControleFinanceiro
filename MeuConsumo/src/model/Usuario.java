package model;

import java.util.ArrayList;

public class Usuario {

    private String cpf;
    private String nome;
    private String email;
    private String profissao;

    private String mesAtual;
    private double metaEconomia;

    private ArrayList<Receita> receitas;
    private ArrayList<Despesa> despesas;

    // Construtor (SEM META)
    public Usuario(String cpf, String nome, String email, String profissao) {

        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;

        this.mesAtual = "";
        this.metaEconomia = 0;

        this.receitas = new ArrayList<>();
        this.despesas = new ArrayList<>();
    }

    public void definirMes(String mes) {

        // evita reset desnecessário se for o mesmo mês
        if (this.mesAtual.equalsIgnoreCase(mes)) {
            return;
        }

        this.mesAtual = mes;

        // reset mensal
        this.receitas.clear();
        this.despesas.clear();
        this.metaEconomia = 0;
    }

    public boolean temMesDefinido() {
        return !mesAtual.isEmpty();
    }

   
    public boolean temMetaDefinida() {
        return metaEconomia > 0;
    }

   
    public void definirMeta(double meta) {
        if (meta <= 0) {
            System.out.println("Meta inválida. Deve ser maior que 0.");
            return;
        }
        this.metaEconomia = meta;
    }

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public double calcularSaldo() {

        double totalReceitas = 0;
        double totalDespesas = 0;

        for (Receita r : receitas) {
            totalReceitas += r.getValor();
        }

        for (Despesa d : despesas) {
            totalDespesas += d.getValor();
        }

        return totalReceitas - totalDespesas;
    }

    public boolean metaUltrapassada() {

        if (!temMetaDefinida()) {
            return false;
        }

        double totalDespesas = 0;

        for (Despesa d : despesas) {
            totalDespesas += d.getValor();
        }

        return totalDespesas > metaEconomia;
    }

    public String getCpf() {
        return cpf;
    }

    public double getMetaEconomia() {
        return metaEconomia;
    }

    public String getMesAtual() {
        return mesAtual;
    }

    @Override
    public String toString() {

        return "CPF: " + cpf +
               " | Nome: " + nome +
               " | Profissão: " + profissao +
               " | Mês: " + (mesAtual.isEmpty() ? "Não definido" : mesAtual) +
               " | Saldo: " + calcularSaldo() +
               " | Meta: " + metaEconomia;
    }
}