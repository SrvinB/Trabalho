package unitins.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Pagamento {
	@Id
	@GeneratedValue
	Integer id;
	Date data;
	TipoPagamento tipoPagemnto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoPagamento getTipoPagemnto() {
		return tipoPagemnto;
	}
	public void setTipoPagemnto(TipoPagamento tipoPagemnto) {
		this.tipoPagemnto = tipoPagemnto;
	}
}
