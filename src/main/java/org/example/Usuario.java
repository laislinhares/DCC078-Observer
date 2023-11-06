package org.example;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void notificar(Netflix netflix) {
        netflix.addObserver(this);
    }

    public void update(Observable netflix, Object arg1) {
        this.ultimaNotificacao = this.nome + ", episodio lançado na " + netflix.toString();
    }
}
