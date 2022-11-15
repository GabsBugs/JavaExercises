package Exercícios;

public class Autor {
    public String nome;
    public String email;

    Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String setNome(String novoNome) {
        this.nome = novoNome;
        return novoNome;
    }

    public String setEmail(String novoEmail) {
        this.email = novoEmail;
        return novoEmail;
    }
}
