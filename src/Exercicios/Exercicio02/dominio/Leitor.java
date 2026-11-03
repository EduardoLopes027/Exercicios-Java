package Exercicios.Exercicio02.dominio;

import java.util.Scanner;

public class Leitor {
    private int valor;

    public void leitorDeValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        valor = scanner.nextInt();
        scanner.close();
    }

    public void parOuImpar() {
        if (valor % 2 == 0) {
            System.out.println("O valor " + valor + " é par");
        } else {
            System.out.println("O valor " + valor + " é ímpar");
        }
    }

    public void positivoOuNegativo() {
        if (valor < 0) {
            System.out.println("O valor " + valor + " é negativo");
        } else if(valor > 0 ) {
            System.out.println("O valor " + valor + " é positivo");
        }else {
            System.out.println("O valor é igual a zero");
        }
    }
}
