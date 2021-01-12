package controleremoto06;

public class ClasseControle implements InterfaceControlador{
    
    // Atributos //
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais //

    public ClasseControle (int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }
    
    //Métodos Abstratos vão ser importados da InterfaceControlador//

    @Override /* Override significa sobrescrever métodos */
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---------- MENU -----------");
        System.out.println("A tv está ligada: " + this.getLigado());
        System.out.println("Está tocando: " + this.getTocando());
        System.out.print("Volume: ");
        if (this.getLigado()){
            int i;
        for (i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.print(" " + this.getVolume());
        }else{
            System.out.println("0");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu Fechado!");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && !(this.getTocando()))/*this.getTocando() == false*/{
            this.setTocando(true);
        }else{
            System.out.println("Impossível, controle desligado");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Impossível, controle desligado");
        }
    }
}
