package Jogo.java;

import Elemento.java.Resultado;

public class Jogo {
    private Jogador jogadorHumano;
    private Jogador cpu;

    public Jogo(String nomeJogador) {
        this.jogadorHumano = new Jogador(nomeJogador);
        this.cpu = new Jogador("Computador (CPU)");
    }

    public void jogarRodada(Elemento escolhaHumano) {
        Elemento escolhaCpu = cpu.gerarEscolhaAleatoria();

        System.out.println("\n");
        System.out.println(jogadorHumano.getNome() + " escolheu: " + escolhaHumano);
        System.out.println(cpu.getNome() + " escolheu: " + escolhaCpu);

        //resultado dado por meio da perspectiva de um jogador humano
        Resultado resultado = escolhaHumano.compararCom(escolhaCpu);

        switch (resultado) {
            case VITORIA:
                jogadorHumano.incrementarPontuacao();
                System.out.println("Resultado: Você venceu a rodada!");
                break;
            case DERROTA:
                cpu.incrementarPontuacao();
                System.out.println("Resultado: CPU venceu a rodada!");
                break;
            case EMPATE:
                System.out.println("Resultado: Empate!");
                break;
        }

        exibirPlacar();
    }

    private void exibirPlacar() {
        System.out.println("\nPLACAR ATUAL");
        System.out.println(jogadorHumano.getNome() + ": " + jogadorHumano.getPontuacao());
        System.out.println(cpu.getNome() + ": " + cpu.getPontuacao());
        System.out.println("\n");
    }
}
