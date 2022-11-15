package Exercícios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Selecione uma operação (1 a 4)");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");


        int operacao = entrada.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Você escolheu adição!");
                System.out.println("Digite o total de números: ");
                int totalNum = entrada.nextInt();

                double[] num = new double[totalNum];

                for (int i = 0; i < totalNum; i++) {
                    System.out.println("Digite o valor do " + (i + 1) + "º número: ");
                    num[i] = entrada.nextDouble();
                }

                double soma = 0.0;
                for (double nums : num) {
                    soma += nums;
                }

                System.out.println("A soma deu o resultado: " + soma);

                break; // impedir de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu subtração!");
                System.out.println("Digite o total de números: ");
                int totalNum2 = entrada.nextInt();

                double[] num2 = new double[totalNum2];

                for (int i = 0; i < totalNum2; i++) {
                    System.out.println("Digite o valor do " + (i + 1) + "º número: ");
                    num2[i] = entrada.nextDouble();
                }

                double sub = 0.0;
                for (double nums2 : num2) {
                    sub -= nums2;
                }

                System.out.println("A subtração deu o resultado: " + sub);
                break;
            case 3:
                System.out.println("Você escolheu multiplicação!");
                System.out.println("Digite o total de números: ");
                int totalNum3 = entrada.nextInt();

                double[] num3 = new double[totalNum3];

                for (int i = 0; i < totalNum3; i++) {
                    System.out.println("Digite o valor do " + (i + 1) + "º número: ");
                    num3[i] = entrada.nextDouble();
                }

                double mult = 0.0;
                for (double nums3 : num3) {
                    mult *= nums3;
                }

                System.out.println("A multiplicação deu o resultado: " + mult);
                break;
            case 4:
                System.out.println("Você escolheu divisão!");
                System.out.println("Digite o total de números: ");
                int totalNum4 = entrada.nextInt();

                double[] num4 = new double[totalNum4];

                for (int i = 0; i < totalNum4; i++) {
                    System.out.println("Digite o valor do " + (i + 1) + "º número: ");
                    num4[i] = entrada.nextDouble();
                }

                double div = 0.0;
                for (double nums4 : num4) {
                    div /= nums4;
                }

                System.out.println("A divisão deu o resultado: " + div );

                break;

            default: // ""else""
                System.out.println("Essa operação não existe!");
        }
    }}
