public class Pessoa {
    protected String nome, email, registro;

    public Pessoa(String nome, String email, String registro) {
        this.nome = nome;
        this.email = email;
        this.registro = registro;
    }
    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getRegistro() {
        return registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
