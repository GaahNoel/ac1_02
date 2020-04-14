package com.example.ac1_02.controller;



import javax.validation.Valid;

import com.example.ac1_02.entity.Funcionario;
import com.example.ac1_02.service.ServicoFuncionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControleFuncionario {

    @Autowired
    ServicoFuncionario sf;
    
    
    @GetMapping("/")
    public ModelAndView listaFuncionarios()
    {
        ModelAndView mv = new ModelAndView("func");
        mv.addObject("funcionarios", sf.listaFuncionarios());
       
        return mv;
    }
    @PostMapping("/")
    public String cadastraFuncionario(@Valid @ModelAttribute Funcionario funcionarios, RedirectAttributes redirectAttributes)
    {
        boolean erro = sf.addFuncionario(funcionarios);
        
        if(erro)
            redirectAttributes.addFlashAttribute("erro","Erro na inserção, campos em branco ou CPF repetido !");
        return "redirect:/";

    }


}