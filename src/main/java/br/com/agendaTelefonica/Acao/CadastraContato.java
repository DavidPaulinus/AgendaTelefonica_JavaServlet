package br.com.agendaTelefonica.Acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.modelo.Contato;
import br.com.agendaTelefonica.service.BancoDeDados;
import br.com.agendaTelefonica.service.util.Conversor;
import br.com.agendaTelefonica.service.util.Execucao;

public class CadastraContato implements Execucao {
	
	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("\\Cadastrando");
		new BancoDeDados().salvar(new Contato(req.getParameter("nome"), 
				req.getParameter("numero"), 
				req.getParameter("tipo"),
				req.getParameter("email"), 
				Conversor.ehFavorito(req.getParameter("favorito"))));
		
		resp.sendRedirect("entrada?acao=ListaContatos");
		System.out.println("/Cadastrado");
		
	}

}
