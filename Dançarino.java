package Exercícios;

public class Dançarino extends Pessoa {
    public String nomeDoGrupo;

    public boolean estaDançando;


    public Dançarino(String nome, String profissão, String nomeDoGrupo) {
        super(nome, profissão);
        this.nomeDoGrupo = nomeDoGrupo;
        this.estaDançando = false;

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

    public void dançar() {
        estaDançando = true;
        System.out.println("Estou dançando!");
    }

    public void pararDeDançar() {
        estaDançando = false;
        System.out.println("Não estou dançando!");

    }

    public static void main(String[] args){
        Dançarino d1 = new Dançarino("Sabrina", "dançarina", "dancecats");

        System.out.println(d1.nome);
        System.out.println(d1.nomeDoGrupo);
        System.out.println(d1.profissão);
        System.out.println(d1.estaDançando);

        d1.dançar();
        d1.pararDeDançar();
    }

}
