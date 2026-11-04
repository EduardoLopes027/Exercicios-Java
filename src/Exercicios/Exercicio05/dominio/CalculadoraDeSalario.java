package Exercicios.Exercicio05.dominio;

import java.util.Scanner;

public class CalculadoraDeSalario {
    private final double salarioMinimo = 1293.20;
    private double salarioUsuario;
   private final Scanner scanner = new Scanner(System.in);

    public void lerSalario(){
        System.out.print("Digite o seu salário: ");
        salarioUsuario = scanner.nextDouble();
    }

    public void converterSalarios(){
        double quantidade = salarioUsuario / salarioMinimo;
        System.out.printf("R$%.2f equivale a %.2f salário(s) mínimo(s)", salarioUsuario, quantidade);
    }
}
