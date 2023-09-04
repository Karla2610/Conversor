package conversor_modelo;

import javax.swing.JTextArea;

public class ConversorTemperatura {

	public void GradosCelsiusAGradosFahrenheit(double valor, JTextArea jTextArea) {
		double temperatura = (valor * 9/5) + 32;
		jTextArea.append(String.valueOf( temperatura + "°F"));
	}
	
	public void GradosCelsiusAGradosKelvin(double valor, JTextArea jTextArea) {
		double temperatura = valor + 273.15;
		jTextArea.append(String.valueOf( temperatura + " K"));
	}
	
	public void GradosCelsiusAGradosRankine(double valor, JTextArea jTextArea) {
		double temperatura = (valor + 273.15) * 9/5;
		jTextArea.append(String.valueOf( temperatura + "°R"));
	}
	
	public void GradosFahrenheitAGradosCelsius(double valor, JTextArea jTextArea) {
		double temperatura = (valor - 32) * 5/9;
		temperatura = (double) Math.round(temperatura *100d)/100;  
		jTextArea.append(String.valueOf( temperatura + "\u00B0C"));
	}
	
	public void GradosFahrenheitAGradosKelvin(double valor, JTextArea jTextArea) {
		double temperatura =  (valor + 459.67) * 5/9;
		temperatura = (double) Math.round(temperatura *100d)/100; 
		jTextArea.append(String.valueOf( temperatura + " K "));
	}
	
	public void GradosFahrenheitAGradosRankine(double valor, JTextArea jTextArea) {
		double temperatura = valor + 459.67;
		temperatura = (double) Math.round(temperatura *100d)/100; 
		jTextArea.append(String.valueOf( temperatura + "°R"));
	}
	
	public void GradosKelvinAGradosCelsius(double valor, JTextArea jTextArea) {
		double temperatura = valor - 273.15;
		temperatura = (double) Math.round(temperatura *100d)/100;  
		jTextArea.append(String.valueOf( temperatura + "\u00B0C"));
	}
	
	public void GradosKelvinAGradosFahrenheit(double valor, JTextArea jTextArea) {
		double temperatura =(valor * 9/5) - 459.67;
		jTextArea.append(String.valueOf( temperatura + "°F"));
	}
	
	public void GradosKelvinAGradosRankine(double valor, JTextArea jTextArea) {
		double temperatura = valor * 9/5;
		temperatura = (double) Math.round(temperatura *100d)/100; 
		jTextArea.append(String.valueOf( temperatura + "°R"));
	}
	
	public void GradosRankineAGradosCelsius(double valor, JTextArea jTextArea) {
		double temperatura = (valor - 491.67) * 5/9 ;
		temperatura = (double) Math.round(temperatura *100d)/100;  
		jTextArea.append(String.valueOf( temperatura + "\u00B0C"));
	}
	
	public void GradosRankineAGradosKelvin(double valor, JTextArea jTextArea) {
		double temperatura = valor * 5/9;
		temperatura = (double) Math.round(temperatura *100d)/100; 
		jTextArea.append(String.valueOf( temperatura + " K"));
	}
	
	public void GradosRankineAGradosFahrenheit(double valor, JTextArea jTextArea) {
		double temperatura = valor - 459.67;
		jTextArea.append(String.valueOf( temperatura + "°F"));
	}
	
}
