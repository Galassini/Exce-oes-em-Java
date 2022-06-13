package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes02 {
public static void main(String[] args) {
		
		try {
			
			 String nome = JOptionPane.showInputDialog("Informe o seu Nome: ");
			 
			 //Apresentando o nome em miusculo
			 JOptionPane.showMessageDialog(null, "Seu Nome: " + nome.toUpperCase());
			 
			 int idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a sua Idade: "));
			 JOptionPane.showMessageDialog(null, "Sua Idade é:  " + idade);
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		
			
			
			
		}
		
	
	 
	}

}



