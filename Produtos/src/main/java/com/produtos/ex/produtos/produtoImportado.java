package com.produtos.ex.produtos;

public class produtoImportado extends produto{
    private Double taxaAlfandega;


    public produtoImportado(String nomeProduto, Double precoProduto, Double taxaAlfandega){
        super(nomeProduto,precoProduto);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public double custoProduto(){
        return super.custoProduto() + taxaAlfandega;
    }
}
