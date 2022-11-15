package Exercícios;

public class Gerente extends Funcionario{

    public double bonus;

    public double salarioGerente;
    public Gerente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
        this.salario = salario + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double getSalario() {
        return super.getSalario();
    }


    @Override
    public void apresentação() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e eu ganho " + salario + " reais por mês, resultando " + salarioAnual + " reais por ano. Ganho " + bonus + " reais de bonus, porque sou gerente." );
    }

    public static void main(String[] args){
        Gerente g1 = new Gerente("Luana", 26, 1200.0, 500.0);

        g1.apresentação();


        System.out.println(g1.getSalario());

    }
}
