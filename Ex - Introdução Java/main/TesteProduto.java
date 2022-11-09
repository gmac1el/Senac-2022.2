package main;

import entidades.*;

public class TesteProduto {

	public static void main(String[] args) 
	{
		
	Fornecedor forn1 = new Fornecedor("1234321","(81)98765-4321" ,"Zé Maria");
	Fornecedor forn2 = new Fornecedor("543212345", "(81)91234-5678", "Cláudio");
		
		
	Produto prod1 = new Produto(1,"TV LCD",3500f, forn1);
	Produto prod2 = new Produto(2,"Notebook",2000f, forn2);
	Produto prod3 = new Produto(3,"Impressora",232f, forn2);
	Produto prod4 = new Produto(4,"Celular ASUS",870f, forn1);
		
		
	conjuntoProdutos c1 = new conjuntoProdutos();
		
	System.out.println("Inserção de Produtos");
	c1.inserirProduto(prod1);
	c1.inserirProduto(prod2);
	c1.inserirProduto(prod3);
		
	c1.inserirProduto(prod1);
		
		
	System.out.println("\n\nFornecedores e Produtos");
	System.out.println(forn1);
	System.out.println(forn2);
	System.out.println(prod1);
	System.out.println(prod2);
	System.out.println(prod3);
		
		
	System.out.println("\n\nAtualização de Preços do Produto 2");
	System.out.println("PREÇO ATUAL: " + prod2.getValor());
	prod2.atualizarPreco(10f);
	System.out.println("PREÇO ATUALIZADO: " + prod2.getValor());

		
	System.out.println("\n-~-~-Produtos-~-~-\n");
	c1.mostrarProdutos();
		
	c1.atualizarProduto(0, prod4);
	System.out.println("\n-~-~-Produtos Atualizados-~-~-\n");
	c1.mostrarProdutos();
		
	}

}