package unitins.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import unitins.bean.ejb.TipoPagamentoEjb;
import unitins.model.TipoPagamento;

@ManagedBean
@SessionScoped
public class TipoPagamentoBean {
	@EJB
	private TipoPagamentoEjb tipoPagamentoEjb;
	TipoPagamento tipoPagamento = new TipoPagamento();

	public void inserir() {
		tipoPagamentoEjb.inserir(tipoPagamento);
	}

	public void alterar() {
		tipoPagamentoEjb.alterar(tipoPagamento);
	}

	public void deletar() {
		tipoPagamentoEjb.deletar(tipoPagamento);
	}

	public void carregar() {

	}

	public String zerar() {
		tipoPagamento = new TipoPagamento();
		return null;
	}

	public TipoPagamentoEjb getTipoPagamentoEjb() {
		return tipoPagamentoEjb;
	}

	public void setTipoPagamentoEjb(TipoPagamentoEjb tipoPagamentoEjb) {
		this.tipoPagamentoEjb = tipoPagamentoEjb;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	

}
