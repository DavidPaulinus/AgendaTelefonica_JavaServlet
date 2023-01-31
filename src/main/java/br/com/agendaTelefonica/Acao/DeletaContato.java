package br.com.agendaTelefonica.Acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaTelefonica.service.BancoDeDados;
import br.com.agendaTelefonica.service.util.Execucao;

public class DeletaContato implements Execucao {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("\\Deletando Contato");
		new BancoDeDados().deletar(Long.parseLong(req.getParameter("id")));

		resp.sendRedirect("entrada?acao=ListaContatos");

		System.out.println("/Deletado Contato");

	}

}
