package aula10heranca;
public class Tecnico  extends Aluno {
    // Atributos //
    private int registroProfissional;
    
    // Métodos Acessores //
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    // Métodos //
    public void praticar(){
        if (this.getMatricula() == true){
            System.out.println("Praticando...");
        } else {
            System.out.println("Aluno técnico não matriculado!");
        }
    }
}
