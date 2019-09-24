package unitins.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import unitins.bean.ejb.ClienteEjb;
import unitins.model.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean {
	@EJB
	private ClienteEjb clienteEjb;
	Cliente cliente = new Cliente();
	
	
	public void inserir() {
		clienteEjb.inserir(cliente);
	}

	public void alterar() {
		clienteEjb.alterar(cliente);
	}

	public void deletar() {
		clienteEjb.deletar(cliente);
	}

	public void carregar() {

	}
	
	public String zerar() {
		cliente = new Cliente();
		return null;
	}

	public ClienteEjb getClienteEjb() {
		return clienteEjb;
	}

	public void setClienteEjb(ClienteEjb clienteEjb) {
		this.clienteEjb = clienteEjb;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
