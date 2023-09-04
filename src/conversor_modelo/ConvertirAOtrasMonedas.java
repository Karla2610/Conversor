package conversor_modelo;

import javax.swing.JTextArea;

public class ConvertirAOtrasMonedas {

	public void ConvertirDolaresAColones(double valor, JTextArea jTextArea) {
		double monedaDolar = valor * 536.72;	
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;  
		jTextArea.append(String.valueOf(monedaDolar));
	}
	
	public void ConvertirEurosAColones(double valor, JTextArea jTextArea) {
		double monedaEuro = valor * 582.08;	
		monedaEuro = (double) Math.round(monedaEuro *100)/100;
		jTextArea.append(String.valueOf(monedaEuro));
	}
	
	public void ConvertirYenJaponesAColones(double valor, JTextArea jTextArea) {
		double monedaYen = valor * 3.68;	
		monedaYen = (double) Math.round(monedaYen *100d)/100;  
		jTextArea.append(String.valueOf(monedaYen));
	}
	
	public void ConvertirFrancoZuizoAColones(double valor, JTextArea jTextArea) {
		double monedaFranco = valor * 609.71;	
		monedaFranco = (double) Math.round(monedaFranco *100d)/100;  
		jTextArea.append(String.valueOf(monedaFranco));
	}
	
	public void ConvertirLibraEsterlinaAColones(double valor, JTextArea jTextArea) {
		double monedaLibra = valor * 683.26;	
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;  
		jTextArea.append(String.valueOf(monedaLibra));
	}
	
	public void ConvertirWonSurCoreanoAColones(double valor, JTextArea jTextArea) {
		double monedaWon = valor  * 0.40;	
		monedaWon = (double) Math.round(monedaWon *100d)/100;  
		jTextArea.append(String.valueOf(monedaWon));
	}
	
	public void ConvertirPesoMexicanoAColones(double valor, JTextArea jTextArea) {
		double monedaPeso = valor * 31.74;	
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;
		jTextArea.append(String.valueOf(monedaPeso));
	}
	
}
