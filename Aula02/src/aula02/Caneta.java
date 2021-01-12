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
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta modelo: "+ this.modelo);
        System.out.println("Atualmente com " + this.carga + "% de carga");
        System.out.println("Cor " + this.cor + " de ponta " + this.ponta);
        if (this.tampada == false){
            System.out.println("A caneta está com a tampa aberta.");
        }else{
            System.out.println("A caneta está com a tampa fechada.");
        }
                
    }
    
    void rabiscar(){
        if (this.tampada == false){
            System.out.println("Fuckyou");
        }else {
            System.out.println("Não da pra escrever pois a caneta está tampada");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
