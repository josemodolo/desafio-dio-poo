package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
   String titulo;
   String descricao;
   LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }


}
