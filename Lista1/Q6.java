package br.uniesp.poo.Lista1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float totalAlunosReprovados = 0;
        float TotalAlunosAprovados = 0;
        float notaUm;
        float notaDois;
        float media;
        for(int x = 1; x < 7 ; x++){
            System.out.println("Dados do Aluno "+ x);
            System.out.println("Informe a not 1 " + x);
            notaUm = leitor.nextFloat() ;
            System.out.println("Informe a not 2 " + x);
            notaDois = leitor.nextFloat();
            media  = (notaUm + notaDois)/2;

            if(media >= 7){
                ++totalAlunosReprovados ;
            }
        }
    }

}





