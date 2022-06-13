import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Login {
    private HashMap<String, String> usuarios;

    public Login() {
        usuarios = new HashMap();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNome(), usuario.getSenha());
    }

    public boolean validarAcesso(String nome, String senha) {
        String retorno = usuarios.get(nome);
        if (retorno != null && retorno == senha) {
            System.out.println("\nAcesso liberado!");
            return true;
        } else {
            System.out.println("\nAcesso negado!");
            return false;
        }
    }

    public void realizarLogin(Usuario usuario) {
        usuario.setLogado(true);
    }

    public void realizarLogout(Usuario usuario) {
        usuario.setLogado(false);
        System.out.println("\nLogout realizado!");
    }

    public void usuarioLogado(Usuario usuario) {
        if (usuario.isLogado()) {
            System.out.println("\nO usuário " + usuario.getNome() + " está logado.");
        } else {
            System.out.println("\nO usuário " + usuario.getNome() + " não está logado.");
        }
    }

    public void imprimirDados() {
        Iterator it = usuarios.entrySet().iterator();
        while (it.hasNext()) {
            Entry parKeyValue = (Entry) it.next();
            System.out.println("\nNome de usuário: " + parKeyValue.getKey());
            System.out.println("\nSenha: " + parKeyValue.getValue());
        }
    }
}
