package Exercícios;

public class Circulo {
    public int raio;
    public String cor;

    Circulo(int raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    double area = 3.14 * raio * raio;

    double circuferencia = 2 * 3.14 * raio;

    public double calcularArea() {
        return area;
    }

    public double calcularCircuferencia() {
        return circuferencia;
    }

    public int setRaio(int novoRaio) {
        this.raio = novoRaio;
        return novoRaio;
    }

}
