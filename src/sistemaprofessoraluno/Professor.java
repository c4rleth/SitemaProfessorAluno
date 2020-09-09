package sistemaprofessoraluno;

public abstract class Professor {
    protected String nome;
    protected int matricula;
    protected int cargaHoraria;

    public Professor(String n, int m, int c) {
        // Exceção:  Valores inválidos no construtor Professor
    }
    
    public void setNome(String n) {
        // Exceção:  Argumento não deve ser branco em setNome
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setMatricula(int m) {
        // Exceção:  Argumento negativo ou nulo em setMatricula
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setCargaHoraria(int c) {
        // Exceção:  Argumento negativo em setCargaHoraria
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public String toString() {
        return "Matricula: " + matricula + "\n"
             + "Nome: " + nome + "\n"
             + "Carga horaria: " + cargaHoraria;
    }
    
    public abstract double getSalario();
}
