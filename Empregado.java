package Exercícios;

public class Empregado {
    public String nome;
    public String sobrenome;
    public double salario;

    public double calcularSalarioAnual(){
        return salario * 12;
    }

    public double aumentarSalario(double aumento){
        this.salario += aumento;
        return salario;
    }

    public String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }
}
