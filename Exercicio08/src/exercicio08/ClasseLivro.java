
package exercicio08;

public class ClasseLivro implements InterfaceLivro {
    // Atributos //
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private ClassePessoa leitor;
    
    // Métodos Acessórios //
    public ClasseLivro(String titulo, String autor, int totPagina, ClassePessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.pagAtual = 0; // Vai iniciar em zero direto no instanciamento
        this.aberto = false; // Vai iniciar fechado direto no instanciamento
        this.leitor = leitor;
    }

    public String getTitulo(){
        return titulo;
     }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public ClassePessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(ClassePessoa leitor) {
        this.leitor = leitor;
    }
        
    // Métodos Públicos - Interface //
    @Override
    public void detalhes() {
        System.out.println("Livro: " + this.getTitulo() + ". " + "Escrito por " + this.getAutor() + ". " +
                "Possui " + this.getTotPagina() + " páginas. " + "Está emprestado para " + leitor.getNome() + ".");
        if (this.aberto == true) {
            System.out.println("O livro está aberto na página " + this.pagAtual);
        } else {
            System.out.println("O livro está fechado.");
        }
    }
    
    @Override
    public void abrirLivro() {
        if (this.aberto == false){
            this.setAberto(true);
        } else {
            System.out.println("O livro já está aberto.");
        }
    }

    @Override
    public void fecharLivro() {
        if (this.aberto == true){
            this.setAberto(false);
        } else {
            System.out.println("O livro já está fechado.");
        }
    }

    @Override
    public void folhearLivro(int p) {
        //System.out.println("Para qual página você deseja ir?");
        if (p < this.totPagina){
            this.pagAtual = p;
        } else {
            System.out.println("O livro não tem a página " + p + ".");
        }
        
        
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true || this.pagAtual < this.totPagina){
            this.setPagAtual(this.pagAtual +1);
            //System.out.println("Página atual: " + this.getPagAtual());
        } else {
            if(this.aberto == false){
                System.out.println("O livro está fechado.");
            } else {
                System.out.println("O livro chegou ao fim...");
            }
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto == true || this.pagAtual > 0){
            this.setPagAtual(this.pagAtual - 1);
            //System.out.println("Página atual: " + this.getPagAtual());
        } else {
            if(this.aberto == false){
                System.out.println("O livro está fechado.");
            } else {
                System.out.println("O livro está no início!");
            }
        }
    }
    
}    

