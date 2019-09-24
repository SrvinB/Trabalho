package unitins.bean.ejb;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import unitins.model.Cliente;


@Stateful
public class ClienteEjb {
	
	@PersistenceContext
	private EntityManager em;

	public void inserir(Cliente cliente) {
		em.persist(cliente);
	}

	public void alterar(Cliente cliente) {
		em.merge(cliente);
	}

	public void deletar(Cliente cliente) {
		
		cliente = carregar(cliente.getId());
		em.remove(cliente);
	}

	public Cliente carregar(Integer id) {
		return em.find(Cliente.class, id);
	}
	
	
}
