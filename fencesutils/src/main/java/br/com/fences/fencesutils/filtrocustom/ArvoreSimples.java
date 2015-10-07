package br.com.fences.fencesutils.filtrocustom;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Estrutura simplista de arvore unidirecional, apenas para transferencia de valores.
 * 
 */
public class ArvoreSimples implements Serializable, Comparable<ArvoreSimples>{

	private static final long serialVersionUID = 4987732610615996350L;

	private String chave;
	private String valor;
	private Set<ArvoreSimples> filhos = new LinkedHashSet<>();
	
	public ArvoreSimples(){}
	
	public ArvoreSimples(String chave, String valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Set<ArvoreSimples> getFilhos() {
		return filhos;
	}
	public void setFilhos(Set<ArvoreSimples> filhos) {
		this.filhos = filhos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArvoreSimples other = (ArvoreSimples) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArvoreSimples [chave=" + chave + ", valor=" + valor + ", filhos=" + filhos + "]";
	}

	@Override
	public int compareTo(ArvoreSimples o) {
		return this.valor.compareToIgnoreCase(o.getValor());
	}

	
	
	
}
