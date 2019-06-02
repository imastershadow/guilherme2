/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraAdapter;



import javax.swing.JOptionPane;

import calculadoraBOH.ICalculator;
import calculadoraBOH.IConvertResult;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculadoraBOH.CalculatorImpl calc = new calculadoraBOH.CalculatorImpl();
		calculadoraBOH.ConvertResultImpl convert = new calculadoraBOH.ConvertResultImpl();
		int Valor1 =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "
				+ "D \n \n "));
		
		int Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "
				+ "D \n \n "));
		
		int option =Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação que deseja fazer: "
				+ "D \n \n  1- Somar (+) \n 2- Dividir (/) \n 3- Multiplicar (*) \n 4-Subtrair (-)"));
		
		double resultado=0;
		
		switch (option) {
		case 1:
			resultado= calc.sum(Valor1, Valor2);
			break;

		default:
			break;
		}


		
		
		int option2 =Integer.parseInt(JOptionPane.showInputDialog("Como deseja ver o resultado: "
				+ "D \n \n  1- Binario \n 2- Hexadecimal \n 3- Octal"));
		
		double resultado2=0;
		
		switch (option2) {
		case 1:
			JOptionPane.showMessageDialog(null, " Binário \n"+ convert.valueToBinario(new Integer((int) resultado)));
			break;
                        
                case 2:
                    JOptionPane.showMessageDialog(null, "Hexadecimal \n"+ Integer.toHexString(Double.valueOf(resultado).intValue()));
                    break;
                 
                case 3:
                    JOptionPane.showMessageDialog(null, "Octal \n" + Integer.toOctalString(Double.valueOf(resultado).intValue()));
                    
                    
          
                    
                    

		default:
			break;
		}
		
	}

}
