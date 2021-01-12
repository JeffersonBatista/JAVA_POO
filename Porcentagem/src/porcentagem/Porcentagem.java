/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentagem;

/**
 *
 * @author jeff_B
 */
public class Porcentagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // All code application logic here
        double SP = 67863.43 ;
        double RJ = 36678.66;
        double MG = 29229.99;
        double ES = 27165.48;
        double Outros = 19849.53;
        
        double total = double (SP+RJ+MG+ES+Outros);
        System.out.println("As contribuiçoes totais são: R$ ", total, " E correspondem á 100%.");
        
    }
    
}
