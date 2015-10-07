package br.com.fences.fencesutils.filtrocustom;

public class FiltroCondicao {

	private String rotulo;
	private TipoFiltro tipo;
	private String atributoDePesquisa;
	
	private String valorTexto;
	private TipoPesquisaTexto valorTextoTipo;
	
	private String valorListaSelecaoUnicaIdSelecionado;
	private String valorListaSelecaoUnicaDescricaoSelecionado;

	private String valorIntervaloDataInicial;
	private String valorIntervaloDataFinal;
	
	private String valorGeoRaioLatitude;
	private String valorGeoRaioLongitude;
	private String valorGeoRaioEmMetros;
	private String valorGeoRaioEndereco;

	private ArvoreSimples arvoreSelecao;

	public String getRotulo() {
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}

	public TipoFiltro getTipo() {
		return tipo;
	}

	public void setTipo(TipoFiltro tipo) {
		this.tipo = tipo;
	}

	public String getAtributoDePesquisa() {
		return atributoDePesquisa;
	}

	public void setAtributoDePesquisa(String atributoDePesquisa) {
		this.atributoDePesquisa = atributoDePesquisa;
	}

	public String getValorTexto() {
		return valorTexto;
	}

	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}

	public String getValorListaSelecaoUnicaIdSelecionado() {
		return valorListaSelecaoUnicaIdSelecionado;
	}

	public void setValorListaSelecaoUnicaIdSelecionado(String valorListaSelecaoUnicaIdSelecionado) {
		this.valorListaSelecaoUnicaIdSelecionado = valorListaSelecaoUnicaIdSelecionado;
	}

	public String getValorListaSelecaoUnicaDescricaoSelecionado() {
		return valorListaSelecaoUnicaDescricaoSelecionado;
	}

	public void setValorListaSelecaoUnicaDescricaoSelecionado(String valorListaSelecaoUnicaDescricaoSelecionado) {
		this.valorListaSelecaoUnicaDescricaoSelecionado = valorListaSelecaoUnicaDescricaoSelecionado;
	}

	public String getValorIntervaloDataInicial() {
		return valorIntervaloDataInicial;
	}

	public void setValorIntervaloDataInicial(String valorIntervaloDataInicial) {
		this.valorIntervaloDataInicial = valorIntervaloDataInicial;
	}

	public String getValorIntervaloDataFinal() {
		return valorIntervaloDataFinal;
	}

	public void setValorIntervaloDataFinal(String valorIntervaloDataFinal) {
		this.valorIntervaloDataFinal = valorIntervaloDataFinal;
	}

	public ArvoreSimples getArvoreSelecao() {
		return arvoreSelecao;
	}

	public void setArvoreSelecao(ArvoreSimples arvoreSelecao) {
		this.arvoreSelecao = arvoreSelecao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arvoreSelecao == null) ? 0 : arvoreSelecao.hashCode());
		result = prime * result + ((atributoDePesquisa == null) ? 0 : atributoDePesquisa.hashCode());
		result = prime * result + ((rotulo == null) ? 0 : rotulo.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((valorIntervaloDataFinal == null) ? 0 : valorIntervaloDataFinal.hashCode());
		result = prime * result + ((valorIntervaloDataInicial == null) ? 0 : valorIntervaloDataInicial.hashCode());
		result = prime * result + ((valorListaSelecaoUnicaDescricaoSelecionado == null) ? 0
				: valorListaSelecaoUnicaDescricaoSelecionado.hashCode());
		result = prime * result
				+ ((valorListaSelecaoUnicaIdSelecionado == null) ? 0 : valorListaSelecaoUnicaIdSelecionado.hashCode());
		result = prime * result + ((valorTexto == null) ? 0 : valorTexto.hashCode());
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
		FiltroCondicao other = (FiltroCondicao) obj;
		if (arvoreSelecao == null) {
			if (other.arvoreSelecao != null)
				return false;
		} else if (!arvoreSelecao.equals(other.arvoreSelecao))
			return false;
		if (atributoDePesquisa == null) {
			if (other.atributoDePesquisa != null)
				return false;
		} else if (!atributoDePesquisa.equals(other.atributoDePesquisa))
			return false;
		if (rotulo == null) {
			if (other.rotulo != null)
				return false;
		} else if (!rotulo.equals(other.rotulo))
			return false;
		if (tipo != other.tipo)
			return false;
		if (valorIntervaloDataFinal == null) {
			if (other.valorIntervaloDataFinal != null)
				return false;
		} else if (!valorIntervaloDataFinal.equals(other.valorIntervaloDataFinal))
			return false;
		if (valorIntervaloDataInicial == null) {
			if (other.valorIntervaloDataInicial != null)
				return false;
		} else if (!valorIntervaloDataInicial.equals(other.valorIntervaloDataInicial))
			return false;
		if (valorListaSelecaoUnicaDescricaoSelecionado == null) {
			if (other.valorListaSelecaoUnicaDescricaoSelecionado != null)
				return false;
		} else if (!valorListaSelecaoUnicaDescricaoSelecionado.equals(other.valorListaSelecaoUnicaDescricaoSelecionado))
			return false;
		if (valorListaSelecaoUnicaIdSelecionado == null) {
			if (other.valorListaSelecaoUnicaIdSelecionado != null)
				return false;
		} else if (!valorListaSelecaoUnicaIdSelecionado.equals(other.valorListaSelecaoUnicaIdSelecionado))
			return false;
		if (valorTexto == null) {
			if (other.valorTexto != null)
				return false;
		} else if (!valorTexto.equals(other.valorTexto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FiltroCondicao [rotulo=" + rotulo + ", tipo=" + tipo + ", atributoDePesquisa=" + atributoDePesquisa
				+ ", valorTexto=" + valorTexto + ", valorListaSelecaoUnicaIdSelecionado="
				+ valorListaSelecaoUnicaIdSelecionado + ", valorListaSelecaoUnicaDescricaoSelecionado="
				+ valorListaSelecaoUnicaDescricaoSelecionado + ", valorIntervaloDataInicial="
				+ valorIntervaloDataInicial + ", valorIntervaloDataFinal=" + valorIntervaloDataFinal
				+ ", arvoreSelecao=" + arvoreSelecao + "]";
	}

	public TipoPesquisaTexto getValorTextoTipo() {
		return valorTextoTipo;
	}

	public void setValorTextoTipo(TipoPesquisaTexto valorTextoTipo) {
		this.valorTextoTipo = valorTextoTipo;
	}

	public String getValorGeoRaioLatitude() {
		return valorGeoRaioLatitude;
	}

	public void setValorGeoRaioLatitude(String valorGeoRaioLatitude) {
		this.valorGeoRaioLatitude = valorGeoRaioLatitude;
	}

	public String getValorGeoRaioLongitude() {
		return valorGeoRaioLongitude;
	}

	public void setValorGeoRaioLongitude(String valorGeoRaioLongitude) {
		this.valorGeoRaioLongitude = valorGeoRaioLongitude;
	}

	public String getValorGeoRaioEmMetros() {
		return valorGeoRaioEmMetros;
	}

	public void setValorGeoRaioEmMetros(String valorGeoRaioEmMetros) {
		this.valorGeoRaioEmMetros = valorGeoRaioEmMetros;
	}

	public String getValorGeoRaioEndereco() {
		return valorGeoRaioEndereco;
	}

	public void setValorGeoRaioEndereco(String valorGeoRaioEndereco) {
		this.valorGeoRaioEndereco = valorGeoRaioEndereco;
	}
	

	
}
