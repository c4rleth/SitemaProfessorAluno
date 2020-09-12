package sistemaprofessoraluno;

/**
 * Write a description of class Simulacao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulacao {

    public static void main(String args[]) {
        
        
        ProfHorista profhorista = new ProfHorista("", 001, -1, 2097);
        //profhorista.setCargaHoraria(-1);
        ProfHorista profhorista02 = new ProfHorista("Icaro", 002, 28, 1200);
        ProfDE profde = new ProfDE("Fedegosa", 002, 13);
        
        Cadastro cadastrar = new Cadastro(1);
        cadastrar.insere(profhorista02, 0);
        //cadastrar.insere(profhorista02, 1);
        cadastrar.consulta("Icaro");
        //cadastrar.remove("Icaro");
        //cadastrar.consulta("Icaro");
        //cadastrar.get(1);
        Cadastro.gravarArquivoBinario(Cadastro.listadeprofessor, "nomeArq");
        
        
        //Ler arquivo
        Cadastro.lerArquivoBinario("nomeArq");
        
        int i = 1;
        for (Professor p: Cadastro.listadeprofessor) {
        System.out.printf("Ficha nº....: %d.\n", i++);
       
        System.out.printf("Nome.........: %s\n", ((Professor)p).getNome());
        System.out.printf("Matricula: %d \n", ((Professor)p).getMatricula());
        System.out.printf("Carga Horaria.......: %d \n", ((Professor)p).getCargaHoraria());
        System.out.printf("Salario..........: %.2f\n", ((Professor)p).getSalario());
        System.out.printf("Salario por hora..........: %.2f\n", ((ProfHorista)p).getSalarioHora());
        
      }

        
        // Cenário 01: A ideia é criar e utilizar exceções
        // Crie alguns objetos ProfDE, alguns objetos ProfHorista e um objeto Cadastro
        // Depois insira, consulte e remova elementos do cadastro provocando a ocorrência 
        // de exceções. Faça o tratamento exibindo mensagens específicas para cada
        // exceção que pode ocorrer.
        
        // Cenário 02: A ideia é trabalhar com a serialização de objetos
        // Faça persistências utilizando Serialização de Objetos apenas
        // Fazer um SALVAR e RECUPERAR de arquivo o sistema todo ou uma classe que vai ter 
        // os vários vetores de "persistência externa". 
        
        // Converse com o professor sobre a atividade para alinhar dúvidas ou sugestões ou funcionalidades
    }
}
