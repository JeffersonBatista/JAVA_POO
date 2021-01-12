package contabancaria05;

public class ContaBanco {

    public int numConta;
    protected String tipoConta;
    /* Conta Corrente = cc e Poupança = cp */
    private String donoConta;
    private float saldoConta;
    /* cc começa com R$ 50,00 e cp começa com R$150,00 */
    private boolean statusConta;
    /* Aberto = true e fechado = false */
    
    public void statusConta() {
        System.out.println("---------------BATBANCO---------------");
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo de Conta " + this.getTipoConta());
        System.out.println("Titular: " + this.getDonoConta());
        System.out.println("Saldo R$ " + this.getSaldoConta());
        System.out.println("Status: " + this.getStatusConta());
        System.out.println("--------------------------------------");
    }

    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatusConta(true);
        if (t == "CC") {
            this.setSaldoConta(50);
        } else if(t == "CP"){
            this.setSaldoConta(150);
        } 
        System.out.println("Conta "+ this.getNumConta() + " Aberta com sucesso e saldo de R$ "+ this.getSaldoConta());
    }

    public void fecharConta() {
        if (this.statusConta == false) {
            System.out.println("A Conta já se encontra fechada!");
        } else {
            if (this.getSaldoConta() > 0) {
                System.out.println("A Conta possui saldo, e deve ser sacado antes.");
                System.out.println("Saldo Positivo: " + this.getSaldoConta());
            } else if (this.saldoConta < 0) {
                System.out.println("A conta possui débito, deve-se quitar o valor antes.");
                System.out.println("Saldo Negativo: " + this.getSaldoConta());
            } else {
                this.setStatusConta(false);
                System.out.println("Conta Finalizada com Sucesso!");
            }
        }
    }

    public void depositarConta(float v) {
        if (this.getStatusConta()) {
            System.out.println("Valor de R$ "+ v + " depositado com sucesso na conta " + this.getNumConta());
            this.setSaldoConta(this.getSaldoConta() + v);
        } else {
            System.out.println("A Conta está inativa!");
        }
    }

    public void sacarConta(float v) {/*Saque não pode ser maior que o saldo */
        if (this.statusConta == true) {
            if (this.saldoConta >= v) {
                System.out.println("Saldo Disponível: R$ " + this.getSaldoConta());
                System.out.println("Quanto deseja sacar?");
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque de R$" + v + " realizado na conta de " + this.getDonoConta() );
                System.out.println("Saldo Atual R$ " + this.getSaldoConta());
            } else {
                System.out.println("A Conta " + this.getNumConta() + " não tem saldo suficiente!");
            }
        } else {
            System.out.println("A Conta está inativa!");
        }
    }

    public void pagarMensal(String m) {/*cc paga R$ 12,00 e cp paga R$20,00*/
        this.setTipoConta(m);
        if (this.getStatusConta()){
            if (m == "CC") {
                    this.setSaldoConta(this.getSaldoConta() - 12);
            } else if (m == "CP") {
                this.setSaldoConta(this.getSaldoConta() - 20);
          }  
        }else{
            System.out.println("Conta Inativa!");
        }
        
    }

    public ContaBanco() {
        this.saldoConta = 0;
        this.statusConta = false;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    public boolean getStatusConta (){
        return statusConta;
    }

}

