package exercicio08;

public class Exercicio08 {

    public static void main(String[] args) {
        ClassePessoa[] p = new ClassePessoa[2];
        ClasseLivro[] l = new ClasseLivro[3];
        
        p[0] = new ClassePessoa("Maria", 22, "F");
        p[1] = new ClassePessoa("João", 25, "M");
        
        l[0] = new ClasseLivro("Aprendendo JAVA", "Guanabara", 280, p[1]);
        l[1] = new ClasseLivro("Lógica de Programação", "Baraguana", 160, p[0]);
        l[2] = new ClasseLivro("Programação Orientada á Objetos", "Guabanara", 320, p[1]);
        
        l[0].detalhes();
        l[0].abrirLivro();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].detalhes();
        l[0].voltarPag();
        l[0].folhearLivro(666);
        l[0].detalhes();
        l[0].fecharLivro();
        l[0].detalhes();
        
    }
    
}
