package org.example;

import java.util.Observable;

public class Netflix extends Observable {

    private String serie;
    private String data;
    private Integer temporada;
    private Integer numEpisodios;

    public Netflix(String serie, String data, Integer temporada, Integer numEpisodios) {
        this.serie = serie;
        this.data = data;
        this.temporada = temporada;
        this.numEpisodios = numEpisodios;
    }

    public void lancarEpisodio() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "serie='" + serie + '\'' +
                ", data='" + data + '\'' +
                ", temporada=" + temporada +
                ", numEpisodios=" + numEpisodios +
                '}';
    }
}
