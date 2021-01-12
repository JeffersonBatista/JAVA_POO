package ProjetoYoutube;
public class Video implements AcoesVideo {
    // Atributos //
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Método Construtor //
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    // Métodos Acessores //
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao))/this.views;///this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    // Métodos Abstratos //
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + " | Avaliações: " + this.avaliacao + " | Visualizações: " + this.views
                + " | Curtidas: " + this.curtidas + " | Reproduzindo: " + this.reproduzindo;
    }
    
    
    
    
}
