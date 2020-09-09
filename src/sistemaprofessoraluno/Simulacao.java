package sistemaprofessoraluno;

/**
 * Write a description of class Simulacao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulacao {

    public static void main(String args[]) {
        
        ProfHorista profhorista = new ProfHorista("Carlos", 001, 12, 1200);
        ProfDE profde = new ProfDE("Fedegosa", 002, 13);
        
        Cadastro cadastrar = new Cadastro(100);
        cadastrar.insere(profhorista, 0);
        cadastrar.consulta("Fedegosa");
        
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
