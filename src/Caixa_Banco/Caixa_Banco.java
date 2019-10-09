/* Este código tem como finalidade receber um valor monetário
 * e verificar quantas e quais notas deveriam ser desembolsadas
 * do caixa eletronico para fornecer o valor ao usuário
 */

package Caixa_Banco;

import javax.swing.JOptionPane;

public class Caixa_Banco {

	public static void main(String[] args) {
		float ValSol = 0;
		short Cedulas[] = new short[7], CedT =0;
		String Quant ="", CedN[] = {"100", "50", "20", "10", "5", "2", "1"};
		
		
		ValSol = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor a ser sacado:", "BancoWestAmeric", 3));
		
		//Os blocos seguintes servirão para verificar quantas cédulas de cada valor serão necessarias
		
		while(ValSol >= 100) {//Notas de 100
			ValSol -= 100;
			Cedulas[0]++;
			CedT++; 
		}
		while(ValSol>= 50) {//Notas de 50
			ValSol -= 50;
			Cedulas[1]++;
			CedT++;
		}
		while(ValSol>= 20) {//Notas de 20
			ValSol -= 20;
			Cedulas[2]++;
			CedT++;
		}
		while(ValSol>= 10) {//Notas de 10
			ValSol -= 10;
			Cedulas[3]++;
			CedT++;
		}
		while(ValSol >= 5) {//Notas de 5
			ValSol -= 5;
			Cedulas[4]++;
			CedT++;
		}
		while(ValSol >= 2) {//Notas de 2
			ValSol -= 2;
			Cedulas[5]++;
			CedT++;
		}
		while(ValSol >= 1) {//Notas de 1
			ValSol -= 1;
			Cedulas[6]++;
			CedT++;
		}
		
		
		
		for(int x =0; x < 7; x++) {//Colocando quantia de cédulas e total em uma mesma variavel(no caso String) para facilitar sua apresentação
			if(x==6)
				Quant += "Quatidade de cédulas de " + CedN[x] + ": " + Cedulas[x] + "\nQuantidade Total : " + CedT;
			else
				Quant += "Quatidade de cédulas de " + CedN[x] + ": " + Cedulas[x] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Resultado\n\n" + Quant, "BancoWestAmeric", 1);

	}

}
