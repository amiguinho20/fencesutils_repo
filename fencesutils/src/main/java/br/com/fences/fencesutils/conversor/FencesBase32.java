package br.com.fences.fencesutils.conversor;

import org.apache.commons.codec.binary.Base32;

import br.com.fences.fencesutils.verificador.Verificador;

public class FencesBase32 {

	public static String encode(String entrada)
	{
		String saida = null;
		if (Verificador.isValorado(entrada))
		{
			byte[] bytes = entrada.getBytes();
			Base32 base32 = new Base32();
			saida = base32.encodeAsString(bytes);
		}
		return saida;
	}
	
	public static String decode(String entrada)
	{
		String saida = null;
		if (Verificador.isValorado(entrada))
		{			
			Base32 base32 = new Base32();
			byte[] bytes = base32.decode(entrada);
			saida = new String(bytes);
		}
		return saida;
	}
	
}
