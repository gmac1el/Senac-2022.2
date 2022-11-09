// PRODUTO
package entidades;

 public class Produto {
   
  private int codigo;
  private String Nome; 
  private float valor;
  private Fornecedor fornecedor; 

  public Produto() {

  }

  public Produto (int codigo, String nome, float valor, Fornecedor fornecedor) {
  this.codigo = codigo;
	this.Nome = nome;
	this.valor = valor;
	this.fornecedor = fornecedor;
    
  }
   
   
  public int getCodigo() {
	return codigo;
  }
   
  public void setCodigo(int codigo) {
	this.codigo = codigo;
  }
   
  public String getNome() {
	return Nome;
  }
   
  public void setNome(String nome) {
	Nome = nome;
  }
   
  public float getValor() {
	return valor;
  }
   
  public void setValor(float valor) {
	this.valor = valor;
  }
   
  public Fornecedor getFornecedor() {
	return fornecedor;
  }
   
  public void setFornecedor(Fornecedor fornecedor) {
	this.fornecedor = fornecedor;
  }

  public String toString() {
		return "Produto: " + Nome + " | valor: " + valor + " | " + fornecedor;
	}
	
	public void atualizarPreco(float valorPorcentual)
	{
		valor += valor * valorPorcentual /100 ;
	}

 
 }