package br.com.java.model;

import javax.swing.JOptionPane;

public class UsuarioAdmin extends Usuario implements Admin{
	
	public UsuarioAdmin(){}

	public UsuarioAdmin(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    public void boasVindas(){
	        JOptionPane.showMessageDialog(null, "Boas vindas administrdor " + this.nome);
	    }

}
