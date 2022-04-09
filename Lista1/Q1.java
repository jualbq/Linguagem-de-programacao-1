package br.uniesp.poo.Lista1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        float creditosGalacticos;
        float aumento;
        float percentual;
        String nome;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Informe seus créditos galácticos: ");
        creditosGalacticos = leitor.nextFloat();
        System.out.println("Informe o percentual de aumennto: ");
        percentual = leitor.nextFloat();


        aumento = ((creditosGalacticos * percentual)/100) + creditosGalacticos;

        System.out.println(nome + " com o aumento você receberá: " + aumento + " créditos galácticos.");

    }
}
