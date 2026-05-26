package service;

import model.Despesa;
import java.util.ArrayList;
import java.util.List;

public class DespesaService {

    private List<Despesa> despesas = new ArrayList<>();

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public void listarDespesas() {
        if (despesas.isEmpty()) {
            System.out.println("Nenhuma despesa cadastrada.");
            return;
        }

        for (Despesa d : despesas) {
            System.out.println(d);
        }
    }
}