package ultraemojicombat07;

public class Lutador implements InterfaceLutador {
    // Atributos //
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
    // Métodos Especiais //
    public Lutador(String no, String na, int id, float alt, float pe,/*, String cat,*/ int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        /*this.categoria = cat;*/
        this.vitoria = vit;
        this.derrota = der;
        this.empate = emp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();        
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso <= 52.2) {
            System.out.println("CATEGORIA ABAIXO DO LIMITE");
            this.categoria = "INVÀLIDO";
        }else if (this.peso <= 70.3) {
            this.categoria = "leve";
        }else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
            System.out.println("CATEGORIA ÁCIMA DO LIMITE");
            this.categoria = "INVÁLIDO";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    // Métodos Públicos - Interface //
    
    @Override
    public void apresentar() {
        System.out.println("E com vocês " + this.getNome());
        System.out.println("Ele tem " + this.getIdade() + " anos.");
        System.out.println("Seu país de origem é " + this.getNacionalidade());
        System.out.println("Com " + this.getAltura() + " metros de altura e pesando " + this.getPeso() + "Kg.");
    }

    @Override
    public void status() {
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitoria());
        System.out.println("Empates: " + this.getEmpate());
        System.out.println("Derrotas: " + this.getDerrota());
        System.out.println("==============================");
    }

    @Override
    public void ganharLuta() {
        this.setVitoria(this.getVitoria()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrota(this.getDerrota()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(this.getEmpate()+1);
    }
   
}
