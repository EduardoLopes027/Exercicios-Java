package Exercicios.Exercicio01.dominio;

import java.util.Scanner;

public class Leitor {
    private double primeiroValor;
    private double segundoValor;
    private double terceiroValor;

    public void leitorDeValores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        this.primeiroValor = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        this.segundoValor = scanner.nextDouble();
        System.out.println("Digite o terceiro valor: agira");
        this.terceiroValor = scanner.nextDouble();
    }

    public double soma(){
        return primeiroValor + segundoValor;
    }

    public void comparador(){
        double soma = soma();
        System.out.println("A soma entre o primeiro e o segundo valor é "+ soma);
        if(soma > terceiroValor){
            System.out.println(soma + " é maior que "+ terceiroValor);
        } else if (soma == terceiroValor) {
            System.out.println(soma + " é igual a "+ terceiroValor);
        }else {
            System.out.println(soma + " é menor que "+ terceiroValor);
        }
    }

}
