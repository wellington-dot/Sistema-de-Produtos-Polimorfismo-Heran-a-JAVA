package com.produtos.ex.produtos;

public class produtosUsados extends produto{
    private String dataFabricacao;

    public produtosUsados(String nomeProduto, Double precoProduto, String dataFabricacao){
        super(nomeProduto,precoProduto);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

}
