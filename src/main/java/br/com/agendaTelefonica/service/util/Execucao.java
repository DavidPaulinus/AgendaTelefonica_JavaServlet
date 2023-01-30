package br.com.agendaTelefonica.service.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Execucao {

	String executar(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException;

}
