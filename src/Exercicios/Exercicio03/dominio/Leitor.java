package Exercicios.Exercicio03.dominio;

import java.util.Scanner;

public class Leitor {
    private int valorA;
    private int valorB;

    public void leitorDeValores(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        valorA = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valorB = scanner.nextInt();
        scanner.close();
    }

    public void calcular(){
        int c;
        String calculo;
        if(valorA == valorB){
            c = valorA + valorB;
            calculo = "soma";
        }else {
            c = valorA * valorB;
            calculo = "multiplicação";
        }
        System.out.println("A "+calculo+" entre o valor A e B é "+c);
    }
}
