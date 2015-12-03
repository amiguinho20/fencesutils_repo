package br.com.fences.fencesutils.conversor;

import java.util.Random;

import br.com.fences.fencesutils.formatar.FormatarPrintStackTrace;

public class ExcecaoParaMessageHtml {
	
	public static String converter(Throwable e)
	{
		int idErro = new Random().nextInt(1000); 
		
		StringBuilder stackTrace = new StringBuilder();
		//stackTrace.append("<br/>");
		stackTrace.append("<label class=\"collapsemessage\" for=\"_" + idErro + "\">Exibir pilha de erro</label>");
		stackTrace.append("<input id=\"_" + idErro + "\" type=\"checkbox\">");
		stackTrace.append("<div>");
		stackTrace.append(FormatarPrintStackTrace.formatar(e));
		stackTrace.append("</div>");
		
		return stackTrace.toString();
	}

}
