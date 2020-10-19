package br.com.java.view;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.java.model.Produtos;
import br.com.java.model.Usuario;
import br.com.java.model.UsuarioAdmin;
import br.com.java.model.UsuarioComum;

public class Login extends javax.swing.JFrame {
	
	 private ArrayList<Usuario> contasComuns = new ArrayList<>();
     private ArrayList<Usuario> contasAdmin = new ArrayList<>();
     private ArrayList<Usuario> contas = new ArrayList<>();
     private ArrayList<Produtos> lista = new ArrayList<>();
	
	
	
	public Login() {
		
		inicializarComponente();
		UsuarioAdmin ad1 = new UsuarioAdmin("Christopher", "123456789");
        UsuarioAdmin ad2 = new UsuarioAdmin("Prof", "1234");
        UsuarioComum c1 = new UsuarioComum("cliente", "963");
        UsuarioComum c2 = new UsuarioComum("aluno", "741");
         
        contasAdmin.add(ad1);
        contasAdmin.add(ad2);
        contasComuns.add(c1);
        contasComuns.add(c2);
        contas.add(ad1);
        contas.add(ad2);
        contas.add(c1);
        contas.add(c2);
		
	}



	private void inicializarComponente() {
		// TODO Auto-generated method stub
		Text_Nome = new javax.swing.JTextField();
        Text_cpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JB_Acessar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(700, 400));

        Text_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        JB_Acessar.setText("Acessar");
        JB_Acessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_AcessarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_cpf)
                    .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(JB_Acessar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(JB_Acessar)
                .addContainerGap())
        );

        pack();
	}
	 protected void Text_NomeActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}



	protected void JB_AcessarMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
        String nome, cpf;
        
        nome = this.Text_Nome.getText();
        cpf = this.Text_cpf.getText();
        
        // Logica para fazer autenticação para usuario comum ou admin
        int condicao = 1;
       
        for(int i = 0;i < contas.size();i++){
            if(condicao == 1 ){
            for(int j = 0;j < contasComuns.size();j++){
            if((contasComuns.get(j).nome.equals(nome)==true) && (contasComuns.get(j).cpf.equals(cpf)) ){
//                 TelaCompra t = new TelaCompra(lista, contasComuns.get(j));
//                 limparCampos();
//                 t.setVisible(true);
//                 condicao = 0;
                break;
            }
            }
                for(int z = 0;z < contasAdmin.size();z++){
                 if((contasAdmin.get(z).nome.equals(nome)==true) && (contasAdmin.get(z).cpf.equals(cpf))){
                     CadastroProdutos cp = new CadastroProdutos(lista);
                     limparCampos();
                     cp.setVisible(true);
                     condicao = 0;
                break;
                }
                }
            }
            else
                break;
        }
        if(condicao == 1){
            JOptionPane.showMessageDialog(null, "Usuario Invalido");
            limparCampos();
		
	
        }
        
	}
	private void limparCampos() {
		// TODO Auto-generated method stub
		this.Text_Nome.setText("");
	    this.Text_cpf.setText("");
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Acessar;
    private javax.swing.JTextField Text_Nome;
    private javax.swing.JTextField Text_cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
	

}
