package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor) {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PlayStation 5");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente1 = new ComponentePojo();
        componente1.setComponenteNome("Controle");
        componente1.setComponenteQuantidade(1);

        componentes.add(componente1);

        ComponentePojo componente2 = new ComponentePojo();
        componente2.setComponenteNome("Memory Card");
        componente2.setComponenteQuantidade(2);

        componentes.add(componente2);

        produto.setComponentes(componentes);

        return produto;
    }
}
