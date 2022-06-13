public class Funcionario extends Pessoa {
    private double salario;
    public Funcionario(String nome, String email, String registro, double salario) {
        super(nome, email, registro);
        this.salario = salario;
    }
    public Funcionario(){}
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
