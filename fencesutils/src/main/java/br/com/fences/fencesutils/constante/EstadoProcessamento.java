package br.com.fences.fencesutils.constante;

public enum EstadoProcessamento {

	OK("OK"), PROCESSAR("PROCESSAR"), REPROCESSAR("REPROCESSAR"), ERRO("ERRO");

	private final String valor;

	EstadoProcessamento(String valor) {
		this.valor = valor;
	}

	public static EstadoProcessamento converterDeValor(String valor) {
		if (valor != null) {
			for (EstadoProcessamento estadoProcessamento : values()) {
				if (estadoProcessamento.valor.equals(valor)) {
					return estadoProcessamento;
				}
			}
		}
		throw new IllegalArgumentException("Estado de processamento invalido: " + valor);
	}

	public String converterParaValor() {
		return valor;
	}
}
