/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author jeffe
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Caneta c1 = new Caneta();
       c1.modelo = "BIC";
       c1.cor = "Vermelha";
       c1.ponta = 0.2f;
       c1.carga = 85;
       c1.tampada = false;
       c1.status();
       c1.destampar();
       c1.rabiscar();
       c1.tampar();
       c1.status();
       c1.rabiscar();
    }
    
}
