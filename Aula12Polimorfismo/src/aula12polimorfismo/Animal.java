package aula12polimorfismo;

public abstract class Animal {
    // Atributos //
    private float peso;
    private int idade;
    private int membros;
    
    // Métodos Abstratos - São declarados e não implementados //
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    // Métodos Acessores //
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
