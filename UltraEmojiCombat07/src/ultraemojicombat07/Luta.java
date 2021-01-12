
package ultraemojicombat07;

import java.util.Random;

public class Luta{
    // Atributos //
    private Lutador desafiado;//Aqui vai receber um vetor - Tipo abstrato de dado //
    private Lutador desafiante;// Aqui vai receber um vetor - Tipo abstrato de dado //
    private boolean aprovada;
    private int rounds;
    
    // Métodos Especiais //
    public Luta() {
        //this.desafiado = desafiado;
        //this.desafiante = desafiante;
    }
        
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

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("A Luta não pode ser marcada pois os lutadores são de categorias diferentes.");
        }
    }

    public void lutar() {
        if (this.aprovada){
            System.out.println("# DESAFIADO #");
            this.desafiado.apresentar();
            this.desafiado.status();
            System.out.println("# DESAFIANTE #");
            this.desafiante.apresentar();
            this.desafiante.status();
            Random aleatório = new Random();
            int vencedor = aleatório.nextInt(3);
            switch(vencedor){
                case 0:// Empate //
                    System.out.println("============EMPATE==============");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:// Desafiado Vence //
                    System.out.println("============VENCEDOR==============");
                    System.out.println("O desafiado " + this.desafiado.getNome() + " Venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:// Desafiante Vence
                    System.out.println("============VENCEDOR==============");
                    System.out.println("O Desafiante " + this.desafiante.getNome() + " Venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
}
