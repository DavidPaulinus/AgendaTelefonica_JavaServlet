package br.com.agendaTelefonica.service.util;

public class Conversor {

	public static String ehFavorito(Boolean boo) {
		if (boo == true) {
			return "FAVORITO!";
		} else {
			return "";
		}
	}
	
	public static Boolean ehFavorito(String str) {
		return str.equalsIgnoreCase("favorito");
	}
}
