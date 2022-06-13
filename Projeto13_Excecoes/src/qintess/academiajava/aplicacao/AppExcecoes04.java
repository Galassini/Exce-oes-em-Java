package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes04 {
	public static void main(String[] args) {

		/*
		 * Quando tivermos mais de um bloco catch, a ordem em que s�o os escritos �
		 * importante. Os mais especificos devem ser os primeios , pois a busca pela
		 * combina��o ocorre de cima para baixo.
		 */

		try {

			String nome = JOptionPane.showInputDialog("Informe o seu Nome: ");

			// Apresentando o nome em miusculo
			JOptionPane.showMessageDialog(null, "Seu Nome: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a sua Idade: "));
			JOptionPane.showMessageDialog(null, "Sua Idade �:  " + idade);

		} catch (NullPointerException | NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Exce��o Geral" + ex.getMessage());

		}

	}
}
