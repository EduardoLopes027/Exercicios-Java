package Exercicios.Exercicio04.dominio;

import java.util.Scanner;

public class Leitor {
    private int valor;

    public void lerValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        valor = scanner.nextInt();
        scanner.close();
    }

    public void imprimirAntecessorSucessor(){
        System.out.println("O antecessor de "+valor+" é "+ (valor - 1));
        System.out.println("O sucessor de "+valor+" é "+ (valor + 1));
    }
}
