package unitins.bean.ejb;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import unitins.model.Pedido;

@Stateful
public class PedidoEjb {
	@PersistenceContext
	private EntityManager em;

	public void inserir(Pedido pedido) {
		em.persist(pedido);
	}

	public void alterar(Pedido pedido) {
		em.merge(pedido);
	}

	public void deletar(Pedido pedido) {
		
		pedido = carregar(pedido.getId());
		em.remove(pedido);
	}

	public Pedido carregar(Integer id) {
		return em.find(Pedido.class, id);
	}

	
	
}
