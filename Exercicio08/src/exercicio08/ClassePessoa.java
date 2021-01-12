package exercicio08;


public class ClassePessoa implements InterfacePessoa {
    // Atributos //
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos Acessórios //
    public ClassePessoa(String nm, int id, String sx) {
        this.nome = nm;
        this.idade = id;
        this.sexo = sx;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Métodos Públicos - Interface //
    @Override
    public void fazerAniversario() {
        this.idade++;
    }
    
}
