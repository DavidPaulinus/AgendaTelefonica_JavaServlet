package br.com.agendaTelefonica.Apllication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.Acao.CadastraContato;
import br.com.agendaTelefonica.Acao.ListaContatos;

@WebServlet("/entrada")
public class Program extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("acao");
		
		if(param.equals("CadastraContato")) {
			new CadastraContato().executar(request,response);
		}
		if(param.equals("ListaContatos")) {
			new ListaContatos().executar(request,response);
		}
	}
}
