public class EmprestimoBancario{

    private double valorBase = 1000, emprestimo;

    public EmprestimoBancario() {
    }
    
    public void calcularEmprestimo(Pessoa p){
       emprestimo = valorBase;
       System.out.println(emprestimo);
    }
    public void calcularEmprestimo(Aluno a){
        if(a instanceof Graduacao){
            emprestimo = valorBase*1.5;
        }else if (a instanceof PosGraduacao){
            emprestimo = valorBase*2;
        }
        System.out.println(emprestimo);
    }
    public void calcularEmprestimo(Funcionario f){
        if(f instanceof ChefeDeDepartamento){
            emprestimo = f.getSalario()*4;
        }else if(f instanceof GerenteDeFilial){
            emprestimo = f.getSalario()*6;
        } else if(f instanceof PresidenteDaEmpresa){
            emprestimo = f.getSalario()*12;
        }else{
            emprestimo = f.getSalario()*2;
        }
        System.out.println(emprestimo);
    }
}