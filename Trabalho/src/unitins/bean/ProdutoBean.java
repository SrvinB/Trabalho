package unitins.bean;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import unitins.bean.ejb.ProdutoEjb;
import unitins.model.Pedido;
import unitins.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoBean {
	
	@EJB
	private ProdutoEjb produtoEjb;
	Produto produto = new Produto();
	
	
	public void inserir() {
		produtoEjb.inserir(produto);
	}

	public void alterar() {
		produtoEjb.alterar(produto);
	}

	public void deletar() {
		produtoEjb.deletar(produto);
	}

	public void carregar() {

	}
	
	public String zerar() {
		produto = new Produto();
		return null;
	}
	
	public ProdutoEjb getProdutoEjb() {
		return produtoEjb;
	}
	public void setProdutoEjb(ProdutoEjb produtoEjb) {
		this.produtoEjb = produtoEjb;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
