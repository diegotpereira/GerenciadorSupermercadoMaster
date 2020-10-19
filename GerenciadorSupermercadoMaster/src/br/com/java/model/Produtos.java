package br.com.java.model;

public class Produtos {
	
	private String codigo;
	private String descricao;
	private String medida;
	private String valor;
	
	public Produtos(String codigo, String descricao, String medida, String valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.medida = medida;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
