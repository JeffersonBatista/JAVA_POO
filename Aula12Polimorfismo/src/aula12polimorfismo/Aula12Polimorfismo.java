package aula12polimorfismo;
public class Aula12Polimorfismo {
    public static void main(String[] args) {
        // Codeman //
        // Animal animal1 = new Animal(); Não é possível criar pois é uma classe abstrata //
        
        Mamífero m = new Mamífero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        MamiferoCanguru mg = new MamiferoCanguru();
        ReptilTartaruga rt = new ReptilTartaruga();
        MamiferoCachorro mc = new MamiferoCachorro();
        MamiferoLobo ml = new MamiferoLobo();
        
        /*m.setPeso(30.5f);
        m.setCorPelo("Marrom");
        m.locomover();
        m.emitirSom();
        p.emitirSom();
        p.alimentar();
        p.locomover();
        r.locomover();
        a.fazerNinho();
        a.locomover();
        mg.locomover();
        rt.locomover();
        mc.enterrarOsso();
        mc.abanarRabo();
        mc.locomover();
        mc.emitirSom();
        ml.emitirSom();*/
        mc.reagir("Toma comida");
        mc.reagir(5);
        mc.reagir(true);
        mc.reagir(8,7.5f);
    }
    
}
