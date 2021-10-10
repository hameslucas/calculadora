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
     @RequestParam String operando2,
     @RequestParam String resultado,
     @RequestParam String operador) 
     
     {

        Double operando1Double = Double.valueOf(operando1);
        Double operando2Double = Double.valueOf(operando2);
        Double resultadoDouble = Double.valueOf(resultado);

        switch (operador) {

            case '+':
            resultado = operando1Double + operando2Double;
              System.out.println(operando1Double + " + " + operando2Double + " = " + resultado);
              break;
      
            case '-':
            resultado = operando1Double - operando2Double;
              System.out.println(operando1Double + " - " + operando2Double + " = " + resultado);
              break;
      
            case '*':
            resultado = operando1Double * operando2Double;
              System.out.println(operando1Double + " * " + operando2Double + " = " + resultado);
              break;
      
            case '/':
            resultado = operando1Double / operando2Double;
              System.out.println(operando1Double + " / " + operando2Double + " = " + resultado);
              break;
      
            default:
              System.out.println("Operador desejado é inválido!");
              break;
          }

        ModelAndView modelAndView = new ModelAndView("resultado"); 
        modelAndView.addObject("texto_resultado", resultado);        
        return modelAndView;
    }
    
}
