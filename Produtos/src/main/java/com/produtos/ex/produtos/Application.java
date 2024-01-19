package com.produtos.ex.produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<produto> produtosList = new ArrayList<>();

        System.out.print("Quantos produtos: ");
        int nmrProdutos = input.nextInt();

        for(int i=0;i<nmrProdutos;i++){
            System.out.println("Produto "+ (i+1) + " info:");
            System.out.print("Nome: ");
            input.nextLine();
            String nomeProduto = input.nextLine();
            System.out.print("Preço: ");
            Double precoProduto = input.nextDouble();

            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char ch = input.next().charAt(0);

            if(ch == 'c'){
                produto comumProduto = new produto(nomeProduto,precoProduto);
                produtosList.add(comumProduto);

            } else if(ch == 'u') {
                System.out.print("Data: ");
                input.nextLine();
                String dataProduto = input.nextLine();

                produto usadoProduto = new produtosUsados(nomeProduto,precoProduto,dataProduto);
                produtosList.add(usadoProduto);

            } else if(ch == 'i'){
                System.out.print("Taxa Alfandega: ");
                Double taxaProduto = input.nextDouble();

                produto importadoProduto = new produtoImportado(nomeProduto,precoProduto,taxaProduto);
                produtosList.add(importadoProduto);
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇOS");
        for(produto c : produtosList){
            System.out.println(c.getNomeProduto() + " , " + c.custoProduto());
        }
    }
}
