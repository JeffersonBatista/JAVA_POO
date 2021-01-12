package ProjetoYoutube;
public class Usuario extends Pessoa {
    // Atributos //
    private String login;
    private int totAssistido;
    
    // Método Construtor //
    public Usuario(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    // Metodos  //
    public void viuMaisUm(){
        this.ganharExp();
    }
    
    // Metodos Acessores //
    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    // Métodos Abstratos - implementados da superclasse //
    @Override
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | login: " + this.login + " | idade: " + this.idade + " | sexo: " + 
                this.sexo + " | Total de assistidos: " + this.totAssistido + " | Exp.: " + this.experiencia;
    }
    
    
}
