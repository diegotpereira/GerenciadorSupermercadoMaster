package br.com.java.view;

import java.util.ArrayList;

import br.com.java.model.Produtos;


public class CadastroProdutos extends javax.swing.JFrame{
	
	ArrayList<Produtos> lista = new ArrayList<>();
	
	 public CadastroProdutos(ArrayList list) {
	        inicializarComponentes();
	        this.lista = list;
	        preencheLista();
	        
	    }

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		
	}

	private void preencheLista() {
		// TODO Auto-generated method stub
		for(int i=0; i<this.lista.size();i++){
            
            this.cb_produtos.addItem(this.lista.get(i).getDescricao());
        }
		
	}

}
