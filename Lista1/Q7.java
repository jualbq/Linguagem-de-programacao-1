package br.uniesp.poo.Lista1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int diaria = 40;
        int servico1 = 15;
        int servico2 = 8;
        int valor = 0;
        int total = 0;

        System.out.println("Informe o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe quantos dias você passou na nossa pousada: ");
        int dias = leitor.nextInt();

        while(true){
            if(dias < 10){
                valor = (servico1 * dias) + (diaria * dias);
                total += valor;

                System.out.println(nome + ", o valor da sua conta deu: R$ " + valor);


            }else if(dias >= 10){
                valor = (servico2 * dias) + (diaria * dias);
                total += valor;

                System.out.println(nome + ", o valor da sua conta deu: R$ " + valor);

            }
            System.out.println("Digite 1 para inserir novos dados ou 2 para finalizar o programa: ");
            int digitar = leitor.nextInt();

            if(digitar == 1){
                System.out.println("Informe o seu nome: ");
                nome = leitor.next();

                System.out.println("Informe quantos dias você passou na nossa pousada: ");
                dias = leitor.nextInt();

            }else{
                System.out.println("Programa encerrado");
                break;
            }

        }
        System.out.println("Total arrecadado pela pousada: " + total);


    }
}