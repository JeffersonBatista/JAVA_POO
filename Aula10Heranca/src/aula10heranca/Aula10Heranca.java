package aula10heranca;
public class Aula10Heranca {
    public static void main(String[] args) {
        /* Pessoa pessoa1 = new Pessoa(); Classe Pessoa é abstrata e não pode ser instanciada */
        Aluno pessoa2 = new Aluno();
        Funcionario pessoa3 = new Funcionario();
        Professor pessoa4 = new Professor();
        
        // pessoa1.setNome("Pedro");
        pessoa2.setNome("Maria");
        pessoa3.setNome("Claudio");
        pessoa4.setNome("Fabiana");
        
        // pessoa1.setSexo("M");
        pessoa4.setSexo("F");
        
        pessoa2.setIdade(42);
        
        // System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());
        
        pessoa2.setCurso("JAVA Básico");
        pessoa4.setSalario(4000);
        pessoa3.setSetor("Estoque");
        
        Visitante visitante1 = new Visitante();
        visitante1.setNome("Mariana");
        visitante1.setIdade(15);
        visitante1.setSexo("F");
        System.out.println(visitante1.toString());
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Claudio");
        aluno1.setMatricula(true);
        aluno1.setIdade(35);
        aluno1.setSexo("M");
        aluno1.setCurso("Algoritmos");
        System.out.println(aluno1.toString());
        aluno1.pagarMensalidade();
        aluno1.cancelarMatricula();
        aluno1.pagarMensalidade();
        
        Bolsista bolsista1 = new Bolsista();
        bolsista1.setNome("Jubileu");
        bolsista1.setMatricula(true);
        bolsista1.setBolsa(12);
        System.out.println(bolsista1.toString());
        bolsista1.pagarMensalidade();
        bolsista1.cancelarMatricula();
        bolsista1.pagarMensalidade();
        
    }
}
