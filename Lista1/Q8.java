package br.uniesp.poo.Lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "";
        String sexo;
        int idade;
        int idadeH = 0;
        float altura;
        float peso;
        int totalpacientes = 0;
        int mulheres = 0;
        int homens = 0;
        int idade1825 = 0;
        int pMaisVelho = 0;
        String nomeMaisVelho = "";
        int mMaisVelha = 0;
        String nomeMulherVelha = "";

        while (true){

            System.out.println("Informe seu nome: ");
            nome = leitor.nextLine();
            if(nome.equals("fim")){
                break;
            }
            System.out.println("Informe seu sexo: ");
            sexo = leitor.nextLine();
            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(leitor.nextLine());
            System.out.println("Informe o seu peso: ");
            peso = Float.parseFloat(leitor.nextLine());
            System.out.println("Informe a sua altura: ");
            altura = Float.parseFloat(leitor.nextLine());

            totalpacientes++;

            if ("feminino".equals(sexo)) {
                if (altura >= 1.60 && altura <= 1.70 && peso > 70) {
                    mulheres++;
                }
                if (idade > mMaisVelha) {
                    mMaisVelha = idade;
                    nomeMulherVelha = nome;
                }
            }
            if ("masculino".equals(sexo)) {
                idadeH += idade;
                homens++;
            }

            if (idade >= 18 && idade <= 25) {
                idade1825++;
            }

            if (idade > pMaisVelho) {
                pMaisVelho = idade;
                nomeMaisVelho = nome;
            }
        }

        System.out.println("Foram cadastrados: " + totalpacientes + " pacientes.");
        if (homens != 0) {
            System.out.println("A média de idade dos homens é igual a: " + idadeH / homens);

        } else {
            System.out.println("Não foram cadastrados pacientes homens.");
        }

        System.out.println("Quantidade de mulheres com altura entre 1.60m e 1.70m e com peso acima de 70kg é: " + mulheres);
        System.out.println("Qantidade de pessoas entre 18 e 25 anos é de: " + idade1825);
        System.out.println("O nome do paciente mais velho é: " + nomeMaisVelho);
        System.out.println("O nome da mulher mais velha é: " + nomeMulherVelha);

    }
}



