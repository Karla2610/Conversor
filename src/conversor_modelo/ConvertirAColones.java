package conversor_modelo;

import javax.swing.JTextArea;

public class ConvertirAColones {

	public void ConvertirColonesADolares(double valor, JTextArea jTextArea) {
		double monedaDolar = valor / 536.72;	
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;  
		jTextArea.append(String.valueOf(monedaDolar));
	}
	
	public void ConvertirColonesAEuros(double valor, JTextArea jTextArea) {
		double monedaEuro = valor * 0.0017;	
		monedaEuro = (double) Math.round(monedaEuro *100)/100; 
		jTextArea.append(String.valueOf(monedaEuro));
	}
	
	public void ConvertirColonesAYenJapones(double valor, JTextArea jTextArea) {
		double monedaYen = valor * 0.27;	
		monedaYen = (double) Math.round(monedaYen *100d)/100; 
		jTextArea.append(String.valueOf(monedaYen));
	}
	
	public void ConvertirColonesAFrancoZuizo(double valor, JTextArea jTextArea) {
		double monedaFranco = valor * 0.0016;	
		monedaFranco = (double) Math.round(monedaFranco *100d)/100;  
		jTextArea.append(String.valueOf(monedaFranco));
	}
	
	public void ConvertirColonesALibraEsterlina(double valor, JTextArea jTextArea) {
		double monedaLibra = valor  * 0.0015;	
		monedaLibra = (double) Math.round(monedaLibra *100d)/100; 
		jTextArea.append(String.valueOf(monedaLibra));
	}
	
	public void ConvertirColonesAWonSurCoreano(double valor, JTextArea jTextArea) {
		double monedaWon = valor  * 2.48;	
		monedaWon = (double) Math.round(monedaWon *100d)/100;  
		jTextArea.append(String.valueOf(monedaWon));
	}
	
	public void ConvertirColonesAPesoMexicano(double valor, JTextArea jTextArea) {
		double monedaPeso = valor * 0.031;	
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;  
		jTextArea.append(String.valueOf(monedaPeso));	}
	
}
