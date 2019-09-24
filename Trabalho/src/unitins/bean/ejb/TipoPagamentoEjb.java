package unitins.bean.ejb;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import unitins.model.TipoPagamento;

@Stateful
public class TipoPagamentoEjb {
	
	@PersistenceContext
	private EntityManager em;

	public void inserir(TipoPagamento tipoPagamento) {
		em.persist(tipoPagamento);
	}

	public void alterar(TipoPagamento tipoPagamento) {
		em.merge(tipoPagamento);
	}

	public void deletar(TipoPagamento tipoPagamento) {
		
		tipoPagamento = carregar(tipoPagamento.getId());
		em.remove(tipoPagamento);
	}

	public TipoPagamento carregar(Integer id) {
		return em.find(TipoPagamento.class, id);
	}
}
