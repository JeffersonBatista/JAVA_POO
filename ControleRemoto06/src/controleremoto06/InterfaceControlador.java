package controleremoto06;

public interface InterfaceControlador {
     //Métodos Abstratos//
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
        
    /*public abstract void ligar(){
        setLigado(true);
    }
    public abstract void desligar(){
        setLigado(false);
    }
    public abstract void abrirMenu(){
        System.out.println("A tv está ligada: " + getLigado());
        i=0;
        if (i = 0 até getVolume() : 10){
            System.out.println("|");
    }
        System.out.println(" O volume é: " + getVolume());
        System.out.println("Está reproduzindo algo: " + getTocando());
    }
    public abstract void fecharMenu(){
        System.out.println("Menu Fechado!");
    }
    public abstract void maisVolume(){
        if (getLigado(true)){
            setVolume(getVolume() + 5);
        }
    }
    public abstract void menosVolume(){
        if (getLigado(true)){
            setVolume(getVolume() - 5);
        }
    }
    public abstract void ligarMudo(){
        if (getLigado(true) && getVolume() > 0){
            setVolume(getVolume() = 0);
        }
    }
    public abstract void desligarMudo(){
        if (getLigado(true) && getVolume() == 0){
            setVolume(getVolume() + 50);
        }
    }
    public abstract void play(){
        if (getLigado(true) && getTocando(false)){
            setTocando(true);
        }
    }
    public abstract void pause(){
        if (getLigado(true) && getTocando(true)){
            setTocando(false);
        }
    }*/
}
