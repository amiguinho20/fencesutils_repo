package br.com.fences.fencesutils.formatar;

import java.io.PrintWriter;
import java.io.StringWriter;

public class FormatarPrintStackTrace {

	public static String formatar(Throwable exception) {
	    StringWriter stringWriter = new StringWriter();
	    exception.printStackTrace(new PrintWriter(stringWriter, true));
	    return stringWriter.toString();
	}
	
}
