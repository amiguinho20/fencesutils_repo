package br.com.fences.fencesutils.conversor;

public class Capitalizar {

	/**
	 * Faz igual ao CSS: text-transform: capitalize
	 */
	public static String converter(String value) {

		value = value.toLowerCase();
		
		char[] array = value.toCharArray();

		array[0] = Character.toUpperCase(array[0]);

		for (int i = 1; i < array.length; i++) {
			if (Character.isWhitespace(array[i - 1])) {
				array[i] = Character.toUpperCase(array[i]);
			}
		}

		return new String(array);
	}

}
