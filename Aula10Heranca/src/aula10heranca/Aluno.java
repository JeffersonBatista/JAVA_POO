package aula10heranca;
public class Aluno extends Pessoa {
    // Herança diferencial - Além de implementar atributos e métods da progenitora, ainda tem suas próprias características //
    // Atributos //
    private boolean matricula;
    private String curso;
    
    // Método Construtor //
    /*public Aluno(boolean matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }*/
    
    // Métodos Acessórios //
    public boolean getMatricula() {
        return matricula;
    }
    
    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Métodos //
    public void cancelarMatricula(){
        this.setMatricula(false);
        System.out.println("Matrícula do " + this.getNome() + " cancelada com sucesso!");
    }
    
    public void pagarMensalidade(){
        if (this.getMatricula() == true){
            System.out.println("Pagamento do aluno " + this.getNome() + " efetuado com sucesso!");
        } else {
            System.out.println("Não foi possível efeturar o pagamento, pois o aluno " + this.getNome() + 
                    " não está mais matriculado!!!");
        }
    }
}
