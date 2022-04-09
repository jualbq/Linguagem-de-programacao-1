package br.uniesp.poo.Lista1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 0 a 10: ");
        numero = leitor.nextInt();

        if(numero %2 == 0){
            System.out.println("O número informado é par!");

        }else{
            System.out.printf("O número informado é ímpar!");
        }
    }
}
