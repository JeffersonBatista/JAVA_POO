package aula12polimorfismo;
public class MamiferoCachorro extends MamiferoLobo {
    // Atributos - Herdados de animais e mamíferos //
    // Métodos //
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    // Método de sobrecarga - varias formas de reagir, assinaturas diferentes (quantidade e tipo de parametros para o mesmo método), na mesma classe //
    public void reagir(String frase){
        if ("Toma comida".equals(frase)  || "Olá".equals(frase)){
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora){
        if (hora >= 6 && hora <= 12){
            System.out.println("Abanar o rabo rapido...");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Abanar o rabo devagar...");
        } else{
            System.out.println("Não abanar o rabo e rosnar!");
        }
    }
    
    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("Ficar descontrolado!");
        } else {
            System.out.println("Latir desesperadamente!!!");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Correr atrás do rabo!!!");
            } else {
                System.out.println("Ficar sentado e abanar o rabo...");
            }
        } else {
            if (peso < 10){
                System.out.println("Latir sentado...");
            } else {
                System.out.println("Rosnar deitado!");
            }
        }
    }
    
    // Metodo de sobreposição - Mesma assinatura, vai sobrepor o método herdado da classe progenitora //
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au! Auuuuuuu...");
    }
}
