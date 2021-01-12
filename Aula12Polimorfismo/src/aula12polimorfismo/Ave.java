package aula12polimorfismo;
public class Ave extends Animal {
    // Atributos //
    private String corPena;
    
    // Métodos //
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
    
    // Métodos Acessores //
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutinhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
}
