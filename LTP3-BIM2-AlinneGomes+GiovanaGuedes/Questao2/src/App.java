public class App {
    public static void main(String[] args) throws Exception {
        Usuario u1 = new Usuario("Alinne Gomes", "alinne.g@aluno.ifsp.edu.br", "senha");
        Usuario u2 = new Usuario("Giovana Guedes", "giovana.guedes@aluno.ifsp.edu.br", "senha123");
        Login login = new Login();

        // registrando usuario
        login.registrarUsuario(u1);
        login.registrarUsuario(u2);

        // validando dados e realizando login
        if (login.validarAcesso("Alinne Gomes", "senha")) {
            login.realizarLogin(u1);
        }
        if (login.validarAcesso("Giovana Guedes", "senha123")) {
            login.realizarLogin(u2);
        }

        //validando dados (senha errada)
        login.validarAcesso("Giovana Guedes", "senhaerrada");

        // verificar se usuario está logado (true)
        login.usuarioLogado(u1);
        login.usuarioLogado(u2);

        // imprimir dados
        login.imprimirDados();

        // realizar logout
        login.realizarLogout(u1);
        // verificar se está logado (false)
        login.usuarioLogado(u1);
    }
}
