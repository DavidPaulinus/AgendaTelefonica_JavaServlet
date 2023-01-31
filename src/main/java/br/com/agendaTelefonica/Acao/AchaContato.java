package br.com.agendaTelefonica.Acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.modelo.Contato;
import br.com.agendaTelefonica.service.BancoDeDados;
import br.com.agendaTelefonica.service.util.Execucao;

public class AchaContato implements Execucao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("\\Achando Contato");
		
		Contato contt = new BancoDeDados().buscarPorId(Long.parseLong(req.getParameter("id")));
		System.out.println("  "+contt.getNome());
		
		RequestDispatcher rd = req.getRequestDispatcher("AlterarContato.jsp");
		req.setAttribute("contato", contt);
		rd.forward(req, resp);
			
		System.out.println("/Achado Contato");		
	}
	
}
