package br.edu.usj.ads.pw.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Calculadora {
    
    @PostMapping(value="calcular")
    public ModelAndView postCalcular
    (@RequestParam String operando1,
     @RequestParam String operando2) 
     
     {

        Double operando1Double = Double.valueOf(operando1);
        Double operando2Double = Double.valueOf(operando2);

        Double resultadoOperacao = operando1Double+operando2Double;

        String operacao = operando1 + " + " + operando2 + " = " + resultadoOperacao;

        ModelAndView modelAndView = new ModelAndView("resultado"); 
        modelAndView.addObject("texto_resultado", operacao);        
        return modelAndView;
    }
    
}
