package Exercícios;

import java.util.ArrayList;

public class Bichinho
{
    public String nome;
    public int idade;
    public double peso;
    public String bucho;
    public boolean estaDormindo;

    public Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = "vazio";
        this.estaDormindo = false;

    }

    public void dormir(int horas) {
        this.estaDormindo = true;
        System.out.println("Estou dormindo por " + horas + " horas!");
        int i;
        for (i=1; i<= horas; i++) {
            this.peso = peso - (peso / 10);
            System.out.printf("estou pesando = %.2f %n", (this.peso));
        }
    }

    public void acordar() {
        this.estaDormindo = false;
        System.out.println("Estou acordado!");
    }


    ArrayList<String> comidas = new ArrayList<>();
    public void comer(String comida) {
        if (estaDormindo == true) {
            System.out.println("ERRO!!Estou dormindo, não posso comer!");
        }

        else if (comidas.contains(comida)) {
            System.out.println("Eu ja comi " + comida + "! Não como a mesma comida duas vezes!!!");
        }

        else {
            System.out.println("Estou comendo " + comida + "!");
            this.peso = peso * 0.10 + peso;
            System.out.printf("estou pesando = %.2f %n", (this.peso));
            //%.2f = 2 casas dps da virgula
            //%n = passa para a prox linha

            comidas.add(comida);
            System.out.println("Eu comi = " + comidas + ".");

        }
    }
}
