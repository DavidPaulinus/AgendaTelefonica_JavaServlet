package br.com.agendaTelefonica.service;

import java.util.ArrayList;
import java.util.List;

import br.com.agendaTelefonica.modelo.Contato;

public class BancoDeDados {
	private static List<Contato> listContt = new ArrayList<>();

	private static Long chaveSequencial = 1l;

	static {
		listContt.add(new Contato(chaveSequencial++, "Lil Nas X", "00 000000", "Celular", "lil@email.com", false));
		listContt.add(new Contato(chaveSequencial++, "B.I.G", "11 1111111", "Celular", "notorius@email.com", false));
		listContt.add(new Contato(chaveSequencial++, "Lil Peep", "77 777777", "Celular", "peep@email.com", true));
	}

	public void salvar(Contato contt) {
		listContt.add(contt);
	}

	public List<Contato> listar() {
		return listContt;
	}
	
	public List<Contato> listarFavoritos() {
		return listContt.stream().filter(x -> x.getFavorito()==true).toList();
	}
	
	public Contato buscarPorId(Long id) {
		Integer value = null;
		for (int i = 0; i < listContt.size(); i++) {
			if (listContt.get(i).getId() == id) {
				value = i;
			}
		}
		return listContt.get(value);
	}
	
	public void deletar(Long id) {
		listContt.removeIf(x -> x.getId() == id);
	}
}
