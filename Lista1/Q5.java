package br.uniesp.poo.Lista1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float salarioBruto;
        float valorPrestacao;
        float valorMaximo;

        System.out.println("Informe o salário");
        salarioBruto = leitor.nextFloat();
        System.out.println("Informe o valor da prestação");
        valorPrestacao = leitor.nextFloat();

        valorMaximo = salarioBruto * 0.3f;

        if(valorPrestacao>valorMaximo){
            System.out.println(("Empréstimo negado!"));
        }else{
            System.out.println("Empréstimo liberado!");
        }
    }
}
