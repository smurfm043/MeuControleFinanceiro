package controller;

import java.util.Scanner;

public class SistemaController {

    Scanner scanner = new Scanner(System.in);

    String cpf = null;
    String nome = null;
    String email = null;
    String profissao = null;

    Double salario = 0.0;
    Integer mesSelecionado = null;
    Double receita = null;
    Double metaEconomia = null;

    double totalDespesas = 0;

    public void iniciar() {

        int opcao;

        while (true) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Selecionar mês");
            System.out.println("3 - Adicionar receita extra");
            System.out.println("4 - Registrar despesa");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");

            if (!scanner.hasNextLine()) {
                break;
            }

            String input = scanner.nextLine();

            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (opcao) {

                case 1:
                    cadastrarUsuario();
                    break;

                case 2:
                    selecionarMes();
                    break;

                case 3:
                    adicionarReceita();
                    break;

                case 4:
                    registrarDespesa();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void cadastrarUsuario() {

        System.out.print("Digite o CPF: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        cpf = scanner.nextLine();

        if (cpf.length() != 11) {
            System.out.println("CPF inválido.");
            cpf = null;
            return;
        }

        System.out.print("Digite o Nome: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        nome = scanner.nextLine();

        System.out.print("Digite o Email: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        email = scanner.nextLine();

        System.out.println("Você tem profissão?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("Escolha: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        String escolhaProf = scanner.nextLine();

        if (escolhaProf.equals("1")) {

            System.out.print("Digite a profissão: ");

            if (!scanner.hasNextLine()) {
                return;
            }

            profissao = scanner.nextLine();

            System.out.print("Digite o salário: ");

            if (!scanner.hasNextLine()) {
                return;
            }

            try {

                salario = Double.parseDouble(scanner.nextLine());

                if (salario < 0) {
                    salario = 0.0;
                }

            } catch (NumberFormatException e) {

                System.out.println("Valor inválido.");
                salario = 0.0;
            }

        } else if (escolhaProf.equals("2")) {

            profissao = null;
            salario = 0.0;

        } else {

            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Usuário cadastrado com sucesso!");
    }

    private void selecionarMes() {

        if (cpf == null) {

            System.out.println("Cadastre um usuário primeiro!");
            return;
        }

        System.out.print("Digite o mês (1-12): ");

        if (!scanner.hasNextLine()) {
            return;
        }

        try {

            mesSelecionado = Integer.parseInt(scanner.nextLine());

            if (mesSelecionado < 1 || mesSelecionado > 12) {

                System.out.println("Mês inválido.");
                mesSelecionado = null;
                return;
            }

            receita = salario;
            metaEconomia = null;
            totalDespesas = 0;

            System.out.println("Mês selecionado: " + mesSelecionado);
            System.out.println("Receita inicial (salário): " + receita);

        } catch (NumberFormatException e) {

            System.out.println("Mês inválido.");
        }
    }

    private void adicionarReceita() {

        if (cpf == null || mesSelecionado == null) {

            System.out.println("Configure usuário e mês primeiro!");
            return;
        }

        System.out.print("Digite receita extra: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        try {

            double extra = Double.parseDouble(scanner.nextLine());

            if (extra < 0) {

                System.out.println("Valor inválido.");
                return;
            }

            receita += extra;

            System.out.println("Receita atualizada: " + receita);

            if (metaEconomia == null) {

                System.out.print("Digite a meta de economia: ");

                if (!scanner.hasNextLine()) {
                    return;
                }

                metaEconomia = Double.parseDouble(scanner.nextLine());
            }

        } catch (NumberFormatException e) {

            System.out.println("Valor inválido.");
        }
    }

    private void registrarDespesa() {

        if (cpf == null || mesSelecionado == null || receita == null) {

            System.out.println("Configure usuário, mês e receita primeiro!");
            return;
        }

        System.out.print("Digite o valor da despesa: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        try {

            double despesa = Double.parseDouble(scanner.nextLine());

            totalDespesas += despesa;

            double saldo = receita - totalDespesas;

            System.out.println("Despesa registrada: -" + despesa);
            System.out.println("Total despesas: " + totalDespesas);
            System.out.println("Saldo atual: " + saldo);

            if (saldo < 0) {

                System.out.println("ATENÇÃO: Você entrou no negativo!");
            }

            if (metaEconomia != null && saldo < metaEconomia) {

                System.out.println("Meta de economia NÃO atingida!");
            }

        } catch (NumberFormatException e) {

            System.out.println("Valor inválido.");
        }
    }
}
