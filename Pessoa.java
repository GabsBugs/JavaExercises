package Exercícios;

public class Pessoa {

    public String nome;
    public String profissão;

    public Pessoa(String nome, String profissão){
        this.nome = nome;
        this.profissão = profissão;
    }


    public void aprender(String ação){
        System.out.println("Estou aprendendo a " + ação);
    }

    public void andar(String lugar){
        System.out.println("Estou andando para chegar no(a) " + lugar);
    }

    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }
}
