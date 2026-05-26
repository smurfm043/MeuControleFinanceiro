package model;

import java.time.LocalDate;

public class Alerta {

    private int id;
    private String tipo;
    private String mensagem;
    private LocalDate data;
    private boolean visualizado;

    // Construtor
    public Alerta(int id, String tipo, String mensagem, LocalDate data, boolean visualizado) {
        this.id = id;
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.data = data;
        this.visualizado = visualizado;
    }


    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }

    @Override
    public String toString() {
        return "Alerta: " + tipo + " - " + mensagem + " (" + data + ")";
    }
}