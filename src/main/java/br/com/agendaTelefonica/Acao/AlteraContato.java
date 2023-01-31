package br.com.agendaTelefonica.Acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.modelo.Contato;
import br.com.agendaTelefonica.service.BancoDeDados;
import br.com.agendaTelefonica.service.util.Conversor;
import br.com.agendaTelefonica.service.util.Execucao;

public class AlteraContato implements Execucao{

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("\\Alterando Contato");
		
		Contato contt = new BancoDeDados().buscarPorId(Long.parseLong(req.getParameter("id")));
		
		contt.setNome(req.getParameter("nome"));
		contt.setNumero(req.getParameter("numero"));
		contt.setTipo(req.getParameter("tipo"));
		contt.setEmail(req.getParameter("email"));
		contt.setFavorito(Conversor.ehFavorito(req.getParameter("favorito")));
		
		System.out.println("/Alterado Contato");
		
		resp.sendRedirect("entrada?acao=ListaContatos");
	}

}
