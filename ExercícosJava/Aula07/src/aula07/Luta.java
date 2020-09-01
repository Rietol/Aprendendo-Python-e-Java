package aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria() == l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if (this.isAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("--------------------------------------");
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou Desafiado
                    System.out.println("--------------------------------------");
                    System.out.println(this.getDesafiado().getNome() + "Ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Ganhou Desafiante
                    System.out.println("--------------------------------------");
                    System.out.println(this.getDesafiante().getNome() + "Ganhou!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }    
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
