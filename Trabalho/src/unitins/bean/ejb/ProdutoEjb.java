package unitins.bean.ejb;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import unitins.model.Produto;

@Stateful
public class ProdutoEjb {

	@PersistenceContext
	private EntityManager em;

	public void inserir(Produto produto) {
		em.persist(produto);
	}

	public void alterar(Produto produto) {
		em.merge(produto);
	}

	public void deletar(Produto produto) {
		
		produto = carregar(produto.getId());
		em.remove(produto);
	}

	public Produto carregar(Integer id) {
		return em.find(Produto.class, id);
	}

}
