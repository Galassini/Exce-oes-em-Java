package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes03 {
	/*
	 * Quando tivermos mais de um bloco catch, a ordem em que são os escritos
	 * é importante. Os mais especificos devem ser os primeios , pois
	 * a busca pela combinação ocorre de cima para baixo.
	 */
	public static void main(String[] args) {

		try {

			String nome = JOptionPane.showInputDialog("Informe o seu Nome: ");

			// Apresentando o nome em miusculo
			JOptionPane.showMessageDialog(null, "Seu Nome: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a sua Idade: "));
			JOptionPane.showMessageDialog(null, "Sua Idade é:  " + idade);

		} catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Exceção Geral" + ex.getMessage());

		}

	}
}
