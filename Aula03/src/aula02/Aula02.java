
package aula02;

public class Aula02 {

    public static void main(String[] args) {
       
       Caneta c1 = new Caneta("BIC", 0.5f, 85);
       /*c1.modelo = "BIC"; Criei um método modificador aonde eu vou alterar o modelo, sem mecher diretamente no atributo*/
       c1.setModelo("Bic Cristal");
       c1.cor = "Azul";/*Alterando o atributo diretamente */
       /*c1.ponta = 0.5f; /*Deu erro pois o atributo é privado*/
       c1.setPonta(0.5f);/*Criei um método modificador para alterar o atributo ponta, que é privado*/
       c1.carga = 85; /*Este é um atributo Protegido, porém está dentro da classe Caneta*/
       /*c1.tampada = true; O método pode acessar um atributo privado e fazer alterações mesmo o atributo sendo privado*/
       System.out.println(c1.getModelo());/*Criei um método acessório para passar o valor de modelo*/
       System.out.println(c1.getPonta()); 
       c1.status();
       c1.rabiscar();
       c1.destampar();
       c1.status();
       c1.rabiscar();
       
       Caneta c2 = new Caneta("BIC", 0.8f, 100);
       c2.status();
    }
    
}
