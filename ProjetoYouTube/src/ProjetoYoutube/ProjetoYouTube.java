package ProjetoYoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Brasileirinhas");
        video[1] = new Video("RedPorn");
        video[2] = new Video("Asiáticas_Peitudas.com");
        
        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("jubileu", "Jubileu", 18, "M");
        usuario[1] = new Usuario("ana", "Ana", 22, "F");
        
        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao (usuario[0], video[2]);
        visu[1] = new Visualizacao (usuario[0], video[1]);
        visu[2] = new Visualizacao (usuario[0], video[2]);
        visu[3] = new Visualizacao (usuario[1], video[2]);
        
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        
        System.out.println(usuario[1].toString());
        
        System.out.println(visu[0].toString());
        System.out.println(visu[1].toString());
        visu[0].avaliar(92.0f);
        visu[2].avaliar(5);
        visu[3].avaliar(10);
        System.out.println(visu[0].toString());
        
        
    }
    
}
