package br.com.fences.fencesutils.verificador;

import java.util.Collection;
import java.util.Map;

public class Verificador {
	
	public static boolean isValorado(final String arg)
	{
		boolean ret = true;
		if (arg == null || arg.trim().isEmpty())
		{
			ret = false;
		}
		return ret;
	}
	
	public static boolean isValorado(final Collection<?> arg)
	{
		boolean ret = true;
		if (arg == null || arg.isEmpty())
		{
			ret = false;
		}
		return ret;
	}
	
	public static boolean isValorado(final Map<?, ?> arg)
	{
		boolean ret = true;
		if (arg == null || arg.isEmpty())
		{
			ret = false;
		}
		return ret;
	}
	
	public static boolean isInteiro(String str) {
        try 
        {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }

	public static boolean isPossuiErroRest(String json)
	{
		boolean possui = false;
		if (isValorado(json))
		{
			if (json.contains("codigoErro") || json.contains("mensagemErro"))
			{	//-- atributos da classe Erro
				possui = true;
			}
		}
		return possui;
	}
}
