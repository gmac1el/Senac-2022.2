package entidades;

import java.util.ArrayList;

public class conjuntoProdutos {
	private ArrayList<Produto> produtos;
	
	public conjuntoProdutos() {
		this.produtos = new ArrayList<Produto>() ;
	}
	
	public void inserirProduto(Produto novoProduto){
		boolean existeCodigo = false;
		
		for(Produto produto : produtos) {
			if(produto.getCodigo() == novoProduto.getCodigo()) {
				existeCodigo = true;
				break;
			}else {
				existeCodigo = false;
			}
		}
		if(!existeCodigo)
		{
			produtos.add(novoProduto);
			System.out.println("Novo produto inserido!");
		}else
		{
			System.out.println("Código do produto ja existente!");
		}
		
		
	}
	
	public void removerProduto(Produto produto)
	{
		produtos.remove(produto);
	}

	public boolean atualizarProduto(int index, Produto novoProduto ) {
		if(!this.produtos.contains(novoProduto)) {
			this.produtos.set(index, novoProduto);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public void mostrarProdutos() {
		for(Produto produto: this.produtos) {
			System.out.println(produto);
		}
	}
	public boolean atualizarPreco(Produto produto, float valorPorcentagem) {
		if(this.produtos.contains(produto)) {
			produto.atualizarPreco(valorPorcentagem);
			return true;
		}else{
			return false;
		}
		
	}
	
	

}