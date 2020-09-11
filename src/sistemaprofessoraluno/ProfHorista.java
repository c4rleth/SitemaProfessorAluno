package sistemaprofessoraluno;

public class ProfHorista extends Professor {
    private double salarioHora;
    
    public ProfHorista(String n, int m, int c, double s) {
        super(n,m,c);
        
        try {
            this.nome = n;
            this.matricula = m;
            this.cargaHoraria = c;
            this.salarioHora = s; 
        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido: " + e);
        }
        // Exceção:  Valores inválidos no construtor ProfHorista
    }

    public void setSalarioHora(double s) {
        // Exceção:  Argumento negativo em setSalarioHora
        
        if( s < 0 ) {
         throw new IllegalArgumentException(Double.toString(s));
     }
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
