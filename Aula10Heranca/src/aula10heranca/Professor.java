package aula10heranca;
public class Professor extends Pessoa {
    // Atributos //
    private String especialidade;
    private float salario;
    
    // Método Construtor //
    /*public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }*/
    
    // Métodos Acessórios //
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // Métodos //
    public void receberAumento(float v){
        this.salario += v;
        System.out.println("O salário aumentou para: R$" + this.getSalario());
    }
}
