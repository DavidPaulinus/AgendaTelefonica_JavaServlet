package br.com.agendaTelefonica.modelo;

public class Contato{
	private Long id;
	private String nome;
	private String numero;
	private String tipo;
	private String email;
	private Boolean favorito;

	public Contato() {
		super();
	}

	public Contato(Long id, String nome, String numero, String tipo, String email, Boolean favorito) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
		this.email = email;
		this.favorito = favorito;
	}
	
	public Contato(String nome, String numero, String tipo, String email, Boolean favorito) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
		this.email = email;
		this.favorito = favorito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getFavorito() {
		return favorito;
	}

	public void setFavorito(Boolean favorito) {
		this.favorito = favorito;
	}

}
