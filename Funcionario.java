package Exercícios;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public double salarioAnual;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.salarioAnual = salario * 12;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumentarSalario(double aumento) {
        System.out.printf("Eu ganhava " + salario + " reais por mês. ");
        this.salario = salario + aumento;
        this.salarioAnual = salario * 12;
        System.out.println("Tive um aumento de " + aumento + " reais, e agora eu ganho " + salario + " reais por mês.");
    }

    public void diminuirSalario (double redução) {
        System.out.printf("Eu ganhava " + salario + " reais por mês. ");
        this.salario = salario - redução;
        this.salarioAnual = salario * 12;
        System.out.println("Tive uma redução de " + redução + " reais, e agora eu ganho " + salario + " reais por mês.");
    }

    public void apresentação() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e eu ganho " + salario + " reais por mês, resultando " + salarioAnual + " reais por ano.");
    }


    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Alexandre", 18, 1200.0);

        f1.aumentarSalario(500.0);
        f1.apresentação();

        f1.diminuirSalario(700.0);
        f1.apresentação();

        System.out.println(f1.getSalario());

    }
}


