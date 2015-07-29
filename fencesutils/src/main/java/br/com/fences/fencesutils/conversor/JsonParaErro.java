package br.com.fences.fencesutils.conversor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.fences.fencesutils.rest.tratamentoerro.entidade.Erro;
import br.com.fences.fencesutils.verificador.Verificador;

public class JsonParaErro {

	public static Erro converter(String json)
	{
		Erro erro = new Erro();
		if (Verificador.isValorado(json))
		{
			Gson gson = new GsonBuilder().create();
			erro = gson.fromJson(json, Erro.class);
		}
		return erro;
	}
	
}
