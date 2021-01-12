package aula12polimorfismo;
public class Reptil extends Animal {
    // Atributos //
    private String corEscama;
    
    // Métodos //
    
    // Métodos Acessores //
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    
}
