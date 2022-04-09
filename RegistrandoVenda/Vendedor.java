package RegistrandoVenda;

public class Vendedor {
    private String nome;
    private String endereco;
    private int codigo;
    private double comissaoPorcentagem;

    //Construtor
    public Vendedor(String nome, String endereco, int codigo) {
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
    }


    //Get and Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getComissaoPorcentagem() {
        return comissaoPorcentagem;
    }

    public void setComissaoPorcentagem(double comissaoPorcentagem) {
        this.comissaoPorcentagem = comissaoPorcentagem;
    }
}
