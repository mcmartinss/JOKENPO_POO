package Jogador.java;

import java.util.Random;

package Elemento.java;

public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void incrementarPontuacao() {
        this.pontuacao++;
    }

    //CPU escolhe aleatoriamente
    public Elemento gerarEscolhaAleatoria() {
        Elemento[] elementos = Elemento.values();
        Random random = new Random();
        return elementos[random.nextInt(elementos.length)];
    }
}
