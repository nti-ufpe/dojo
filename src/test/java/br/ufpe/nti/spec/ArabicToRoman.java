package br.ufpe.nti.spec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufpe.nti.tdd.romans.MaximusDecimus;

public class ArabicToRoman {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConverteDecimais() {
		String expected = "I";
		int value = 1;
		String returned = MaximusDecimus.convertRoman(value);
		assertEquals(expected, returned);
		
		expected = "II";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "III";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "IV";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "V";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "VI";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "VII";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "VIII";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "IX";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
		expected = "X";
		returned = MaximusDecimus.convertRoman(++value);
		assertEquals(expected, returned);
		
	}
	
	@Test	
	public void testeBase100(){
		String expected = "C";
		int value = 100;
		String returned = MaximusDecimus.convertRoman(value);
		assertEquals(expected, returned);
		
		expected = "CC";
		returned = MaximusDecimus.convertRoman(2*value);
		assertEquals(expected, returned);

		expected = "CCC";
		returned = MaximusDecimus.convertRoman(3*value);
		assertEquals(expected, returned);

		expected = "CL";
		returned = MaximusDecimus.convertRoman(4*value);
		assertEquals(expected, returned);

		expected = "L";
		returned = MaximusDecimus.convertRoman(5*value);
		assertEquals(expected, returned);

		expected = "LC";
		returned = MaximusDecimus.convertRoman(6*value);
		assertEquals(expected, returned);

		expected = "LCC";
		returned = MaximusDecimus.convertRoman(value);
		assertEquals(expected, returned);

		expected = "CCXIV";
		returned = MaximusDecimus.convertRoman(214);
		assertEquals(expected, returned);
	}

}
