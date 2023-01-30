package br.com.agendaTelefonica.Acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.service.BancoDeDados;
import br.com.agendaTelefonica.service.util.Execucao;

public class ListaContatos implements Execucao {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("\\Listando");
		
		RequestDispatcher rd = req.getRequestDispatcher("/ListaContatos.jsp");
		req.setAttribute("lista", new BancoDeDados().listar());
		rd.forward(req, resp);
				
		System.out.println("/Listado");
	}

}
