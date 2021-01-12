
package contabancaria05;

public class ContaBancaria05 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDonoConta("Jefferson");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(112);
        p2.setDonoConta("Maria");
        p2.abrirConta("CP");
        
        p1.depositarConta(250);
        p2.depositarConta(100);
        p2.sacarConta(50);
        p1.sacarConta(300);
        
        p1.fecharConta();
        
        p1.statusConta();
        p2.statusConta();
        
    }
    
}
