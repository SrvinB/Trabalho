package unitins.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import unitins.bean.ejb.PagamentoEjb;
import unitins.model.Pagamento;

@ManagedBean
@SessionScoped
public class PagamentoBean {
	@EJB
	private PagamentoEjb pagamentoEjb;
	Pagamento pagamento = new Pagamento();
	
	
	public void inserir() {
		pagamentoEjb.inserir(pagamento);
	}

	public void alterar() {
		pagamentoEjb.alterar(pagamento);
	}

	public void deletar() {
		pagamentoEjb.deletar(pagamento);
	}

	public void carregar() {

	}
	
	public String zerar() {
		pagamento = new Pagamento();
		return null;
	}

	public PagamentoEjb getPagamentoEjb() {
		return pagamentoEjb;
	}

	public void setPagamentoEjb(PagamentoEjb pagamentoEjb) {
		this.pagamentoEjb = pagamentoEjb;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}
