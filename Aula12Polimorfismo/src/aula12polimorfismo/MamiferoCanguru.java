package aula12polimorfismo;
public class MamiferoCanguru extends Mamífero {
    // Atributos - Herdados de animais e mamíferos //
    // Métodos //
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    // Métodos de Sobreposição //
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
}
