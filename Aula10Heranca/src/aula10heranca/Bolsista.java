package aula10heranca;
public final class Bolsista extends Aluno { // Classe Final - não pode ser herdada //
    // Atributos //
    public int bolsa;
    
    // Métodos Acessores //
    public int getBolsa() {
        return  bolsa;
    }
    
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    // Métodos //
    public void renovarBolsa(){
        if (this.getMatricula() == true){
            System.out.println("Matricula do " + this.getNome() + " renovada com sucesso!");
        } else {
            System.out.println("Aluno bolsista não matriculado.");
        }
    }
    
    @Override // sobrepõe o método declarado na progenitora, caso o método não seja declarado final //
    public void pagarMensalidade(){ 
        if (this.getMatricula() == true){
            System.out.println("Pagamento do bolsista " + this.getNome() + " efetuado com sucesso!");
        } else {
            System.out.println("Não foi possível efeturar o pagamento, pois o bolsista " + this.getNome() + 
                    " não está mais matriculado!!!");
        }
    }
}
