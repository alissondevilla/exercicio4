package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int numero = 0;
		int soma = 0;
		int multiplo3 = 0;
		int multiplo5 = 0;
				
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		for (int index = 1; index < numero; index++) {
			multiplo3 = index * 3;
			
			if (multiplo3 < numero) {
				soma += multiplo3;
			}
			
			multiplo5 = index * 5;
			
			if (multiplo5 < numero) {
				soma += multiplo5;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos multiplos de 3 ou 5 com base no número " + numero + ": " + soma);
	}

}