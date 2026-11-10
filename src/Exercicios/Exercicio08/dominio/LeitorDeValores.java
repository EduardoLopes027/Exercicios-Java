package Exercicios.Exercicio08.dominio;

import java.util.Scanner;

public class LeitorDeValores {
    private int valorA;
    private int valorB;
    private int valorC;
    private int maior;
    private int medio;
    private int menor;
    private Scanner scanner = new Scanner(System.in);


    public void lerValores(){
        System.out.print("Digite o primeiro valor: ");
        valorA = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valorB = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valorC = scanner.nextInt();
        scanner.close();
        compararValores();
    }

    public void compararValores(){
        if (valorA > valorB && valorA > valorC){
            maior = valorA;
        } else if (valorB > valorA && valorB > valorC) {
            maior = valorB;
        }else {
            maior = valorC;
        }

        if (valorA < valorB && valorA < valorC){
            menor = valorA;
        } else if (valorB < valorA && valorB < valorC) {
            menor = valorB;
        }else {
            menor = valorC;
        }

        if (valorA < maior && valorA > menor){
            medio = valorA;
        } else if (valorB < maior && valorB > menor) {
            medio = valorB;
        }else{
            medio = valorC;
        }
    }

    public void exibirValores(){
        System.out.println(maior);
        System.out.println(medio);
        System.out.println(menor);
    }
}
