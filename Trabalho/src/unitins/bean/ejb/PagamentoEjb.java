package unitins.bean.ejb;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import unitins.model.Pagamento;

@Stateful
public class PagamentoEjb {
	@PersistenceContext
	private EntityManager em;

	public void inserir(Pagamento pagamento) {
		em.persist(pagamento);
	}

	public void alterar(Pagamento pagamento) {
		em.merge(pagamento);
	}

	public void deletar(Pagamento pagamento) {
		
		pagamento = carregar(pagamento.getId());
		em.remove(pagamento);
	}

	public Pagamento carregar(Integer id) {
		return em.find(Pagamento.class, id);
	}

	
	
	
}
