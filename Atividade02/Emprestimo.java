package br.uniesp.poo.Atividade02;

public class Emprestimo {
    String nomeUsuario;
    int idade;
    float valorEmprestimo;
    float percJurosMes;
    int mesesPagar;

    public void imprimir(){
        System.out.println("Nome do usuário: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do empréstimo: " + valorEmprestimo);
        System.out.println("Preço do juros mensal: " + percJurosMes);
        System.out.println("Quantidade de parcelas: " + mesesPagar);
    }

    public void calcularEmprestimo(){
        if (idade >= 18 || idade < 23){
            valorEmprestimo += (valorEmprestimo / mesesPagar) * percJurosMes;
        }else{
            if(idade > 23 || idade <= 33){
                valorEmprestimo = (valorEmprestimo * 10)/100;
            }
        }
    }

}
