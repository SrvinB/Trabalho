package unitins.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TipoPagamento {
	@Id
	@GeneratedValue
	Integer id;
	String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
