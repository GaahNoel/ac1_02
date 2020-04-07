package com.example.ac1_02.controller;

import com.example.ac1_02.entity.Funcionario;
import com.example.ac1_02.service.ServicoFuncionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView cadastraFuncionario(@ModelAttribute Funcionario funcionario)
    {
        ModelAndView mv = new ModelAndView("func");
        boolean cadastro = sf.addFuncionario(funcionario);
        mv.addObject("funcionarios", sf.listaFuncionarios());
        mv.addObject("cadastro",cadastro);
        return mv;

    }


}