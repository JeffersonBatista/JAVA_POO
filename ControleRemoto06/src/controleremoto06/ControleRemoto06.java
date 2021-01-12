package controleremoto06;

public class ControleRemoto06 {

    public static void main(String[] args) {
        ClasseControle c = new ClasseControle(50, false, false);
        c.abrirMenu();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.desligar();
        c.play();
        c.abrirMenu();
        
    }   
}
