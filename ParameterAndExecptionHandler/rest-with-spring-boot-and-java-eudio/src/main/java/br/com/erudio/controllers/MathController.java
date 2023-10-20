package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.ConvertNumber;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController // Uma combinacao da responseBody e controller
public class MathController {

	private AtomicLong counter = new AtomicLong();

	private SimpleMath math = new SimpleMath();

	// quando tenho que passar parametros obrigatorios, eu coloco eles entre as {},
	// pois se eu ñ passar, eu quebro a aplicação

	// @RequestMapping(value="/sum/{numberOne}/{numberTwo}",method=RequestMethod.GET)

	// @PathVariable é usada para recuperar dados da URL

	// ----------------------------------------------------------SOMA----------------------------------------
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)

	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.sum(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}

	// ---------------------------------------------------------SUBTRAÇÃO------------------------------------------------------------
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)

	// @PathVariable é usada para recuperar dados da URL
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.subtraction(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}

	// ----------------------------------------------------MULTIPLICAÇÃO-------------------------------------------------------------
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)

	// @PathVariable é usada para recuperar dados da URL
	public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.multiplication(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}

	// --------------------------------------------------------------DIVISÃO---------------------------------------------------------------------
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)

	// @PathVariable é usada para recuperar dados da URL
	public Double division(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.division(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}
	// ----------------------------------------------------------MÉDIA--------------------------------------------------------

	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)

	// @PathVariable é usada para recuperar dados da URL
	public Double average(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.average(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}

//------------------------------------------------- RAIZ QUADRADA ---------------------------------

	@RequestMapping(value = "/square/{number}", method = RequestMethod.GET)

// @PathVariable é usada para recuperar dados da URL
	public Double square(@PathVariable(value = "number") String number

	) throws Exception {

		if (!ConvertNumber.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.square(ConvertNumber.convertToDouble(number));
	}
//----------------------------------------------------------------------------------------------------
}