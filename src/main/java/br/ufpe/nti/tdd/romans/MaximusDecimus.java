package br.ufpe.nti.tdd.romans;

import java.util.ArrayList;
import java.util.List;

/**
 *  converte numeros
 *
 */
public class MaximusDecimus {
	
	public static final List<String> mapCaracteres = new ArrayList<String>();
	
	static{
		mapCaracteres.add("I");
		mapCaracteres.add("V");
		mapCaracteres.add("X");
		mapCaracteres.add("L");
		mapCaracteres.add("C");
		mapCaracteres.add("D");
		mapCaracteres.add("M");
	}
	
	/*
	 * 1253
	 * 
	 * 1253 div 1000  > 0 = M
	 * 1253 % 1000 = 253
	 * 
	 * 253 div 500 > 0   =  
	 * 
	 * 253 div 100 > 0  =  CC
	 * 253 % 100 = 53
	 * 
	 * 53 div 50 > 0 = L
	 */
	
	public static String convertRoman(int value) {
		String roman = "";
		int valor = value;
		int resto = 0;
		
		int milhar = (int) Math.floor(value/1000);
		resto = value%1000;
		
		int centena = (int) Math.floor(resto/100);
		resto = resto%100;
		
		int dezena = (int) Math.floor(resto/10);
		resto = resto%10;//unidade
		
		
		// Traduzir milhar
		for(int i = 0; i < milhar; i++){
			roman+="M";
		}
		
		// traduzir centena
		// Se centena unidade = C
		resto = centena%5;
		if(resto < 4){
			for(int i = 0;i < resto;i++){
				roman += "C";
			}
		}else{
			roman += 
		}
		
		//int dezena = value/100;
		//valor = valor%10;

		if(value%1000 == 0 ) {
			roman = "M";
		} else
		
		if(valor==1){
			roman = "I";
		} else if (valor==2) {
			roman = "II";
		} else if (valor==3) {
			roman = "III";
		} else if (valor==4) {
			roman = "IV";
		} else if (valor==5) {
			roman = "V";
		} else if (valor==6) {
			roman = "VI";
		} else if (valor==7) {
			roman = "VII";
		} else if (valor==8) {
			roman = "VIII";
		} else if (valor==9) {
			roman = "IX";
		} else {
			roman = "X";
		}
		
		return roman;
	}

}
