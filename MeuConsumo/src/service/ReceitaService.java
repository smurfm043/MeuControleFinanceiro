package service;

import model.Receita;
import java.util.ArrayList;
import java.util.List;

public class ReceitaService {

    private List<Receita> receitas = new ArrayList<>();

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public void listarReceitas() {
        if (receitas.isEmpty()) {
            System.out.println("Nenhuma receita cadastrada.");
            return;
        }

        for (Receita r : receitas) {
            System.out.println(r);
        }
    }
}