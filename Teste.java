package Exercícios;

public class Teste {
    public static void main (String[] args) {
        Bichinho b1 = new Bichinho("Luna", 10, 20.0);
        //System.out.println(b1.bucho);
        //System.out.println(b1.estaDormindo);
        //System.out.println(b1.nome);
        //System.out.println(b1.idade);
        //System.out.println(b1.peso);

        b1.dormir(3);

        b1.acordar();

        b1.comer("arroz");
        b1.comer("farinha");
        b1.comer("cuzcuz");
        b1.comer("farinha");
        b1.comer("sushi");
    }
}
