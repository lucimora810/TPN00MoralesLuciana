package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.Calculadora;
@Controller

public class CalculadorController {
	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		return "index";
	}
	@GetMapping("/calculoSuma")
	public String getSumaPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2,Model model) {
		int resultadoS=0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		nuevaCalculadora.sumaNumero();
		resultadoS=nuevaCalculadora.sumaNumero();
		model.addAttribute("resultadoS", resultadoS);
		return "resultadoS";
		
	}
	@GetMapping("/calculoResta")
	public String getRestaPage(@RequestParam(name = "n1")int n1,@RequestParam(name = "n2")int n2,Model model) {
		int resultadoR= 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		resultadoR=nuevaCalculadora.restNumero();
		model.addAttribute("resultadoR", resultadoR);
		return "resultadoR";
	}
	@GetMapping("/calculoDivision")
	public String getDivisionPage(@RequestParam(name = "n1")int n1,@RequestParam(name = "n2")int n2,Model model) {
		float resultadoD=0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		if(n2!=0) {
			resultadoD = nuevaCalculadora.divisionNumero();
			model.addAttribute("resultadoD", resultadoD);
			return "resultadoD";
		}else {
			return "resultadoDIncorrecta";
			
		}
	}
	@GetMapping("/calculoMultiplicacion")
	public String getMultiplicacionPage(@RequestParam(name = "n1")int n1,@RequestParam(name = "n2")int n2,Model model) {
		int resultadoM=0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		resultadoM=nuevaCalculadora.multiplicacionNumero();
		model.addAttribute("resultadoM", resultadoM);
		return "resultadosM";
	}
	@GetMapping("/calculoPotencia")
	public String getPotenciaPage(@RequestParam(name = "n1")int n1,@RequestParam(name = "n2")int n2,Model model) {
		int resultadoP=0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		resultadoP=nuevaCalculadora.potenciaNumero();
		model.addAttribute("resultadoP", resultadoP);
		return "resultadoP";
	}
	@GetMapping("/calculoRaiz")
	public String getRaizPage(@RequestParam(name = "n1")int n1,@RequestParam(name = "n2")int n2,Model model) {
		double resultadoRaiz=0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		if(n2!=0) {
			resultadoRaiz = nuevaCalculadora.raizNumero();
			model.addAttribute("resultadoRaiz", resultadoRaiz);
			return "resultadoRaiz";
		}else {
			return "resultadoRaizIncorrecta";
		}
	}

}
