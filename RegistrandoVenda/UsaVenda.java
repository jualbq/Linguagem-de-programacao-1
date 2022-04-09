package RegistrandoVenda;

public class UsaVenda {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa",200, 30, false, 666);
        Vendedor vendedor1 = new Vendedor("Xandinho do Python", "Rua Jaguamaica, berço dos loucos, 157, João Pessoa/PB", 24);
        Venda venda1 = new Venda();

        venda1.setProduto(produto1);
        venda1.setVendedor(vendedor1);
        venda1.setQuantidadeDeItens(2);
        venda1.calcularValorTotal();
        venda1.getVendedor().setComissaoPorcentagem(10);
        System.out.println("Valor da comissão: " + venda1.calcularComissao());
        venda1.imprimir();


        Produto produto2 = new Produto("Vestido", 100, 80, true, 321);
        Vendedor vendedor2 = new Vendedor("Camilinha do Java", "Rua Baldo do rio, 171, Goiana/PE", 123);
        Venda venda2 = new Venda();

        venda2.setProduto(produto2);
        venda2.setVendedor(vendedor2);
        venda2.setQuantidadeDeItens(3);
        venda2.efetuarDesconto(10);
        venda2.calcularValorTotal();
        venda2.getVendedor().setComissaoPorcentagem(15);
        System.out.println("Valor da comissão: " + venda2.calcularComissao());
        venda2.imprimir();

        Venda venda3 = new Venda();
        venda3.setVendedor(vendedor2);
        venda3.setProduto(produto2);
        venda3.setQuantidadeDeItens(2);
        venda3.efetuarDesconto(30);
        venda3.calcularValorTotal();
        System.out.println("Valor da comissão: " + venda3.calcularComissao());
        venda3.imprimir();



    }
}
