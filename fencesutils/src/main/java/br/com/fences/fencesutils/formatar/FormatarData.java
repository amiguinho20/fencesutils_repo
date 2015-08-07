package br.com.fences.fencesutils.formatar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatarData {
	
	public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";
	public static final String yyyyMMdd = "yyyyMMdd";
	/**
	 * o cifrao $ representa a barra /
	 */
	public static final String dd$MM$yyyy = "dd/MM/yyyy";
	/**
	 * o cifrao $ representa a barra / e os dois pontos :
	 */
	public static final String dd$MM$yyyy_HH$mm$ss = "dd/MM/yyyy HH:mm:ss";
	public static final String HHmm = "HHmm";
	
	private static DateFormat tipo01 = new SimpleDateFormat(yyyyMMddHHmmss);
	private static DateFormat tipo02 = new SimpleDateFormat(yyyyMMdd);
	private static DateFormat tipo03 = new SimpleDateFormat(dd$MM$yyyy);
	private static DateFormat tipo04 = new SimpleDateFormat(dd$MM$yyyy_HH$mm$ss);
	private static DateFormat tipo05 = new SimpleDateFormat(HHmm);
	
	/**
	 * yyyyMMddHHmmss
	 */
	public static DateFormat getAnoMesDiaHoraMinutoSegundoConcatenados()
	{
		return tipo01;
	}
	
	/**
	 * yyyyMMdd
	 */
	public static DateFormat getAnoMesDiaContatenado()
	{
		return tipo02;
	}
	
	/**
	 * dd/MM/yyyy
	 */
	public static DateFormat getDiaMesAnoComBarras()
	{
		return tipo03;
	}
	
	/**
	 * dd/MM/yyyy HH:mm:ss
	 */
	public static DateFormat getDiaMesAnoComBarrasEHoraMinutoSegundoComDoisPontos()
	{
		return tipo04;
	}
	
	/**
	 * HHmm
	 */
	public static DateFormat getHoraMinutoContatenado()
	{
		return tipo05;
	}
	
	public static String dataHoraCorrente()
	{
		String ultimaAtualizacao = getAnoMesDiaHoraMinutoSegundoConcatenados().format(new Date());
		return ultimaAtualizacao; 
	}
}
