/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author jeff_B
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ALL code application logic here
        int num, fant, fatual, fprox, contador;

	System.out.println("Digite um número para ver faz parte da sequência Fibonacci: ");
	num = new Scanner(System.in).nextInt();

	/* start */
	fant = 0;
	fatual = 1;
	contador = 1;

	boolean estaNaSquencia = false;

	while (contador < num) {

		fprox = fatual + fant;
		fant = fatual;
		fatual = fprox;
		if (num == fprox) {
			estaNaSquencia = true;
		}
		contador++;
	}

	if ((num == 0) || (num == 1) || (num == 2) || (num == 3)) {
		estaNaSquencia = true;
	}

	if (estaNaSquencia) {
		System.out.println("O número " + num
				+ " faz parte da sequencia Fibonacci");
	} else {
		System.out.println("O número " + num
				+ " NÃO faz parte da sequencia Fibonacci");
	}

}
    }

