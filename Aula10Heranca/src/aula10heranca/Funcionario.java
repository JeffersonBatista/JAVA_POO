package aula10heranca;
public class Funcionario extends Pessoa {
    // Atributos //
    private String setor;
    private boolean trabalhando;
    
    // Metodo Construtor //
    /*public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {    
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }*/

    // Metodos Acessórios //
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    // Métodos //
    public void mudarTrabalho(){
        if (this.getTrabalhando() == true){
        this.setTrabalhando(false);
        System.out.println("O funcionário foi desligado...");
        } else { 
        this.setTrabalhando(true);
        System.out.println("O funcionário admitido!");
        }
    }
}
