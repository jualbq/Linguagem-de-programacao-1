package RegistrandoVenda;

public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private double valorTotal;
    private double valorDescontado;
    private double comissaoValor;
    private int quantidadeDeItens;

    //Construtor





    //Get e Set
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public double efetuarDesconto(double porcentagem){
        valorDescontado = produto.getPrecoVenda() * porcentagem / 100;
        if(produto.getPrecoVenda() - valorDescontado < produto.getPrecoCompra()){
            valorDescontado = produto.getPrecoVenda() - produto.getPrecoCompra();
        }
        return valorDescontado;
    }

    public double calcularValorTotal(){
        valorTotal = (produto.getPrecoVenda() - valorDescontado) * quantidadeDeItens;
        return valorTotal;
    }

    public double calcularComissao(){
        comissaoValor = (valorTotal * vendedor.getComissaoPorcentagem()) / 100;
        if(produto.isPromocao()) {
            comissaoValor = comissaoValor/2;
        }

        return comissaoValor;
    }



    public void imprimir(){
        System.out.println("Código: " + vendedor.getCodigo()  + "\n" + "Nome do Vendedor: " + vendedor.getNome() + "\n" + "Comissão: " + vendedor.getComissaoPorcentagem());
        System.out.println("Quantidade de itens vendidos: " + quantidadeDeItens);
        System.out.println("Código do produto: " + produto.getCodigo() + "\n" + "Descrição do produto: " + produto.getDescricao() );
        System.out.println("Valor da venda do produto: " + produto.getPrecoVenda());
        if (produto.isPromocao()){
            System.out.println("Promoção: Sim");

        }else{
            System.out.println("Promoção: Não");
        }
        System.out.println("Desconto sobre o produto: " + (valorDescontado));
        System.out.println("Total: " + valorTotal);
        System.out.println("");
    }


}
