package Exercicios.Exercicio07.dominio;

import java.util.Scanner;

public class LeitorDeValoresBooleanos {
    private Scanner scanner = new Scanner(System.in);
    private boolean primeiroValor;
    private boolean segundoValor;


    public void lerValores(){
        System.out.print("Digite o primeiro valor (true/false): ");
        primeiroValor = scanner.nextBoolean();
        System.out.print("Digite o segundo valor (true/false): ");
        segundoValor = scanner.nextBoolean();
    }

    public void detectar(){
        if(primeiroValor && segundoValor){
            System.out.println("Ambos os valores são VERDADEIROS.");
        }else if (!primeiroValor && !segundoValor){
            System.out.println("Ambos os valores são FALSOS.");
        }else {
            System.out.println("Os valores são diferentes.");
        }
    }

}
