/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodiario;

/**
 *
 * @author jeff_B
 */
public class CalculoDiario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vetor = new int[364]; /*Cria um vetor com 365 dias */
	   
	   for(int i=0;i<364;i++){
                   
		   vetor[i] = (int) (1+ (Math.random()*100000)); /* Atribui um número randomico ao indice em sequencia */
	   }
	   for(int i=0;i<364;i++){
                   System.out.print("R$ ");
		   System.out.print(vetor[i]);
                   System.out.println(",00.");
	   }
        
    }
    
}
