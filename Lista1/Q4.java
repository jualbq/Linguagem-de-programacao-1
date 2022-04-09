package br.uniesp.poo.Lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int refri = 3;
        double gasolina = 2.50;

        System.out.println("Com quantos litros vc abasteceu seu veículo? ");
        int litros = leitor.nextInt();
        double conta = (refri*2) + (litros*gasolina);

        System.out.println("O valor total da sua compra foi de: R$" + conta);
    }
}
