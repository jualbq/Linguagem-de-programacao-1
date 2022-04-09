package br.uniesp.poo.Lista1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double reajuste = 0.2;
        double salarioReajustado;

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe seu salário: ");
        double salario = leitor.nextDouble();

        while(!"fim".equals(nome)){

            if(salario<500){
                salarioReajustado = (salario*reajuste) + salario;
                System.out.println(nome + ", você recebeu um aumento. Seu salário passou a ser: R$" + salarioReajustado);
            }else {
                System.out.println(nome + ", você não recebeu aumento esse mês.");
            }
            System.out.println("Informe seu nome: ");
            nome = leitor.next();

            if("fim" .equals(nome)){
            break;
            }
            System.out.println("Informe seu salário: ");
            salario = leitor.nextDouble();
        }
        System.out.println("Programa encerrado!");
        leitor.close();

    }

}
