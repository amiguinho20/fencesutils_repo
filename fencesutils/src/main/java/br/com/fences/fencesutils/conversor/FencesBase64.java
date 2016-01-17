package br.com.fences.fencesutils.conversor;

import org.apache.commons.codec.binary.Base64;

import br.com.fences.fencesutils.verificador.Verificador;

public class FencesBase64 {

	public static String encode(String entrada)
	{
		String saida = null;
		if (Verificador.isValorado(entrada))
		{
			byte[] bytes = entrada.getBytes();
			Base64 base64 = new Base64();
			saida = base64.encodeAsString(bytes);
		}
		return saida;
	}
	
	public static String decode(String entrada)
	{
		String saida = null;
		if (Verificador.isValorado(entrada))
		{			
			Base64 base64 = new Base64();
			byte[] bytes = base64.decode(entrada);
			saida = new String(bytes);
		}
		return saida;
	}
	
}
