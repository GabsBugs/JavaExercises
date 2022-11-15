package Exercícios;

public class Cantor extends Pessoa{

    public String nomeDaBanda;

    public boolean estaCantando;

    public boolean estaTocandoViolão;

    public Cantor(String nome, String profissão, String nomeDaBanda) {
        super(nome, profissão);
        this.nomeDaBanda = nomeDaBanda;
        this.estaCantando = false;
        this.estaTocandoViolão = false;
    }


    @Override
    public void andar(String lugar) {
        super.andar(lugar);
    }

    @Override
    public void aprender(String ação) {
        super.aprender(ação);
    }

    @Override
    public void comer(String comida) {
        super.comer(comida);
    }

   public void cantar() {
        estaCantando = true;
        System.out.println("Estou cantando!");
    }

    public void pararDeCantar() {
        estaCantando = false;
        System.out.println("Não estou cantando!");

    }

    public void tocarViolão() {
       estaTocandoViolão = true;
       System.out.println("Estou tocando violão!");
    }

    public void pararDeTocarViolão() {
        estaTocandoViolão = false;
        System.out.println("Não estou tocando violão!");

    }


    public static void main(String[] args){
        Cantor c1 = new Cantor("João", "cantor", "Os_mosqueteiros");

        System.out.println(c1.nome);
        System.out.println(c1.nomeDaBanda);
        System.out.println(c1.profissão);

        System.out.println(c1.estaCantando);
        System.out.println(c1.estaTocandoViolão);

    }
}
