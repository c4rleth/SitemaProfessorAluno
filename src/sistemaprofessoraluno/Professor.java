package sistemaprofessoraluno;

public abstract class Professor {
    protected String nome;
    protected int matricula;
    protected int cargaHoraria;

    public Professor(String n, int m, int c) {
        
        // Exceção:  Valores inválidos no construtor Professor
        try {
            this.nome = n;
            this.matricula = m;
            this.cargaHoraria = c;
        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido: " + e);
        }
    }
    
    public void setNome(String n) {
        // Exceção:  Argumento não deve ser branco em setNome
        
        if("".equals(n)){
            throw new NullPointerException("O nome não pode ficar em branco");
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setMatricula(int m) {
        // Exceção:  Argumento negativo ou nulo em setMatricula
        
        if( m == 0 || m < 0 ) {
         throw new IllegalArgumentException(Integer.toString(m));
     }
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setCargaHoraria(int c) {
        // Exceção:  Argumento negativo em setCargaHoraria
        
        if( c < 0 ) {
         throw new IllegalArgumentException(Integer.toString(c));
     }
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n"
             + "Nome: " + nome + "\n"
             + "Carga horaria: " + cargaHoraria;
    }
    
    public abstract double getSalario();
}
