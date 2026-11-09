package Exercicios.Exercicio06.dominio;

import java.util.Scanner;

public class Reajuste {
    private double valor;
    private static final double PERCENTUAL_REAJUSTE = 0.05;
    private final Scanner scanner = new Scanner(System.in);

    public void lerValores(){
        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();
        scanner.close();
    }

    public void reajustarValor(){
        valor = valor + (valor * PERCENTUAL_REAJUSTE);
        System.out.printf("O seu valor com reajuste de 5%% é: %.2f%n", valor);
    }
}
