package sistemaprofessoraluno;

public class ProfHorista extends Professor {
    private double salarioHora;
    
    public ProfHorista(String n, int m, int c, double s) {
        super(n,m,c);
        // Exceção:  Valores inválidos no construtor ProfHorista
    }

    public void setSalarioHora(double s) {
        // Exceção:  Argumento negativo em setSalarioHora
    }
    
    public double getSalarioHora() {
        return salarioHora;
    }
    
    public String toString() {
        return super.toString() + "\n"
             + "Salario por hora: " + salarioHora + "\n"
             + "Salario: " + getSalario();
    }
    
    public double getSalario() {
        return (salarioHora * getCargaHoraria() * 4.5);
    }
}
