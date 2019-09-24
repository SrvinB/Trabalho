package unitins.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import unitins.bean.ejb.PedidoEjb;
import unitins.model.Pedido;

@ManagedBean
@SessionScoped
public class PedidoBean {
	
	@EJB
	private PedidoEjb pedidoEjb;
	Pedido pedido = new Pedido();
	
	
	public void inserir() {
		pedidoEjb.inserir(pedido);
	}

	public void alterar() {
		pedidoEjb.alterar(pedido);
	}

	public void deletar() {
		pedidoEjb.deletar(pedido);
	}

	public void carregar() {

	}
	
	public String zerar() {
		pedido = new Pedido();
		return null;
	}

	public PedidoEjb getPedidoEjb() {
		return pedidoEjb;
	}

	public void setPedidoEjb(PedidoEjb pedidoEjb) {
		this.pedidoEjb = pedidoEjb;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
}
