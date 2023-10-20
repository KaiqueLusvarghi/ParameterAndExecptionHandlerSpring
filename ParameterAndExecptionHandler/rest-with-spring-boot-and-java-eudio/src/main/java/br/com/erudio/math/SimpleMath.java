package br.com.erudio.math;

public class SimpleMath {

	// ---------------------------------------------------------SOMA------------------------------------------------------------
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

	// ---------------------------------------------------------SUBTRAÇÃO------------------------------------------------------------

	public Double subtraction(Double numberOne, Double numberTwo) throws Exception {
		return numberOne - numberTwo;
	}
	// ----------------------------------------------------MULTIPLICAÇÃO-------------------------------------------------------------

	public Double multiplication(Double numberOne, Double numberTwo) throws Exception {
		return numberOne * numberTwo;
	}

	// --------------------------------------------------------------DIVISÃO---------------------------------------------------------------------

	public Double division(Double numberOne, Double numberTwo) throws Exception {
		return numberOne / numberTwo;
	}
	// ----------------------------------------------------------MÉDIA--------------------------------------------------------

	public Double average(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}

//------------------------------------------------- RAIZ QUADRADA ---------------------------------

	public Double square(Double number) {
		return Math.sqrt(number);
	}

}
