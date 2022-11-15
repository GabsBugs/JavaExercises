package Exercícios;

public class Programador extends Pessoa{
    public String nomeDaEmpresa;

    public boolean estaCodando;


    public Programador(String nome, String profissão, String nomeDaEmpresa) {
        super(nome, profissão);
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.estaCodando = false;

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

    public void codar() {
        estaCodando = true;
        System.out.println("Estou codando!");
    }

    public void pararDeCodar() {
        estaCodando = false;
        System.out.println("Não estou codando!");

    }

        public static void main(String[] args){
        Programador p1 = new Programador("Fernanda", "programador", "YTREM");

        System.out.println(p1.nome);
        System.out.println(p1.nomeDaEmpresa);
        System.out.println(p1.profissão);
        System.out.println(p1.estaCodando);

        p1.codar();
        p1.pararDeCodar();
    }


}
