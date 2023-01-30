package br.com.agendaTelefonica.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.service.BancoDeDados;

@WebServlet("/ListarContatos")
public class ListaContatos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/ListaContatos.jsp");
		req.setAttribute("lista", new BancoDeDados().listar());
		rd.forward(req, resp);
		
		
	}

}
