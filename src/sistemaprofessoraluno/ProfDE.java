package sistemaprofessoraluno;

public class ProfDE extends Professor {
    private double salario;
    
    public ProfDE(String n, int m, double s) {
        super(n,m,40);
        
        try {
            this.nome = n;
            this.matricula = m;
            this.salario = s;
        } catch (IllegalArgumentException e) {
            System.out.println("Valor invalido: " + e);
        }
        // Exceção:  Valores inválidos no construtor ProfDE
    }

    public void setSalario(double s) {
         // Exceção:  Argumento negativo em setSalario
         
         if(s < 0){
             throw new IllegalArgumentException("Não é permitido valores negativos");
         }
    }
    
    public String toString() {
        return super.toString() + "\n"
             + "Salario: " + salario;
    }
    
    public double getSalario() {
        return salario;
    }
}
