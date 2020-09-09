package sistemaprofessoraluno;

public class ProfDE extends Professor {
    private double salario;
    
    public ProfDE(String n, int m, double s) {
        super(n,m,40);
        // Exceção:  Valores inválidos no construtor ProfDE
    }

    public void setSalario(double s) {
         // Exceção:  Argumento negativo em setSalario
    }
    
    public String toString() {
        return super.toString() + "\n"
             + "Salario: " + salario;
    }
    
    public double getSalario() {
        return salario;
    }
}
