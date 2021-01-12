package aula12polimorfismo;
public class Peixe extends Animal {
    // Atributos //
    private String corEscama;
    
    // Métodos //
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
    
    // Métodos Acessores //
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
}
