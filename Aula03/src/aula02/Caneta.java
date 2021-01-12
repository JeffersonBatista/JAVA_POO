
package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public Caneta(String m, float p, int c){/*Método Construtor*/
        this.cor = "PRETO";
        this.modelo = m;
        this.ponta = p;
        this.carga = c;
        this.tampar();
    }
    /*Método Construtor = define um padrão para todo objeto instanciado dentro da classe em questão, 
    os atributos podem ser alterados posteriormente, mas quando é criado já começa com o estipulado aqui. */
    
    /*Método Acessório = Getter -> get. */
    /*Método Modificador = Setter -> set. */
    /*Método Construtor = Construct -> */
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
       this.ponta = p; 
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public void setCarga(int c){
        this.carga = c;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public void status(){
        System.out.println("Uma caneta modelo: "+ this.modelo);
        System.out.println("Atualmente com " + this.carga + "% de carga");
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta " + this.ponta);
        if (this.tampada == false){
            System.out.println("A caneta está com a tampa aberta.");
        }else{
            System.out.println("A caneta está com a tampa fechada.");
        }
                
    }
    
    public void rabiscar(){
        if (this.tampada == false){
            System.out.println("Fuckyou");
        }else {
            System.out.println("Não da pra escrever pois a caneta está tampada");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
