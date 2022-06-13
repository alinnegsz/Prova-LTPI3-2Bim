public class App {
    public static void main(String[] args) throws Exception {

        EmprestimoBancario e = new EmprestimoBancario();
        Pessoa p = new Pessoa();

        Aluno a = new Aluno();
        Graduacao graduacao = new Graduacao();
        PosGraduacao posGraduacao = new PosGraduacao();

        Funcionario f = new Funcionario();
        ChefeDeDepartamento chefeDeDepartamento = new ChefeDeDepartamento();
        GerenteDeFilial gerenteDeFilial = new GerenteDeFilial();
        PresidenteDaEmpresa presidenteDaEmpresa = new PresidenteDaEmpresa();

        f.setSalario(1500);
        chefeDeDepartamento.setSalario(5000);
        gerenteDeFilial.setSalario(10000);
        presidenteDaEmpresa.setSalario(100000);

        //emprestimo pessoa
        System.out.println("\nPessoa:");
        e.calcularEmprestimo(p);

        //emprestimo aluno graduacao
        System.out.println("\nGraduação:");
        e.calcularEmprestimo(graduacao);
        //emprestimo aluno pós
        System.out.println("\nPós-Graduação:");
        e.calcularEmprestimo(posGraduacao);

        //emprestimo funcionario
        System.out.println("\nFuncionário:");
        e.calcularEmprestimo(f);
        //emprestimo chefe de departamento
        System.out.println("\nChefe de Departamento:");
        e.calcularEmprestimo(chefeDeDepartamento);
        //emprestimo gerente de filial
        System.out.println("\nGerente de Filial:");
        e.calcularEmprestimo(gerenteDeFilial);
        //emprestimo presidente da empresa
        System.out.println("\nPresidente da Empresa:");
        e.calcularEmprestimo(presidenteDaEmpresa);

    }
}
