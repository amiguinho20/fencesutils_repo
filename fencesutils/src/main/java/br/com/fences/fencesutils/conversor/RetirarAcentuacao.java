package br.com.fences.fencesutils.conversor;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class RetirarAcentuacao {

	public static String converter(String arg)
	{
	    String normalizador = Normalizer.normalize(arg, Normalizer.Form.NFD);
	    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	    String retorno = pattern.matcher(normalizador).replaceAll("");
	    return retorno;
	}
}
