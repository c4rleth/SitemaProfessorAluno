package sistemaprofessoraluno;
/**
 * A classe Cadastro implementa um cadastro de professores.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;
//import java.util.List;

public class Cadastro {
    //private List array = null;
    List<Professor> listadeprofessor;

    // Construtor recebe o tamanho inicial do cadastro
    public Cadastro(int capacidade) {
        
        if(capacidade > 0){
            listadeprofessor = new ArrayList<>(capacidade);
        }else{
            throw new IllegalArgumentException(Integer.toString(capacidade));
        }
            
        
        // crie o objeto ArrayList considerando que se o usuário
        // passou um valor negativo deve ser gerada uma exceção
        // IllegalArgumentException
    }
        
    // Adiciona um objeto no array 
    public void insere(Professor p) {
        listadeprofessor.add(p);
    }
    
     // Adiciona um objeto numa posição específica do array
     // Caso ocorra uma exceção, faça o método retornar false,
     // senão o método deve retornar true.
    public boolean insere(Professor p, int posicao) {
        
        try {
            listadeprofessor.add(posicao, p);
            
        } catch (Exception e) {
            System.out.println("Deu erro: " + e);
            return false;
        }
        
        System.out.println("Cadastrado com sucesso!");
        return true;
    }   
    
    // Remove o professor cujo nome é passado por parâmetro.
    // Se encontrar, remova o objeto e retorne true. Caso contrário, retorne false
    public boolean remove(String nome) {
        
        for(Professor p : listadeprofessor) {
            if(p.getNome().equals(nome)) {
                listadeprofessor.remove(p);
                return true;
            }
        }
        
        return false;
    }
    
    // Consulta se o professor cujo nome é passado por parâmetro
    // está no array. Se encontrar, retorne a referência do objeto. 
    // Caso contrário, retorne false
    public Professor consulta(String nome) {
        
        //String firstName = listadeprofessor.get(posicao).getNome();
        //System.out.println(listadeprofessor.get(0).getNome());        
        for(Professor p : listadeprofessor) {
            if(p.getNome().equals(nome)) {
                System.out.println(p);
                return p;
            }
        }
        
        /*
        if(firstName.equals(nome)){
            System.out.println(firstName);
            return listadeprofessor;
        }else{
            System.out.println("Deu merda");
            return null;
        }
        */
        return null;
    }    
    
    // Retorna a referência para o objeto que está armazenado no array
    // na posição passada como parâmetro. Lembre que uma exceção 
    // IndexOutOfBoundsException pode ser gerada e propague esta 
    // exceção.
    public Professor get(int posicao) {
               
        try {
            return listadeprofessor.get(posicao);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
            return null;
        }      
    }      
}
